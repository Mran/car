package com.tianran.car.carbymark.presenter;

import android.content.Context;
import com.tianran.car.api.CarApi;
import com.tianran.car.carbymark.modle.CarbyMarkJson;
import com.tianran.car.carbymark.modle.CarbyMarkJson.ResultBean.SeriesitemsBean;
import com.tianran.car.carbymark.view.CarBymarkActivityView;
import com.tianran.car.carsearch.modle.CarSearchItemEntity;
import java.util.ArrayList;
import java.util.List;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class CarByMarkPresenetrcompl {
    private CarBymarkActivityView carBymarkActivityView;
    private Context mContext;

    public CarByMarkPresenetrcompl(Context mContext, CarBymarkActivityView carBymarkActivityView) {
        this.mContext = mContext;
        this.carBymarkActivityView = carBymarkActivityView;
    }

    public void getCarByMark(int index, int mark) {
        CarApi.getCarbymark().getCarbymark(index, mark).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber<CarbyMarkJson>() {
            public void onCompleted() {
            }

            public void onError(Throwable e) {
                CarByMarkPresenetrcompl.this.carBymarkActivityView.showMessage(e.getMessage());
            }

            public void onNext(CarbyMarkJson carbyMarkJson) {
                List<CarSearchItemEntity> carSearchItemEntities = new ArrayList();
                for (SeriesitemsBean s : carbyMarkJson.getResult().getSeriesitems()) {
                    CarSearchItemEntity c = new CarSearchItemEntity();
                    c.setImgUrl(s.getImg());
                    c.setName(s.getName());
                    c.setPrice(s.getPrice());
                    c.setId(String.valueOf(s.getId()));
                    carSearchItemEntities.add(c);
                }
                CarByMarkPresenetrcompl.this.carBymarkActivityView.ShowResult(carSearchItemEntities, carbyMarkJson.getResult().getPagecount());
            }
        });
    }
}
