package com.tianran.car.carbranddetail.modle;

import android.content.Context;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import cn.ittiger.indexlist.adapter.IndexHeaderFooterAdapter;
import cn.ittiger.indexlist.entity.BaseEntity;
import com.bumptech.glide.Glide;
import com.tianran.car.R;
import java.util.List;

public class CarBrandHeadAdapter extends IndexHeaderFooterAdapter {
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

    public CarBrandHeadAdapter(Context context, String indexValue, String indexName, List list) {
        super(indexValue, indexName, list);
        this.mContext = context;
    }

    public ViewHolder onCreateViewHolder(ViewGroup parent) {
        return new CarBrandDetailHolder(LayoutInflater.from(this.mContext).inflate(R.layout.car_series_recycleview_item, parent, false));
    }

    public void onBindViewHolder(ViewHolder holder, int position, BaseEntity itemData) {
        CarBrandDetailHolder carBrandDetailHolder = (CarBrandDetailHolder) holder;
        CarBrandDeatilEntity carBrandDeatilEntity = (CarBrandDeatilEntity) itemData;
        carBrandDetailHolder.brandTextview.setText(carBrandDeatilEntity.getCarName());
        carBrandDetailHolder.priceTextView.setText(carBrandDeatilEntity.getPrice());
        Glide.with(this.mContext).load(carBrandDeatilEntity.getBrandImgUrl()).centerCrop().crossFade().into(carBrandDetailHolder.brandImageView);
    }
}
