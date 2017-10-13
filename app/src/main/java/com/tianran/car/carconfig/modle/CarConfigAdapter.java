package com.tianran.car.carconfig.modle;

import android.content.Context;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import cn.ittiger.indexlist.adapter.IndexHeaderFooterAdapter;
import com.tianran.car.R;
import java.util.List;

public class CarConfigAdapter extends IndexHeaderFooterAdapter<CarConfigitem> {
    Context mContext;

    private class CarConfigHolder extends ViewHolder {
        TextView itemfieldTextview;
        TextView valueTextView;
        View view;

        public CarConfigHolder(View itemView) {
            super(itemView);
            this.itemfieldTextview = (TextView) itemView.findViewById(R.id.car_config_filed);
            this.valueTextView = (TextView) itemView.findViewById(R.id.car_config_value);
            this.view = itemView;
        }
    }

    public CarConfigAdapter(String indexValue, String indexName, List list, Context context) {
        super(indexValue, indexName, list);
        this.mContext = context;
    }

    public ViewHolder onCreateViewHolder(ViewGroup parent) {
        return new CarConfigHolder(LayoutInflater.from(this.mContext).inflate(R.layout.car_config_item, parent, false));
    }

    public void onBindViewHolder(ViewHolder holder, int position, CarConfigitem itemData) {
        CarConfigHolder carConfigHolder = (CarConfigHolder) holder;
        carConfigHolder.itemfieldTextview.setText(itemData.getItemfield());
        carConfigHolder.valueTextView.setText(itemData.getValue());
    }
}
