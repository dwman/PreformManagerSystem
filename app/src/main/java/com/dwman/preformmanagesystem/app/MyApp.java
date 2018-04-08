package com.dwman.preformmanagesystem.app;

import android.app.Application;
import android.content.Context;

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
    }
}
