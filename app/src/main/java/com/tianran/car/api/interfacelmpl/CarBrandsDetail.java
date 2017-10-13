package com.tianran.car.api.interfacelmpl;

import com.tianran.car.carbranddetail.modle.CarBrandDetailJson;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

public interface CarBrandsDetail {
    @GET("/cars_v7.7.0/cars/seriesprice-pm2-{id}-t16.json ")
    Observable<CarBrandDetailJson> getCarBrandDetail(@Path("id") String str);
}
