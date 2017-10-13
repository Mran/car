package com.tianran.car.main.modle;

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

public class CarBrandAdapter extends IndexStickyViewAdapter<CarBrandEntity> {
    private List<CarBrandEntity> mCarBrandLists;
    private Context mContext;

    class CarBrandHolder extends ViewHolder {
        ImageView brandImageView;
        TextView textView;
        View view;

        public CarBrandHolder(View itemView) {
            super(itemView);
            this.brandImageView = (ImageView) itemView.findViewById(R.id.home_recycleview_item_car_logo);
            this.textView = (TextView) itemView.findViewById(R.id.home_recycleview_item_car_name);
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

    public CarBrandAdapter(List<CarBrandEntity> originalList, Context context) {
        super(originalList);
        this.mContext = context;
        this.mCarBrandLists = originalList;
    }

    public ViewHolder onCreateIndexViewHolder(ViewGroup parent) {
        return new IndexViewHolder(LayoutInflater.from(this.mContext).inflate(R.layout.side_index, parent, false));
    }

    public ViewHolder onCreateContentViewHolder(ViewGroup parent) {
        return new CarBrandHolder(LayoutInflater.from(this.mContext).inflate(R.layout.home_recycleview_item, parent, false));
    }

    public void onBindIndexViewHolder(ViewHolder holder, int position, String indexName) {
        ((IndexViewHolder) holder).mTextView.setText(indexName);
    }

    public void onBindContentViewHolder(ViewHolder holder, int position, CarBrandEntity itemData) {
        CarBrandHolder carBrandHolder = (CarBrandHolder) holder;
        carBrandHolder.textView.setText(itemData.getBrand());
        Glide.with(this.mContext).load(itemData.getBrandImg()).centerCrop().crossFade().into(carBrandHolder.brandImageView);
    }
}
