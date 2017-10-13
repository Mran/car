package com.tianran.car.carsearch.view;

import com.tianran.car.carsearch.modle.CarSearchItemEntity;
import java.util.List;

public interface ICarSearchActivityView {
    void ShowResult(List<CarSearchItemEntity> list, int i);

    void showMessage(String str);
}
