package com.tianran.car.carbranddetail.presenter;

import android.content.Context;
import com.tianran.car.api.CarApi;
import com.tianran.car.carbranddetail.modle.CarBrandDeatilEntity;
import com.tianran.car.carbranddetail.modle.CarBrandDetailEntityWrapper;
import com.tianran.car.carbranddetail.modle.CarBrandDetailJson;
import com.tianran.car.carbranddetail.modle.CarBrandDetailJson.ResultBean.FctlistBean;
import com.tianran.car.carbranddetail.modle.CarBrandDetailJson.ResultBean.FctlistBean.SerieslistBean;
import com.tianran.car.carbranddetail.view.ICarBrandDetailActivityView;
import java.util.ArrayList;
import java.util.List;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

public class CarBrandDetailPresenterCompl {
    List<CarBrandDeatilEntity> mCarBrandDeatilEntityList = new ArrayList();
    private Context mContext;
    private ICarBrandDetailActivityView mICarBrandDetailActivityView;

    public CarBrandDetailPresenterCompl(Context mContext, ICarBrandDetailActivityView mICarBrandDetailActivityView) {
        this.mContext = mContext;
        this.mICarBrandDetailActivityView = mICarBrandDetailActivityView;
    }

    public List<CarBrandDeatilEntity> getmCarBrandDeatilEntityList() {
        return this.mCarBrandDeatilEntityList;
    }

    public void getCarBrandDeatail(String id) {
        CarApi.getCarBrandsDetail().getCarBrandDetail(id).flatMap(new Func1<CarBrandDetailJson, Observable<List<CarBrandDetailEntityWrapper>>>() {
            public Observable<List<CarBrandDetailEntityWrapper>> call(CarBrandDetailJson carBrandDetailJson) {
                List<CarBrandDetailEntityWrapper> carBrandDetailEntityWrappers = new ArrayList();
                for (FctlistBean f : carBrandDetailJson.getResult().getFctlist()) {
                    CarBrandDetailEntityWrapper wrapper = new CarBrandDetailEntityWrapper();
                    wrapper.setBrandName(carBrandDetailJson.getResult().getBrandname());
                    List<CarBrandDeatilEntity> carBrandDeatilEntities = new ArrayList();
                    for (SerieslistBean s : f.getSerieslist()) {
                        CarBrandDeatilEntity carBrandDeatilEntity = new CarBrandDeatilEntity();
                        wrapper.setSummeryName(f.getName());
                        carBrandDeatilEntity.setBrandName(carBrandDetailJson.getResult().getBrandname());
                        carBrandDeatilEntity.setSummeryName(f.getName());
                        carBrandDeatilEntity.setCarName(s.getName());
                        carBrandDeatilEntity.setBrandImgUrl(s.getImgurl());
                        carBrandDeatilEntity.setPrice(s.getPrice());
                        carBrandDeatilEntity.setId(s.getId());
                        carBrandDeatilEntities.add(carBrandDeatilEntity);
                        wrapper.setBrandDeatilEntities(carBrandDeatilEntities);
                    }
                    carBrandDetailEntityWrappers.add(wrapper);
                }
                return Observable.just(carBrandDetailEntityWrappers);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber<List<CarBrandDetailEntityWrapper>>() {
            public void onCompleted() {
            }

            public void onError(Throwable e) {
                CarBrandDetailPresenterCompl.this.mICarBrandDetailActivityView.showMessage(e.getMessage());
            }

            public void onNext(List<CarBrandDetailEntityWrapper> carBrandDetailEntityWrappers) {
                CarBrandDetailPresenterCompl.this.mICarBrandDetailActivityView.showResult(carBrandDetailEntityWrappers);
            }
        });
    }
}
