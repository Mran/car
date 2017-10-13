package com.tianran.car.carconfig.view;

import com.tianran.car.carconfig.modle.CarConfigEntity;
import java.util.List;

public interface ICarConfigActivityView {
    void showMessage(String str);

    void showResult(List<CarConfigEntity> list, String str);
}
