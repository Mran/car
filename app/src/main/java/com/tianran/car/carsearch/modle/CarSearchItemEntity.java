package com.tianran.car.carsearch.modle;

import cn.ittiger.indexlist.entity.BaseEntity;

public class CarSearchItemEntity implements BaseEntity {
    private String id;
    private String imgUrl;
    private String name;
    private String price;

    public String getIndexField() {
        return this.name;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImgUrl() {
        return this.imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
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
