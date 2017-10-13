package com.tianran.car.carsearch.modle;

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
import com.tianran.car.main.modle.CarBrandEntity;
import java.util.List;

public class CarSelectBrandAdapter extends IndexStickyViewAdapter<CarBrandEntity> {
    private List<CarBrandEntity> mCarBrandLists;
    private Context mContext;

    class CarBrandHolder extends ViewHolder {
        public ImageView car_search_brand_checked_item;
        public ImageView car_search_brand_log_item;
        public TextView car_search_brand_name_item;
        public View rootView;

        public CarBrandHolder(View rootView) {
            super(rootView);
            this.rootView = rootView;
            this.car_search_brand_checked_item = (ImageView) rootView.findViewById(R.id.car_search_brand_checked_item);
            this.car_search_brand_log_item = (ImageView) rootView.findViewById(R.id.car_search_brand_log_item);
            this.car_search_brand_name_item = (TextView) rootView.findViewById(R.id.car_search_brand_name_item);
        }
    }

    class IndexViewHolder extends ViewHolder {
        TextView mTextView;

        public IndexViewHolder(View itemView) {
            super(itemView);
            this.mTextView = (TextView) itemView.findViewById(R.id.tv_index);
        }
    }

    public CarSelectBrandAdapter(List<CarBrandEntity> originalList, Context context) {
        super(originalList);
        this.mContext = context;
        this.mCarBrandLists = originalList;
    }

    public ViewHolder onCreateIndexViewHolder(ViewGroup parent) {
        return new IndexViewHolder(LayoutInflater.from(this.mContext).inflate(R.layout.side_index, parent, false));
    }

    public ViewHolder onCreateContentViewHolder(ViewGroup parent) {
        return new CarBrandHolder(LayoutInflater.from(this.mContext).inflate(R.layout.car_search_brand_item, parent, false));
    }

    public void onBindIndexViewHolder(ViewHolder holder, int position, String indexName) {
        ((IndexViewHolder) holder).mTextView.setText(indexName);
    }

    public void onBindContentViewHolder(ViewHolder holder, int position, CarBrandEntity itemData) {
        CarBrandHolder carBrandHolder = (CarBrandHolder) holder;
        carBrandHolder.car_search_brand_name_item.setText(itemData.getBrand());
        Glide.with(this.mContext).load(itemData.getBrandImg()).centerCrop().crossFade().into(carBrandHolder.car_search_brand_log_item);
        if (itemData.isChecked()) {
            carBrandHolder.car_search_brand_checked_item.setImageResource(R.drawable.ic_21_interface_check_yes_vote);
        } else {
            carBrandHolder.car_search_brand_checked_item.setImageResource(R.drawable.ic_21_interface_check_no_vote);
        }
    }
}
