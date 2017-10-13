package com.tianran.car.carsummerydetail.presenter;

import android.content.Context;
import com.tianran.car.api.CarApi;
import com.tianran.car.carsummerydetail.modle.CarSummeryBaseInfo;
import com.tianran.car.carsummerydetail.modle.CarSummeryEntity;
import com.tianran.car.carsummerydetail.modle.CarseriessummaryJson;
import com.tianran.car.carsummerydetail.modle.CarseriessummaryJson.ResultBean.EnginelistBean;
import com.tianran.car.carsummerydetail.modle.CarseriessummaryJson.ResultBean.EnginelistBean.SpeclistBean;
import com.tianran.car.carsummerydetail.modle.CarseriessummaryJson.ResultBean.ParamlistBean;
import com.tianran.car.carsummerydetail.modle.EngineBean;
import com.tianran.car.carsummerydetail.view.ICarSummeryDetailActivityView;
import java.util.ArrayList;
import java.util.List;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class CarSummeryDetailPresenterCompl {
    private Context mContext;
    private ICarSummeryDetailActivityView mICarSummeryDetailActivityView;

    public CarSummeryDetailPresenterCompl(Context mContext, ICarSummeryDetailActivityView mICarSummeryDetailActivityView) {
        this.mContext = mContext;
        this.mICarSummeryDetailActivityView = mICarSummeryDetailActivityView;
    }

    public void getCarSummeryDetail(String id) {
        CarApi.getCarseriessummary().getCarseriessummary(id).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber<CarseriessummaryJson>() {
            public void onCompleted() {
            }

            public void onError(Throwable e) {
            }

            public void onNext(CarseriessummaryJson carseriessummaryJson) {
                CarSummeryBaseInfo carSummeryBaseInfo = new CarSummeryBaseInfo();
                carSummeryBaseInfo.setId(String.valueOf(carseriessummaryJson.getResult().getSeriesid()));
                carSummeryBaseInfo.setName(carseriessummaryJson.getResult().getName());
                carSummeryBaseInfo.setFctPrice(carseriessummaryJson.getResult().getFctprice());
                carSummeryBaseInfo.setLevelname(carseriessummaryJson.getResult().getLevelname());
                carSummeryBaseInfo.setLogoUrl(carseriessummaryJson.getResult().getLogo());
                carSummeryBaseInfo.setPower(((ParamlistBean) carseriessummaryJson.getResult().getParamlist().get(1)).getValue());
                CarSummeryDetailPresenterCompl.this.mICarSummeryDetailActivityView.showBaseInfo(carSummeryBaseInfo);
                List<EngineBean> engineBeanList = new ArrayList();
                for (EnginelistBean eng : carseriessummaryJson.getResult().getEnginelist()) {
                    EngineBean e = new EngineBean();
                    e.setName(eng.getName());
                    List<CarSummeryEntity> carSummeryEntitys = new ArrayList();
                    for (SpeclistBean s : eng.getSpeclist()) {
                        CarSummeryEntity c = new CarSummeryEntity();
                        c.setId(String.valueOf(s.getId()));
                        c.setName(s.getName());
                        c.setPrice(s.getPrice());
                        c.setDescrption(s.getDescription());
                        c.setMinPrice(s.getMinprice());
                        carSummeryEntitys.add(c);
                    }
                    e.setCarSummeryEntityList(carSummeryEntitys);
                    engineBeanList.add(e);
                }
                CarSummeryDetailPresenterCompl.this.mICarSummeryDetailActivityView.showResult(engineBeanList);
            }
        });
    }
}
