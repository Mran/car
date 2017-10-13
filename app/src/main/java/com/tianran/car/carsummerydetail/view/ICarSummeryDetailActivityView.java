package com.tianran.car.carsummerydetail.view;

import com.tianran.car.carsummerydetail.modle.CarSummeryBaseInfo;
import com.tianran.car.carsummerydetail.modle.EngineBean;
import java.util.List;

public interface ICarSummeryDetailActivityView {
    void showBaseInfo(CarSummeryBaseInfo carSummeryBaseInfo);

    void showMessage(String str);

    void showResult(List<EngineBean> list);
}
