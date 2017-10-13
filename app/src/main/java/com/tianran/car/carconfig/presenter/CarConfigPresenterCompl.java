package com.tianran.car.carconfig.presenter;

import android.content.Context;
import android.util.Log;

import com.tianran.car.BuildConfig;
import com.tianran.car.api.CarApi;
import com.tianran.car.carconfig.modle.CarConfigEntity;
import com.tianran.car.carconfig.modle.CarConfigJson;
import com.tianran.car.carconfig.modle.CarConfigJson.ResultBean.ConfigitemsBean;
import com.tianran.car.carconfig.modle.CarConfigJson.ResultBean.ParamitemsBean;
import com.tianran.car.carconfig.modle.CarConfigJson.ResultBean.ParamitemsBean.ItemsBean;
import com.tianran.car.carconfig.modle.CarConfigJson.ResultBean.ParamitemsBean.ItemsBean.ModelexcessidsBean;
import com.tianran.car.carconfig.modle.CarConfigitem;
import com.tianran.car.carconfig.view.ICarConfigActivityView;

import java.util.ArrayList;
import java.util.List;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class CarConfigPresenterCompl {
    private Context mContext;
    private ICarConfigActivityView mICarConfigActivityView;

    public CarConfigPresenterCompl(Context mContext, ICarConfigActivityView mICarConfigActivityView) {
        this.mContext = mContext;
        this.mICarConfigActivityView = mICarConfigActivityView;
    }

    public void getCarConfig(String id) {
        CarApi.getCarConfig().getCarconfig(id).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber<CarConfigJson>() {
            public void onCompleted() {
            }

            public void onError(Throwable e) {
                CarConfigPresenterCompl.this.mICarConfigActivityView.showMessage(e.getMessage());
                if (BuildConfig.DEBUG) {
                    Log.d("CarConfigPresenterCompl", e.getMessage());
                }
            }

            public void onNext(CarConfigJson caConfigJson) {
                List<CarConfigEntity> carConfigEntities = new ArrayList();
                int index = 1;
                for (ParamitemsBean p : caConfigJson.getResult().getParamitems()) {
                    CarConfigEntity carConfigEntity = new CarConfigEntity();
                    carConfigEntity.setItemType(p.getItemtype());
                    List<CarConfigitem> carConfigitems = new ArrayList();
                    int mmindex = 1;
                    for (ItemsBean i : p.getItems()) {
                        CarConfigitem carConfigitem = new CarConfigitem();
                        carConfigitem.setItemfield(i.getName());
                        carConfigitem.setValue(((ModelexcessidsBean) i.getModelexcessids().get(0)).getValue());
                        int mmindex2 = mmindex + 1;
                        carConfigitem.setIndex(String.valueOf(mmindex));
                        carConfigitems.add(carConfigitem);
                        mmindex = mmindex2;
                    }
                    int index2 = index + 1;
                    carConfigEntity.setIndex(String.valueOf(index));
                    carConfigEntity.setCarConfigitems(carConfigitems);
                    carConfigEntities.add(carConfigEntity);
                    index = index2;
                }
                String name = ((CarConfigitem) ((CarConfigEntity) carConfigEntities.get(0)).getCarConfigitems().get(0)).getValue();
                ((CarConfigEntity) carConfigEntities.get(0)).getCarConfigitems().remove(0);
                CarConfigEntity carConfigEntity;
                for (ConfigitemsBean p2 : caConfigJson.getResult().getConfigitems()) {
                    carConfigEntity = new CarConfigEntity();
                    carConfigEntity.setItemType(p2.getItemtype());
                    List<CarConfigitem> carConfigitems = new ArrayList();
                    int mmindex = 1;
                    int mmindex2;
                    for (ConfigitemsBean.ItemsBean i2 : p2.getItems()) {
                        CarConfigitem carConfigitem;
                        carConfigitem = new CarConfigitem();
                        carConfigitem.setItemfield(i2.getName());
                        carConfigitem.setValue(((ConfigitemsBean.ItemsBean.ModelexcessidsBean) i2.getModelexcessids().get(0)).getValue());
                        mmindex2 = mmindex + 1;
                        carConfigitem.setIndex(String.valueOf(mmindex));
                        carConfigitems.add(carConfigitem);
                        mmindex = mmindex2;
                    }
                    int index2 = index + 1;
                    carConfigEntity.setIndex(String.valueOf(index));
                    carConfigEntity.setCarConfigitems(carConfigitems);
                    carConfigEntities.add(carConfigEntity);
                    index = index2;
                }
                mICarConfigActivityView.showResult(carConfigEntities, name);
            }
        });
    }
}
