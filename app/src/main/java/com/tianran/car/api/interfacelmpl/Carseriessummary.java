package com.tianran.car.api.interfacelmpl;

import com.tianran.car.carsummerydetail.modle.CarseriessummaryJson;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

public interface Carseriessummary {
    @GET("/carinfo_v7.7.0/cars/seriessummary-pm2-s{id}-t-c500100.json")
    Observable<CarseriessummaryJson> getCarseriessummary(@Path("id") String str);
}
