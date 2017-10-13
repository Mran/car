package com.tianran.car.carsearch;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import cn.ittiger.indexlist.IndexStickyView;
import cn.ittiger.indexlist.listener.OnItemClickListener;
import com.tianran.car.R;
import com.tianran.car.carsearch.modle.CarSelectBrandAdapter;
import com.tianran.car.main.modle.CarBrandEntity;
import com.tianran.car.main.presenter.MainPresenetrcompl;
import com.tianran.car.main.view.MainActivityView;
import com.tianran.car.main.view.RecycleviewItemDecoration;
import java.util.List;

public class CarSelectActivity extends AppCompatActivity implements MainActivityView, OnItemClickListener, OnClickListener {
    private Toolbar activity_select__toolbar;
    private IndexStickyView activity_select_indexsrtcikyview;
    private CarSelectBrandAdapter carSelectBrandAdapter;
    List<CarBrandEntity> mCarBrandInfos;
    private MainPresenetrcompl mainPresenetrcompl;
    private Button select_enter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_select_brand);
        initData();
        bindView();
        initView();
    }

    void initData() {
        this.mainPresenetrcompl = new MainPresenetrcompl(this, this);
        this.carSelectBrandAdapter = new CarSelectBrandAdapter(this.mainPresenetrcompl.getmCarBrandEntityList(), this);
    }

    void bindView() {
        this.carSelectBrandAdapter.setOnItemClickListener(this);
        this.activity_select__toolbar = (Toolbar) findViewById(R.id.activity_select__toolbar);
        this.activity_select_indexsrtcikyview = (IndexStickyView) findViewById(R.id.activity_select_indexsrtcikyview);
        this.select_enter = (Button) findViewById(R.id.select_enter);
    }

    void initView() {
        setSupportActionBar(this.activity_select__toolbar);
        this.activity_select_indexsrtcikyview.setAdapter(this.carSelectBrandAdapter);
        this.activity_select_indexsrtcikyview.addItemDecoration(new RecycleviewItemDecoration(this, 20.0d));
        this.activity_select__toolbar.setTitleTextColor(ContextCompat.getColor(this, R.color.white));
        this.activity_select__toolbar.setNavigationIcon(ContextCompat.getDrawable(this, R.drawable.ic_71_interface_label_close));
        this.activity_select__toolbar.setNavigationOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                CarSelectActivity.this.finish();
            }
        });
        this.select_enter.setOnClickListener(this);
    }

    protected void onStart() {
        super.onStart();
        this.mainPresenetrcompl.getAllBrands();
    }

    public void showResult(List<CarBrandEntity> carBrandInfos) {
        this.mCarBrandInfos = carBrandInfos;
        this.carSelectBrandAdapter.clear();
        this.carSelectBrandAdapter.add((List) carBrandInfos);
        this.carSelectBrandAdapter.notifyDataSetChanged();
    }

    public void showMessage(String message) {
        Toast.makeText(this, message, 0).show();
    }

    public void onItemClick(View childView, int position, Object item) {
        CarBrandEntity carBrandEntity = (CarBrandEntity) item;
        carBrandEntity.setChecked(!carBrandEntity.isChecked());
        this.carSelectBrandAdapter.notifyDataSetChanged();
    }

    private String getSelectedBrand() {
        StringBuilder stringBuilder = new StringBuilder();
        for (CarBrandEntity c : this.mCarBrandInfos) {
            if (c.isChecked()) {
                stringBuilder.append(c.getId().substring(1)).append(",");
            }
        }
        return stringBuilder.toString();
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.select_enter:
                Intent intent = new Intent();
                intent.putExtra("bids", getSelectedBrand());
                setResult(100, intent);
                finish();
                return;
            default:
                return;
        }
    }
}
