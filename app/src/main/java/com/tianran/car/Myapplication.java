package com.tianran.car;

import android.app.Application;
import android.content.Context;

public class Myapplication extends Application {
    private static Context context;

    public Myapplication() {
        context = getBaseContext();
    }

    public static Context getContext() {
        return context;
    }
}
