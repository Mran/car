package com.tianran.car.api;

import com.tianran.car.api.interfacelmpl.CarBrands;
import com.tianran.car.api.interfacelmpl.CarBrandsDetail;
import com.tianran.car.api.interfacelmpl.CarConfig;
import com.tianran.car.api.interfacelmpl.CarSearch;
import com.tianran.car.api.interfacelmpl.Carbymark;
import com.tianran.car.api.interfacelmpl.Carseriessummary;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;

import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient.Builder;
import retrofit2.CallAdapter.Factory;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class CarApi {
    private static InetSocketAddress addr = new InetSocketAddress("127.0.0.1", 8888);
    private static CarBrands carBrands;
    private static CarBrandsDetail carBrandsDetail;
    private static CarConfig carConfig;
    private static CarSearch carSearch;
    private static Carbymark carbymark;
    private static Carseriessummary carseriessummary;
    private static OkHttpClient client = new Builder().build();
    private static GsonConverterFactory gsonConverterFactory = GsonConverterFactory.create();
    private static Proxy proxy = new Proxy(Type.HTTP, addr);
    private static Factory rxJavaCallAdapterFactory = RxJavaCallAdapterFactory.create();
    private static ScalarsConverterFactory scalarsConverterFactory = ScalarsConverterFactory.create();

    public static CarSearch getCarSearch() {
        if (carSearch == null) {
            carSearch = (CarSearch) new Retrofit.Builder().baseUrl("http://cars.app.autohome.com.cn").addCallAdapterFactory(rxJavaCallAdapterFactory).addConverterFactory(gsonConverterFactory).client(client).build().create(CarSearch.class);
        }
        return carSearch;
    }

    public static CarBrands getCarBrands() {
        if (carBrands == null) {
            carBrands = (CarBrands) new Retrofit.Builder().baseUrl("http://car.m.autohome.com.cn").addCallAdapterFactory(rxJavaCallAdapterFactory).addConverterFactory(scalarsConverterFactory).client(client).build().create(CarBrands.class);
        }
        return carBrands;
    }

    public static CarBrandsDetail getCarBrandsDetail() {
        if (carBrandsDetail == null) {
            carBrandsDetail = (CarBrandsDetail) new Retrofit.Builder().baseUrl("http://cars.app.autohome.com.cn").addCallAdapterFactory(rxJavaCallAdapterFactory).addConverterFactory(gsonConverterFactory).client(client).build().create(CarBrandsDetail.class);
        }
        return carBrandsDetail;
    }

    public static Carseriessummary getCarseriessummary() {
        if (carseriessummary == null) {
            carseriessummary = (Carseriessummary) new Retrofit.Builder().baseUrl("http://cars.app.autohome.com.cn").addCallAdapterFactory(rxJavaCallAdapterFactory).addConverterFactory(gsonConverterFactory).client(client).build().create(Carseriessummary.class);
        }
        return carseriessummary;
    }

    public static CarConfig getCarConfig() {
        if (carConfig == null) {
            carConfig = (CarConfig) new Retrofit.Builder().baseUrl("http://cars.app.autohome.com.cn").addCallAdapterFactory(rxJavaCallAdapterFactory).addConverterFactory(gsonConverterFactory).client(client).build().create(CarConfig.class);
        }
        return carConfig;
    }

    public static Carbymark getCarbymark() {
        if (carbymark == null) {
            carbymark = (Carbymark) new Retrofit.Builder().baseUrl("http://cars.app.autohome.com.cn").addCallAdapterFactory(rxJavaCallAdapterFactory).addConverterFactory(gsonConverterFactory).client(client).build().create(Carbymark.class);
        }
        return carbymark;
    }
}
