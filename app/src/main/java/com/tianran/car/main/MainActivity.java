package com.tianran.car.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import cn.ittiger.indexlist.IndexStickyView;
import cn.ittiger.indexlist.listener.OnItemClickListener;
import com.tianran.car.R;
import com.tianran.car.carbranddetail.CarBrandDetailActivity;
import com.tianran.car.carbymark.CarByMarkActivity;
import com.tianran.car.carsearch.CarSearchActivity;
import com.tianran.car.main.modle.CarBrandAdapter;
import com.tianran.car.main.modle.CarBrandEntity;
import com.tianran.car.main.presenter.MainPresenetrcompl;
import com.tianran.car.main.view.MainActivityView;
import com.tianran.car.main.view.RecycleviewItemDecoration;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainActivityView, OnItemClickListener, OnClickListener {
    private ImageView filterImageView;
    private IndexStickyView indexStickyView;
    private CarBrandAdapter mCarBrandAdapter;
    private Button mChuangye;
    private Button mJujiabibei;
    private Button mLaoban;
    private Button mLiaomei;
    private Button mShiyong;
    private Button mXinnengyuan;
    private MainPresenetrcompl mainPresenetrcompl;
    private Toolbar toolbar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main);
        initData();
        bindView();
        initView();
    }

    void initData() {
        this.mainPresenetrcompl = new MainPresenetrcompl(this, this);
        this.mCarBrandAdapter = new CarBrandAdapter(this.mainPresenetrcompl.getmCarBrandEntityList(), this);
        this.mainPresenetrcompl.getAllBrands();
    }

    void bindView() {
        this.indexStickyView = (IndexStickyView) findViewById(R.id.activity_main_indexsrtcikyview);
        this.toolbar = (Toolbar) findViewById(R.id.activity_main_toolbar);
        this.filterImageView = (ImageView) findViewById(R.id.activity_main_filter_iv);
        this.mCarBrandAdapter.setOnItemClickListener(this);
    }

    void initView() {
        setSupportActionBar(this.toolbar);
        this.filterImageView.setOnClickListener(this);
        this.indexStickyView.setAdapter(this.mCarBrandAdapter);
        this.indexStickyView.addItemDecoration(new RecycleviewItemDecoration(this, 20.0d));
        this.mJujiabibei = (Button) findViewById(R.id.jujiabibei);
        this.mJujiabibei.setOnClickListener(this);
        this.mShiyong = (Button) findViewById(R.id.shiyong);
        this.mShiyong.setOnClickListener(this);
        this.mChuangye = (Button) findViewById(R.id.chuangye);
        this.mChuangye.setOnClickListener(this);
        this.mXinnengyuan = (Button) findViewById(R.id.xinnengyuan);
        this.mXinnengyuan.setOnClickListener(this);
        this.mLaoban = (Button) findViewById(R.id.laoban);
        this.mLaoban.setOnClickListener(this);
        this.mLiaomei = (Button) findViewById(R.id.liaomei);
        this.mLiaomei.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.activity_main_filter_iv:
                startActivity(new Intent(this, CarSearchActivity.class));
                return;
            case R.id.shiyong:
                Intent intent2 = new Intent(this, CarByMarkActivity.class);
                intent2.putExtra("mark", 25);
                startActivity(intent2);
                return;
            case R.id.jujiabibei:
                Intent intent1 = new Intent(this, CarByMarkActivity.class);
                intent1.putExtra("mark", 14);
                startActivity(intent1);
                return;
            case R.id.chuangye:
                Intent intent3 = new Intent(this, CarByMarkActivity.class);
                intent3.putExtra("mark", 43);
                startActivity(intent3);
                return;
            case R.id.laoban:
                Intent intent5 = new Intent(this, CarByMarkActivity.class);
                intent5.putExtra("mark", 40);
                startActivity(intent5);
                return;
            case R.id.xinnengyuan:
                Intent intent4 = new Intent(this, CarByMarkActivity.class);
                intent4.putExtra("mark", 16);
                startActivity(intent4);
                return;
            case R.id.liaomei:
                Intent intent6 = new Intent(this, CarByMarkActivity.class);
                intent6.putExtra("mark", 21);
                startActivity(intent6);
                return;
            default:
                return;
        }
    }

    public void showResult(List<CarBrandEntity> carBrandInfos) {
        this.mCarBrandAdapter.clear();
        this.mCarBrandAdapter.add((List) carBrandInfos);
        this.mCarBrandAdapter.notifyDataSetChanged();
    }

    public void showMessage(String message) {
        Toast.makeText(this, message, 0).show();
    }

    public void onItemClick(View childView, int position, Object item) {
        CarBrandEntity carBrandEntity = (CarBrandEntity) item;
        Toast.makeText(this, carBrandEntity.getBrand(), 0).show();
        Intent intent = new Intent(this, CarBrandDetailActivity.class);
        intent.putExtra("id", carBrandEntity.getId());
        intent.putExtra("name", carBrandEntity.getBrand());
        startActivity(intent);
    }
}
