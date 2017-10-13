package com.tianran.car.main.presenter;

import android.content.Context;
import com.tianran.car.api.CarApi;
import com.tianran.car.main.modle.CarBrandEntity;
import com.tianran.car.main.view.MainActivityView;
import com.tianran.car.util.Prase;
import java.util.ArrayList;
import java.util.List;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

public class MainPresenetrcompl {
    List<CarBrandEntity> mCarBrandEntityList = new ArrayList();
    private Context mContext;
    private MainActivityView mMainActivityView;

    public MainPresenetrcompl(Context mContext, MainActivityView mMainActivityView) {
        this.mContext = mContext;
        this.mMainActivityView = mMainActivityView;
    }

    public List<CarBrandEntity> getmCarBrandEntityList() {
        return this.mCarBrandEntityList;
    }

    public void getAllBrands() {
        CarApi.getCarBrands().getAllCarsBrand().flatMap(new Func1<String, Observable<List<CarBrandEntity>>>() {
            public Observable<List<CarBrandEntity>> call(String s) {
                return Observable.just(Prase.getAllCarBrands(s));
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber<List<CarBrandEntity>>() {
            public void onCompleted() {
            }

            public void onError(Throwable throwable) {
                MainPresenetrcompl.this.mMainActivityView.showMessage(throwable.getMessage());
            }

            public void onNext(List<CarBrandEntity> carBrandInfos) {
                MainPresenetrcompl.this.mMainActivityView.showResult(carBrandInfos);
            }
        });
    }
}
