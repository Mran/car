package com.tianran.car.api.interfacelmpl;

import com.tianran.car.carbymark.modle.CarbyMarkJson;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

public interface Carbymark {
    @GET("/cars_v7.7.0/cars/getcarbymarks-a2-pm2-p{index}-s20-mak{mark}-o0-map0-mip0.json ")
    Observable<CarbyMarkJson> getCarbymark(@Path("index") int i, @Path("mark") int i2);
}
