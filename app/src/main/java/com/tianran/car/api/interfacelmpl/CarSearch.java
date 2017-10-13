package com.tianran.car.api.interfacelmpl;

import com.tianran.car.carsearch.modle.CarSearchResultJson;
import java.util.Map;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;
import rx.Observable;

public interface CarSearch {
    @GET("/cars_v7.7.0/cars/searchcars.ashx?")
    Observable<CarSearchResultJson> search(@QueryMap Map<String, String> map);
}
