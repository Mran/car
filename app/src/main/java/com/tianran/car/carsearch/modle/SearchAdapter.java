package com.tianran.car.carsearch.modle;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.tianran.car.R;
import java.util.ArrayList;
import java.util.List;

public class SearchAdapter extends RecyclerView.Adapter<SearchAdapter.CarConfigHolder> {
    private List<CarSearchItemEntity> carSearchItemEntities = new ArrayList();
    private Context context;
    private OnRecyclerItemClickedListener listener;

    public interface OnRecyclerItemClickedListener {
        void onItemClick(View view, int i, CarSearchItemEntity carSearchItemEntity);
    }

    public class CarConfigHolder extends ViewHolder {
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

    public SearchAdapter(Context context) {
        this.context = context;
    }

    public CarConfigHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new CarConfigHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.car_search_item, parent, false));
    }

    public void onBindViewHolder(CarConfigHolder holder, final int position) {
        Glide.with(this.context).load(((CarSearchItemEntity) this.carSearchItemEntities.get(position)).getImgUrl()).into(holder.car_search_item_img);
        holder.car_search_item_name.setText(((CarSearchItemEntity) this.carSearchItemEntities.get(position)).getName());
        holder.car_search_item_price.setText(((CarSearchItemEntity) this.carSearchItemEntities.get(position)).getPrice());
        holder.rootView.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                SearchAdapter.this.listener.onItemClick(v, position, (CarSearchItemEntity) SearchAdapter.this.carSearchItemEntities.get(position));
            }
        });
    }

    public int getItemCount() {
        return this.carSearchItemEntities.size();
    }

    public void adddata(boolean isloadmore, List<CarSearchItemEntity> carSearchItemEntities) {
        if (isloadmore) {
            this.carSearchItemEntities.addAll(carSearchItemEntities);
        } else {
            this.carSearchItemEntities.clear();
            this.carSearchItemEntities.addAll(carSearchItemEntities);
        }
        notifyDataSetChanged();
    }

    public void setOnRecyclerItemClickListener(OnRecyclerItemClickedListener listener) {
        if (listener != null) {
            this.listener = listener;
        }
    }
}
