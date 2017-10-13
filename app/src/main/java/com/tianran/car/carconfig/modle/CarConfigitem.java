package com.tianran.car.carconfig.modle;

import cn.ittiger.indexlist.entity.BaseEntity;

public class CarConfigitem implements BaseEntity {
    private String index;
    private String itemfield;
    private String value;

    public void setIndex(String index) {
        this.index = index;
    }

    public String getItemfield() {
        return this.itemfield;
    }

    public void setItemfield(String itemfield) {
        this.itemfield = itemfield;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getIndexField() {
        return this.index;
    }
}
