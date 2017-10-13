package com.tianran.car.carconfig;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;
import cn.ittiger.indexlist.IndexStickyView;
import cn.ittiger.indexlist.listener.OnItemClickListener;
import com.tianran.car.R;
import com.tianran.car.carconfig.modle.CarConfigAdapter;
import com.tianran.car.carconfig.modle.CarConfigEntity;
import com.tianran.car.carconfig.presenter.CarConfigPresenterCompl;
import com.tianran.car.carconfig.view.ICarConfigActivityView;
import com.tianran.car.main.modle.CarBrandAdapter;
import com.tianran.car.main.modle.CarBrandEntity;
import com.tianran.car.main.view.RecycleviewItemDecoration;
import java.util.ArrayList;
import java.util.List;

public class CarConfigActivity extends AppCompatActivity implements ICarConfigActivityView, OnClickListener, OnItemClickListener {
    private CarBrandAdapter carBrandAdapter;
    private String id;
    private IndexStickyView indexStickyView;
    private CarConfigPresenterCompl mCarConfigPresenterCompl;
    private TextView nameTextView;
    List<CarBrandEntity> originalList = new ArrayList();
    private Toolbar toolbar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_car_config);
        this.id = getIntent().getStringExtra("id");
        initData();
        bindView();
        initView();
    }

    void initData() {
        this.mCarConfigPresenterCompl = new CarConfigPresenterCompl(this, this);
        this.carBrandAdapter = new CarBrandAdapter(this.originalList, this);
    }

    void bindView() {
        this.indexStickyView = (IndexStickyView) findViewById(R.id.activity_car_config_indexsrtcikyview);
        this.toolbar = (Toolbar) findViewById(R.id.activity_car_config_toolbar);
        this.nameTextView = (TextView) findViewById(R.id.activity_car_config_name);
    }

    void initView() {
        setSupportActionBar(this.toolbar);
        setTitle("参数配置");
        this.toolbar.setNavigationIcon(ContextCompat.getDrawable(this, R.drawable.ic_71_interface_label_close));
        this.toolbar.setNavigationOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                CarConfigActivity.this.finish();
            }
        });
        this.indexStickyView.setAdapter(this.carBrandAdapter);
        this.indexStickyView.addItemDecoration(new RecycleviewItemDecoration(this, 0.0d));
        this.indexStickyView.setOnClickListener(this);
    }

    protected void onResume() {
        super.onResume();
        this.mCarConfigPresenterCompl.getCarConfig(this.id);
    }

    public void onClick(View v) {
    }

    public void showResult(List<CarConfigEntity> carConfigEntities, String name) {
        this.nameTextView.setText(name);
        this.toolbar.setTitleTextColor(ContextCompat.getColor(this, R.color.white));
        for (int i = carConfigEntities.size() - 1; i >= 0; i--) {
            CarConfigEntity c = (CarConfigEntity) carConfigEntities.get(i);
            this.indexStickyView.addIndexHeaderAdapter(new CarConfigAdapter(c.getIndexField(), c.getItemType(), c.getCarConfigitems(), this));
        }
    }

    public void showMessage(String message) {
        Toast.makeText(this, message, 0).show();
    }

    public void onItemClick(View childView, int position, Object item) {
    }
}
