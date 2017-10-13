package com.tianran.car.carbranddetail.modle;

import java.util.List;

public class CarBrandDetailEntityWrapper {
    private String BrandName;
    private String SummeryName;
    private List<CarBrandDeatilEntity> brandDeatilEntities;

    public String getSummeryName() {
        return this.SummeryName;
    }

    public void setSummeryName(String summeryName) {
        this.SummeryName = summeryName;
    }

    public List<CarBrandDeatilEntity> getBrandDeatilEntities() {
        return this.brandDeatilEntities;
    }

    public void setBrandDeatilEntities(List<CarBrandDeatilEntity> brandDeatilEntities) {
        this.brandDeatilEntities = brandDeatilEntities;
    }

    public String getBrandName() {
        return this.BrandName;
    }

    public void setBrandName(String brandName) {
        this.BrandName = brandName;
    }
}
