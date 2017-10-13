package com.tianran.car.carbymark.view;

import com.tianran.car.carsearch.modle.CarSearchItemEntity;
import java.util.List;

public interface CarBymarkActivityView {
    void ShowResult(List<CarSearchItemEntity> list, int i);

    void showMessage(String str);
}
