package com.osan.nebula;

import android.app.Application;
import android.content.Context;

/**
 * Created by osan on 2017/7/5.
 */

public class App extends Application {

    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();

        context = this;
    }
}
