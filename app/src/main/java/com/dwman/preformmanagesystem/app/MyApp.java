package com.dwman.preformmanagesystem.app;

import android.app.Application;
import android.content.Context;

import com.zhy.http.okhttp.OkHttpUtils;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;

/**
 * Created by ldw on 2018/4/8.
 */

public class MyApp extends Application {
    private static Context mCcontext;

    public static Context getMyApp() {
        return mCcontext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mCcontext = this;
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
//                .addInterceptor(new LoggerInterceptor("TAG"))
                .connectTimeout(10000L, TimeUnit.MILLISECONDS)
                .readTimeout(10000L, TimeUnit.MILLISECONDS)
                //其他配置
                .build();

        OkHttpUtils.initClient(okHttpClient);

    }
}
