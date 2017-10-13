package com.tianran.car.api.interfacelmpl;

import com.tianran.car.carconfig.modle.CarConfigJson;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface CarConfig {
    @GET("/cfg_v7.4.0/cars/speccompare.ashx?pm=2&type=1&cityid=500100&site=2&pl=2")
    Observable<CarConfigJson> getCarconfig(@Query("specids") String str);
}
