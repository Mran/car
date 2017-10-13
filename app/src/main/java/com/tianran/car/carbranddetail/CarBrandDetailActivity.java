package com.tianran.car.carbranddetail;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import cn.ittiger.indexlist.IndexStickyView;
import cn.ittiger.indexlist.listener.OnItemClickListener;
import com.tianran.car.R;
import com.tianran.car.carbranddetail.modle.CarBrandDeatilEntity;
import com.tianran.car.carbranddetail.modle.CarBrandDetailAdapter;
import com.tianran.car.carbranddetail.modle.CarBrandDetailEntityWrapper;
import com.tianran.car.carbranddetail.modle.CarBrandHeadAdapter;
import com.tianran.car.carbranddetail.presenter.CarBrandDetailPresenterCompl;
import com.tianran.car.carbranddetail.view.ICarBrandDetailActivityView;
import com.tianran.car.carsummerydetail.CarSummeryDetailActivity;
import com.tianran.car.main.view.RecycleviewItemDecoration;
import java.util.ArrayList;
import java.util.List;

public class CarBrandDetailActivity extends AppCompatActivity implements ICarBrandDetailActivityView, OnClickListener, OnItemClickListener {
    private CollapsingToolbarLayout collapsingToolbarLayout;
    private String id;
    private IndexStickyView indexStickyView;
    private CarBrandDetailAdapter mCarBrandDetailAdapter;
    private CarBrandDetailPresenterCompl mCarBrandDetailPresenterCompl;
    private String name;
    private Toolbar toolbar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_car_brand_detail);
        Intent intent = getIntent();
        this.id = intent.getStringExtra("id");
        this.name = intent.getStringExtra("name");
        initData();
        bindView();
        initView();
    }

    void initData() {
        this.mCarBrandDetailPresenterCompl = new CarBrandDetailPresenterCompl(this, this);
        this.mCarBrandDetailAdapter = new CarBrandDetailAdapter(new ArrayList(), this);
        this.mCarBrandDetailPresenterCompl.getCarBrandDeatail(this.id);
    }

    void bindView() {
        this.indexStickyView = (IndexStickyView) findViewById(R.id.activity_car_brand_detail_indexsrtcikyview);
        this.toolbar = (Toolbar) findViewById(R.id.activity_car_brand_detail_toolbar);
        this.mCarBrandDetailAdapter.setOnItemClickListener(this);
    }

    void initView() {
        setSupportActionBar(this.toolbar);
        this.toolbar.setNavigationIcon(ContextCompat.getDrawable(this, R.drawable.ic_71_interface_label_close));
        this.toolbar.setTitleTextColor(ContextCompat.getColor(this, R.color.white));
        this.toolbar.setTitle(this.name);
        this.toolbar.setNavigationOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                CarBrandDetailActivity.this.finish();
            }
        });
        this.indexStickyView.setAdapter(this.mCarBrandDetailAdapter);
        this.indexStickyView.addItemDecoration(new RecycleviewItemDecoration(this, 0.0d));
    }

    public void onClick(View v) {
    }

    public void showResult(List<CarBrandDetailEntityWrapper> carBrandDetailEntityWrappers) {
        this.toolbar.setTitle(((CarBrandDetailEntityWrapper) carBrandDetailEntityWrappers.get(0)).getBrandName());
        for (int i = carBrandDetailEntityWrappers.size() - 1; i >= 0; i--) {
            CarBrandDetailEntityWrapper c = (CarBrandDetailEntityWrapper) carBrandDetailEntityWrappers.get(i);
            CarBrandHeadAdapter carBrandHeadAdapter = new CarBrandHeadAdapter(this, "", c.getSummeryName(), c.getBrandDeatilEntities());
            this.indexStickyView.addIndexHeaderAdapter(carBrandHeadAdapter);
            carBrandHeadAdapter.setOnItemClickListener(this);
        }
    }

    public void showMessage(String message) {
        Toast.makeText(this, message, 0).show();
    }

    public void onItemClick(View childView, int position, Object item) {
        CarBrandDeatilEntity carBrandEntity = (CarBrandDeatilEntity) item;
        Toast.makeText(this, carBrandEntity.getCarName(), 0).show();
        Intent intent = new Intent(this, CarSummeryDetailActivity.class);
        intent.putExtra("id", carBrandEntity.getId());
        startActivity(intent);
    }
}
