package com.tianran.car.carsearch.presenter;

import android.content.Context;
import com.tianran.car.api.CarApi;
import com.tianran.car.carsearch.modle.CarSearchItemEntity;
import com.tianran.car.carsearch.modle.CarSearchResultJson;
import com.tianran.car.carsearch.modle.CarSearchResultJson.ResultBean.SeriesitemsBean;
import com.tianran.car.carsearch.view.ICarSearchActivityView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class CarSearchPresenterCompl {
    private Context mContext;
    private ICarSearchActivityView mICarSearchActivityView;

    public CarSearchPresenterCompl(Context mContext, ICarSearchActivityView mICarSearchActivityView) {
        this.mContext = mContext;
        this.mICarSearchActivityView = mICarSearchActivityView;
    }

    public void getSearch(Map<String, String> querryMap) {
        CarApi.getCarSearch().search(querryMap).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber<CarSearchResultJson>() {
            public void onCompleted() {
            }

            public void onError(Throwable e) {
                CarSearchPresenterCompl.this.mICarSearchActivityView.showMessage(e.getMessage());
            }

            public void onNext(CarSearchResultJson carSearchResultJson) {
                List<CarSearchItemEntity> cs = new ArrayList();
                for (SeriesitemsBean s : carSearchResultJson.getResult().getSeriesitems()) {
                    CarSearchItemEntity c = new CarSearchItemEntity();
                    c.setId(String.valueOf(s.getId()));
                    c.setPrice(s.getPrice());
                    c.setName(s.getName());
                    c.setImgUrl(s.getImg());
                    cs.add(c);
                }
                CarSearchPresenterCompl.this.mICarSearchActivityView.ShowResult(cs, carSearchResultJson.getResult().getPagecount());
            }
        });
    }
}
