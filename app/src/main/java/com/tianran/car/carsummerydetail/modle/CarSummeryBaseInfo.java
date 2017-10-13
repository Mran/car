package com.tianran.car.carsummerydetail.modle;

public class CarSummeryBaseInfo {
    private String fctPrice;
    private String id;
    private String levelname;
    private String logoUrl;
    private String name;
    private String power;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFctPrice() {
        return this.fctPrice;
    }

    public void setFctPrice(String fctPrice) {
        this.fctPrice = fctPrice;
    }

    public String getLevelname() {
        return this.levelname;
    }

    public void setLevelname(String levelname) {
        this.levelname = levelname;
    }

    public String getLogoUrl() {
        return this.logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getPower() {
        return this.power;
    }

    public void setPower(String power) {
        this.power = power;
    }
}
