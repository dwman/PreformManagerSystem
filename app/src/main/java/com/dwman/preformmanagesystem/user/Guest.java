package com.dwman.preformmanagesystem.user;

import android.content.Context;

/**
 * Created by ldw on 2018/4/8.
 */
public class Guest extends BaseUser {
    @Override
    public void qualityTrace(Context context) {
        login(context);
    }



    @Override
    public void contractManage(Context context) {
        login(context);
    }

    @Override
    public void productionManage(Context context) {
        login(context);
    }

    @Override
    public void storageManage(Context context) {
        login(context);
    }

    @Override
    public void tracingManage(Context context) {
        login(context);
    }

    @Override
    public void statisticsManage(Context context) {
        login(context);
    }

    @Override
    public void StockCheckManage(Context context) {
        login(context);
    }

    @Override
    public void systemSetting(Context context) {
        login(context);
    }

    @Override
    public void personalSetting(Context context) {
    login(context);
    }


}
