package com.tianran.car.carsummerydetail;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import cn.ittiger.indexlist.IndexStickyView;
import cn.ittiger.indexlist.listener.OnItemClickListener;
import com.bumptech.glide.Glide;
import com.tianran.car.R;
import com.tianran.car.carconfig.CarConfigActivity;
import com.tianran.car.carsummerydetail.modle.CarSummeryAdapter;
import com.tianran.car.carsummerydetail.modle.CarSummeryBaseInfo;
import com.tianran.car.carsummerydetail.modle.CarSummeryEntity;
import com.tianran.car.carsummerydetail.modle.EngineBean;
import com.tianran.car.carsummerydetail.presenter.CarSummeryDetailPresenterCompl;
import com.tianran.car.carsummerydetail.view.ICarSummeryDetailActivityView;
import com.tianran.car.main.modle.CarBrandAdapter;
import com.tianran.car.main.modle.CarBrandEntity;
import com.tianran.car.main.view.RecycleviewItemDecoration;
import java.util.ArrayList;
import java.util.List;

public class CarSummeryDetailActivity extends AppCompatActivity implements ICarSummeryDetailActivityView, OnClickListener, OnItemClickListener {
    private ImageView carBgImageView;
    private CarBrandAdapter carBrandAdapter;
    private TextView carTypeTv;
    private CollapsingToolbarLayout collapsingToolbarLayout;
    private String id;
    private IndexStickyView indexStickyView;
    private CarSummeryDetailPresenterCompl mCarSummeryDetailPresenterCompl;
    private TextView nameTextview;
    List<CarBrandEntity> originalList = new ArrayList();
    private TextView priceTextview;
    private Toolbar toolbar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_car_summery_detail);
        this.id = getIntent().getStringExtra("id");
        initData();
        bindView();
        initView();
    }

    void initData() {
        this.mCarSummeryDetailPresenterCompl = new CarSummeryDetailPresenterCompl(this, this);
        this.mCarSummeryDetailPresenterCompl.getCarSummeryDetail(this.id);
        this.carBrandAdapter = new CarBrandAdapter(this.originalList, this);
    }

    void bindView() {
        this.nameTextview = (TextView) findViewById(R.id.car_summery_detail_car_name);
        this.priceTextview = (TextView) findViewById(R.id.car_summery_detail_price_pct);
        this.carTypeTv = (TextView) findViewById(R.id.car_summery_detail_car_type);
        this.carBgImageView = (ImageView) findViewById(R.id.activity_car_summery_detail_img);
        this.indexStickyView = (IndexStickyView) findViewById(R.id.activity_car_summery_detail_indexstickyview);
        this.toolbar = (Toolbar) findViewById(R.id.activity_car_summery_detail_toolbar);
        this.collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.activity_car_summery_detail_CollapsingToolbarLayout);
    }

    void initView() {
        setSupportActionBar(this.toolbar);
        this.toolbar.setNavigationIcon(ContextCompat.getDrawable(this, R.drawable.ic_71_interface_label_close));
        this.toolbar.setNavigationOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                CarSummeryDetailActivity.this.finish();
            }
        });
        this.collapsingToolbarLayout.setTitleEnabled(false);
        this.indexStickyView.setAdapter(this.carBrandAdapter);
        this.indexStickyView.addItemDecoration(new RecycleviewItemDecoration(this, 0.0d));
        this.indexStickyView.setOnClickListener(this);
    }

    public void onClick(View v) {
        int id = v.getId();
    }

    public void showResult(List<EngineBean> engineBeanList) {
        for (int i = engineBeanList.size() - 1; i >= 0; i--) {
            EngineBean e = (EngineBean) engineBeanList.get(i);
            CarSummeryAdapter csa = new CarSummeryAdapter("", e.getName(), e.getCarSummeryEntityList(), this);
            csa.setOnItemClickListener(this);
            this.indexStickyView.addIndexHeaderAdapter(csa);
        }
    }

    public void showBaseInfo(CarSummeryBaseInfo carSummeryBaseInfo) {
        this.toolbar.setTitle(carSummeryBaseInfo.getName());
        this.toolbar.setTitleTextColor(ContextCompat.getColor(this, R.color.white));
        this.nameTextview.setText(carSummeryBaseInfo.getName());
        this.priceTextview.setText(carSummeryBaseInfo.getFctPrice());
        this.carTypeTv.setText(carSummeryBaseInfo.getLevelname() + carSummeryBaseInfo.getPower());
        Glide.with((FragmentActivity) this).load(carSummeryBaseInfo.getLogoUrl()).crossFade().into(this.carBgImageView);
    }

    public void showMessage(String message) {
        Toast.makeText(this, message, 0).show();
    }

    public void onItemClick(View childView, int position, Object item) {
        CarSummeryEntity c = (CarSummeryEntity) item;
        Toast.makeText(this, c.getName(), 0).show();
        Intent intnt = new Intent(this, CarConfigActivity.class);
        intnt.putExtra("id", c.getId());
        startActivity(intnt);
    }
}
