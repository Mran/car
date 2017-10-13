package com.tianran.car.api.interfacelmpl;

import retrofit2.http.GET;
import rx.Observable;

public interface CarBrands {
    @GET("/")
    Observable<String> getAllCarsBrand();
}
