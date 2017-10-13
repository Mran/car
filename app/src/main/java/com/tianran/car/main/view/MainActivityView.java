package com.tianran.car.main.view;

import com.tianran.car.main.modle.CarBrandEntity;
import java.util.List;

public interface MainActivityView {
    void showMessage(String str);

    void showResult(List<CarBrandEntity> list);
}
