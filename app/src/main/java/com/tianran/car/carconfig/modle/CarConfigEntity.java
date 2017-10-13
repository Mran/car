package com.tianran.car.carconfig.modle;

import cn.ittiger.indexlist.entity.BaseEntity;

import java.util.List;

public class CarConfigEntity implements BaseEntity {
    private List<CarConfigitem> carConfigitems;
    private String index;
    private String itemType;

    public void setIndex(String index) {
        this.index = index;
    }

    public List<CarConfigitem> getCarConfigitems() {
        return this.carConfigitems;
    }

    public void setCarConfigitems(List<CarConfigitem> carConfigitems) {
        this.carConfigitems = carConfigitems;
    }

    public String getItemType() {
        return this.itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getIndexField() {
        return this.index;
    }
}
