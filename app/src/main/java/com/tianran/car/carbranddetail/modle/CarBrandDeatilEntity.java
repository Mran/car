package com.tianran.car.carbranddetail.modle;

import cn.ittiger.indexlist.entity.BaseEntity;

public class CarBrandDeatilEntity implements BaseEntity {
    private String SummeryName;
    private String brandImgUrl;
    private String brandName;
    private String carName;
    private String id;
    private String price;

    public String getSummeryName() {
        return this.SummeryName;
    }

    public void setSummeryName(String summeryName) {
        this.SummeryName = summeryName;
    }

    public String getBrandName() {
        return this.brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandImgUrl() {
        return this.brandImgUrl;
    }

    public void setBrandImgUrl(String brandImgUrl) {
        this.brandImgUrl = brandImgUrl;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCarName() {
        return this.carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getIndexField() {
        return this.SummeryName;
    }
}
