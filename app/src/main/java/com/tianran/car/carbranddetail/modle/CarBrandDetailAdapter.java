package com.tianran.car.carbranddetail.modle;

import android.content.Context;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import cn.ittiger.indexlist.adapter.IndexStickyViewAdapter;
import com.bumptech.glide.Glide;
import com.tianran.car.R;
import java.util.List;

public class CarBrandDetailAdapter extends IndexStickyViewAdapter<CarBrandDeatilEntity> {
    private List<CarBrandDeatilEntity> mCarBrandLists;
    private Context mContext;

    private class CarBrandDetailHolder extends ViewHolder {
        ImageView brandImageView;
        TextView brandTextview;
        TextView priceTextView;
        View view;

        public CarBrandDetailHolder(View itemView) {
            super(itemView);
            this.brandImageView = (ImageView) itemView.findViewById(R.id.car_detail_recycleview_item_car_img);
            this.brandTextview = (TextView) itemView.findViewById(R.id.car_detail_recycleview_item_car_name);
            this.priceTextView = (TextView) itemView.findViewById(R.id.car_detail_recycleview_item_car_price);
            this.view = itemView;
        }
    }

    class IndexViewHolder extends ViewHolder {
        TextView mTextView;

        public IndexViewHolder(View itemView) {
            super(itemView);
            this.mTextView = (TextView) itemView.findViewById(R.id.tv_index);
        }
    }

    public CarBrandDetailAdapter(List<CarBrandDeatilEntity> originalList, Context context) {
        super(originalList);
        this.mContext = context;
        this.mCarBrandLists = originalList;
    }

    public ViewHolder onCreateIndexViewHolder(ViewGroup parent) {
        return new IndexViewHolder(LayoutInflater.from(this.mContext).inflate(R.layout.side_index, parent, false));
    }

    public ViewHolder onCreateContentViewHolder(ViewGroup parent) {
        return new CarBrandDetailHolder(LayoutInflater.from(this.mContext).inflate(R.layout.car_series_recycleview_item, parent, false));
    }

    public void onBindIndexViewHolder(ViewHolder holder, int position, String indexName) {
        ((IndexViewHolder) holder).mTextView.setText(indexName);
    }

    public void onBindContentViewHolder(ViewHolder holder, int position, CarBrandDeatilEntity itemData) {
        CarBrandDetailHolder carBrandHolder = (CarBrandDetailHolder) holder;
        carBrandHolder.brandTextview.setText(itemData.getCarName());
        carBrandHolder.priceTextView.setText(itemData.getPrice());
        Glide.with(this.mContext).load(itemData.getBrandImgUrl()).centerCrop().crossFade().into(carBrandHolder.brandImageView);
    }
}
