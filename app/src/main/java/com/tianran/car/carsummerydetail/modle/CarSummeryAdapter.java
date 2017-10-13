package com.tianran.car.carsummerydetail.modle;

import android.content.Context;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import cn.ittiger.indexlist.adapter.IndexHeaderFooterAdapter;
import com.tianran.car.R;
import java.util.List;

public class CarSummeryAdapter extends IndexHeaderFooterAdapter<CarSummeryEntity> {
    Context mContext;

    private class CarSummeryDetailHolder extends ViewHolder {
        TextView minPriceTextView;
        TextView nameTextview;
        TextView priceTextView;
        View view;

        public CarSummeryDetailHolder(View itemView) {
            super(itemView);
            this.nameTextview = (TextView) itemView.findViewById(R.id.car_summery_detail_item_car_name);
            this.priceTextView = (TextView) itemView.findViewById(R.id.car_summery_detail_item_car_price);
            this.minPriceTextView = (TextView) itemView.findViewById(R.id.car_summery_detail_item_car_price_min);
            this.view = itemView;
        }
    }

    public CarSummeryAdapter(String indexValue, String indexName, List list, Context context) {
        super(indexValue, indexName, list);
        this.mContext = context;
    }

    public ViewHolder onCreateViewHolder(ViewGroup parent) {
        return new CarSummeryDetailHolder(LayoutInflater.from(this.mContext).inflate(R.layout.car_summery_detail_recycleview_item, parent, false));
    }

    public void onBindViewHolder(ViewHolder holder, int position, CarSummeryEntity itemData) {
        CarSummeryDetailHolder carSummeryDetailHolder = (CarSummeryDetailHolder) holder;
        if (itemData.getMinPrice().equals("")) {
            carSummeryDetailHolder.minPriceTextView.setText("暂无");
        } else {
            carSummeryDetailHolder.minPriceTextView.setText(itemData.getMinPrice());
        }
        carSummeryDetailHolder.nameTextview.setText(itemData.getName());
        carSummeryDetailHolder.priceTextView.setText("厂商指导价: " + itemData.getPrice());
    }
}
