package com.tianran.car.carsummerydetail.modle;

import cn.ittiger.indexlist.entity.BaseEntity;

public class CarSummeryEntity implements BaseEntity {
    private String descrption;
    private String id;
    private String minPrice;
    private String name;
    private String price;

    public String getIndexField() {
        return this.name;
    }

    public String getDescrption() {
        return this.descrption;
    }

    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMinPrice() {
        return this.minPrice;
    }

    public void setMinPrice(String minPrice) {
        this.minPrice = minPrice;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
