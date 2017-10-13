package com.tianran.car.carsearch.modle;

import android.content.Context;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import cn.ittiger.indexlist.adapter.IndexHeaderFooterAdapter;
import com.bumptech.glide.Glide;
import com.tianran.car.R;
import java.util.List;

public class CarSearchItemAdapter extends IndexHeaderFooterAdapter<CarSearchItemEntity> {
    Context mContext;

    private class CarConfigHolder extends ViewHolder {
        public ImageView car_search_item_img;
        public TextView car_search_item_name;
        public TextView car_search_item_price;
        public View rootView;

        public CarConfigHolder(View rootView) {
            super(rootView);
            this.rootView = rootView;
            this.car_search_item_img = (ImageView) rootView.findViewById(R.id.car_search_item_img);
            this.car_search_item_name = (TextView) rootView.findViewById(R.id.car_search_item_name);
            this.car_search_item_price = (TextView) rootView.findViewById(R.id.car_search_item_price);
        }
    }

    public CarSearchItemAdapter(String indexValue, String indexName, List list, Context context) {
        super(indexValue, indexName, list);
        this.mContext = context;
    }

    public ViewHolder onCreateViewHolder(ViewGroup parent) {
        return new CarConfigHolder(LayoutInflater.from(this.mContext).inflate(R.layout.car_search_item, parent, false));
    }

    public void onBindViewHolder(ViewHolder holder, int position, CarSearchItemEntity carSearchItemEntity) {
        CarConfigHolder carConfigHolder = (CarConfigHolder) holder;
        Glide.with(this.mContext).load(carSearchItemEntity.getImgUrl()).into(carConfigHolder.car_search_item_img);
        carConfigHolder.car_search_item_name.setText(carSearchItemEntity.getName());
        carConfigHolder.car_search_item_price.setText(carSearchItemEntity.getPrice());
    }
}
