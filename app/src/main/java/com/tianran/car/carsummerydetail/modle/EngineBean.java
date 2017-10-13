package com.tianran.car.carsummerydetail.modle;

import java.util.List;

public class EngineBean {
    private List<CarSummeryEntity> carSummeryEntityList;
    private String name;

    public List<CarSummeryEntity> getCarSummeryEntityList() {
        return this.carSummeryEntityList;
    }

    public void setCarSummeryEntityList(List<CarSummeryEntity> carSummeryEntityList) {
        this.carSummeryEntityList = carSummeryEntityList;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
