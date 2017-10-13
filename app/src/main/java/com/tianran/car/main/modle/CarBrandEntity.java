package com.tianran.car.main.modle;

import cn.ittiger.indexlist.entity.BaseEntity;

public class CarBrandEntity implements BaseEntity {
    private String brand;
    private String brandImg;
    private String id;
    private boolean isChecked;

    public boolean isChecked() {
        return this.isChecked;
    }

    public void setChecked(boolean checked) {
        this.isChecked = checked;
    }

    public String getIndexField() {
        return this.brand;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrandImg() {
        return this.brandImg;
    }

    public void setBrandImg(String brandImg) {
        this.brandImg = brandImg;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
