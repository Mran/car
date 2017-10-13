package com.tianran.car.carbymark;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.tianran.car.R;
import com.tianran.car.carbymark.presenter.CarByMarkPresenetrcompl;
import com.tianran.car.carbymark.view.CarBymarkActivityView;
import com.tianran.car.carsearch.modle.CarSearchItemEntity;
import com.tianran.car.carsearch.modle.SearchAdapter;
import com.tianran.car.carsearch.modle.SearchAdapter.OnRecyclerItemClickedListener;
import com.tianran.car.carsummerydetail.CarSummeryDetailActivity;
import com.tianran.car.main.view.RecycleviewItemDecoration;
import com.wuxiaolong.pullloadmorerecyclerview.PullLoadMoreRecyclerView;
import com.wuxiaolong.pullloadmorerecyclerview.PullLoadMoreRecyclerView.PullLoadMoreListener;
import java.util.List;

public class CarByMarkActivity extends AppCompatActivity implements CarBymarkActivityView, OnRecyclerItemClickedListener, PullLoadMoreListener {
    private CarByMarkPresenetrcompl carByMarkPresenetrcompl;
    private boolean isloadmore = false;
    private int mark;
    private int pagecount;
    private int pageindex = 1;
    private PullLoadMoreRecyclerView pullLoadMoreRecyclerView;
    private SearchAdapter searchAdapter;
    private Toolbar toolbar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_car_search_detail);
        this.mark = getIntent().getIntExtra("mark", 14);
        initData();
        bindView();
        initView();
    }

    void initData() {
        this.carByMarkPresenetrcompl = new CarByMarkPresenetrcompl(this, this);
    }

    void bindView() {
        this.pullLoadMoreRecyclerView = (PullLoadMoreRecyclerView) findViewById(R.id.activity_car_search_detail_recycle);
        this.toolbar = (Toolbar) findViewById(R.id.activity_car_search_detail_toolbar);
    }

    void initView() {
        setSupportActionBar(this.toolbar);
        this.toolbar.setTitleTextColor(ContextCompat.getColor(this, R.color.white));
        this.toolbar.setNavigationIcon(ContextCompat.getDrawable(this, R.drawable.ic_71_interface_label_close));
        this.toolbar.setNavigationOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                CarByMarkActivity.this.finish();
            }
        });
        this.searchAdapter = new SearchAdapter(this);
        this.searchAdapter.setOnRecyclerItemClickListener(this);
        this.pullLoadMoreRecyclerView.setAdapter(this.searchAdapter);
        this.pullLoadMoreRecyclerView.setLinearLayout();
        this.pullLoadMoreRecyclerView.setOnPullLoadMoreListener(this);
        this.pullLoadMoreRecyclerView.addItemDecoration(new RecycleviewItemDecoration(this, 0.0d));
    }

    void getSearch() {
        this.carByMarkPresenetrcompl.getCarByMark(this.pageindex, this.mark);
    }

    protected void onResume() {
        super.onResume();
    }

    protected void onStart() {
        super.onStart();
        setTitle("用途选车");
        getSearch();
    }

    public void ShowResult(List<CarSearchItemEntity> carSearchItemEntities, int pagecount) {
        this.pullLoadMoreRecyclerView.setRefreshing(false);
        this.pullLoadMoreRecyclerView.setPullLoadMoreCompleted();
        this.pagecount = pagecount;
        this.searchAdapter.adddata(this.isloadmore, carSearchItemEntities);
    }

    public void showMessage(String message) {
        Toast.makeText(this, message, 0).show();
    }

    public void onItemClick(View view, int position, CarSearchItemEntity carSearchItemEntity) {
        Intent intent = new Intent(this, CarSummeryDetailActivity.class);
        intent.putExtra("id", carSearchItemEntity.getId());
        startActivity(intent);
    }

    public void onRefresh() {
        this.pageindex = 1;
        this.isloadmore = false;
        getSearch();
    }

    public void onLoadMore() {
        if (this.pageindex < this.pagecount) {
            this.pageindex++;
            Toast.makeText(this, "正在加载", 0).show();
            this.isloadmore = true;
            getSearch();
            return;
        }
        this.pullLoadMoreRecyclerView.setPullLoadMoreCompleted();
        Toast.makeText(this, "已全部加载", 0).show();
    }
}
