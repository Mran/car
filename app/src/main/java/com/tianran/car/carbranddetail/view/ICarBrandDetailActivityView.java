package com.tianran.car.carbranddetail.view;

import com.tianran.car.carbranddetail.modle.CarBrandDetailEntityWrapper;
import java.util.List;

public interface ICarBrandDetailActivityView {
    void showMessage(String str);

    void showResult(List<CarBrandDetailEntityWrapper> list);
}
