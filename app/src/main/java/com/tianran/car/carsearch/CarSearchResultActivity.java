package com.tianran.car.carsearch;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v4.util.ArrayMap;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import cn.ittiger.indexlist.listener.OnItemClickListener;
import com.tianran.car.R;
import com.tianran.car.carsearch.modle.CarSearchItemEntity;
import com.tianran.car.carsearch.modle.SearchAdapter;
import com.tianran.car.carsearch.modle.SearchAdapter.OnRecyclerItemClickedListener;
import com.tianran.car.carsearch.presenter.CarSearchPresenterCompl;
import com.tianran.car.carsearch.view.ICarSearchActivityView;
import com.tianran.car.carsummerydetail.CarSummeryDetailActivity;
import com.tianran.car.main.modle.CarBrandAdapter;
import com.tianran.car.main.modle.CarBrandEntity;
import com.tianran.car.main.view.RecycleviewItemDecoration;
import com.wuxiaolong.pullloadmorerecyclerview.PullLoadMoreRecyclerView;
import com.wuxiaolong.pullloadmorerecyclerview.PullLoadMoreRecyclerView.PullLoadMoreListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CarSearchResultActivity extends AppCompatActivity implements ICarSearchActivityView, OnItemClickListener, OnRecyclerItemClickedListener, PullLoadMoreListener {
    private String attribute = "0";
    private String bids = "";
    private CarBrandAdapter carBrandAdapter;
    private String cids = "";
    private String configs = "";
    private String drives = "";
    private String dsc = "";
    private String fids = "";
    private String flowmode = "";
    private String gs = "";
    private String id;
    private boolean isloadmore = false;
    private String levels = "";
    private CarSearchPresenterCompl mCarSearchPresenterCompl;
    private Map<String, String> maps = new ArrayMap();
    private String maxp = "0";
    private String minp = "0";
    private String order = "2";
    List<CarBrandEntity> originalList = new ArrayList();
    private int pagecount;
    private int pageindex = 1;
    private String params;
    private String pindex = "1";
    private String pm = "2";
    private String psize = "20";
    private PullLoadMoreRecyclerView pullLoadMoreRecyclerView;
    private SearchAdapter searchAdapter;
    private String seats = "";
    private String sts = "";
    private Toolbar toolbar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_car_search_detail);
        Intent intent = getIntent();
        this.id = intent.getStringExtra("id");
        this.pm = intent.getStringExtra("pm");
        this.minp = intent.getStringExtra("minp");
        this.maxp = intent.getStringExtra("maxp");
        this.levels = intent.getStringExtra("levels");
        this.cids = intent.getStringExtra("cids");
        this.gs = intent.getStringExtra("gs");
        this.sts = intent.getStringExtra("sts");
        this.dsc = intent.getStringExtra("dsc");
        this.configs = intent.getStringExtra("configs");
        this.order = intent.getStringExtra("order");
        this.pindex = intent.getStringExtra("pindex");
        this.psize = intent.getStringExtra("psize");
        this.bids = intent.getStringExtra("bids");
        this.fids = intent.getStringExtra("fids");
        this.drives = intent.getStringExtra("drives");
        this.seats = intent.getStringExtra("seats");
        this.attribute = intent.getStringExtra("attribute");
        this.flowmode = intent.getStringExtra("flowmode");
        this.params = intent.getStringExtra("params");
        initData();
        bindView();
        initView();
    }

    void initData() {
        this.mCarSearchPresenterCompl = new CarSearchPresenterCompl(this, this);
        this.carBrandAdapter = new CarBrandAdapter(this.originalList, this);
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
                CarSearchResultActivity.this.finish();
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
        this.maps.put("pm", this.pm);
        this.maps.put("minp", this.minp);
        this.maps.put("maxp", this.maxp);
        this.maps.put("levels", this.levels);
        this.maps.put("cids", this.cids);
        this.maps.put("gs", this.gs);
        this.maps.put("sts", this.sts);
        this.maps.put("dsc", this.dsc);
        this.maps.put("configs", this.configs);
        this.maps.put("order", this.order);
        this.maps.put("pindex", this.pindex);
        this.maps.put("psize", this.psize);
        this.maps.put("bids", this.bids);
        this.maps.put("fids", this.fids);
        this.maps.put("drives", this.drives);
        this.maps.put("seats", this.seats);
        this.maps.put("attribute", this.attribute);
        this.maps.put("flowmode", this.flowmode);
        this.mCarSearchPresenterCompl.getSearch(this.maps);
    }

    protected void onResume() {
        super.onResume();
    }

    protected void onStart() {
        super.onStart();
        setTitle("搜索结果");
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

    public void onItemClick(View childView, int position, Object item) {
    }

    public void onItemClick(View view, int position, CarSearchItemEntity carSearchItemEntity) {
        Intent intent = new Intent(this, CarSummeryDetailActivity.class);
        intent.putExtra("id", carSearchItemEntity.getId());
        startActivity(intent);
    }

    public void onRefresh() {
        this.pindex = "1";
        this.isloadmore = false;
        getSearch();
    }

    public void onLoadMore() {
        if (this.pageindex < this.pagecount) {
            this.pageindex++;
            this.pindex = String.valueOf(this.pageindex);
            Toast.makeText(this, "正在加载", 0).show();
            this.isloadmore = true;
            getSearch();
            return;
        }
        this.pullLoadMoreRecyclerView.setPullLoadMoreCompleted();
        Toast.makeText(this, "已全部加载", 0).show();
    }
}
