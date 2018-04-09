package com.dwman.preformmanagesystem.user;

import android.content.Context;

/**
 * Created by ldw on 2018/4/9.
 */

public class StorageManager extends BaseUser {
    @Override
    public void qualityTrace(Context context) {
        showToast("WorkshopManager qualityTrace");
    }

    @Override
    public void contractManage(Context context) {
        showToast("WorkshopManager contractManage");
    }

    @Override
    public void productionManage(Context context) {
        showToast("WorkshopManager 没有此权限");

    }

    @Override
    public void storageManage(Context context) {
        showToast("WorkshopManager storageManage");
    }

    @Override
    public void tracingManage(Context context) {
        showToast("WorkshopManager 没有此权限");
    }

    @Override
    public void lifeCycleManage(Context context) {
        showToast("WorkshopManager 没有此权限");
    }

    @Override
    public void projectSetting(Context context) {
        showToast("WorkshopManager projectSetting");
    }

    @Override
    public void systemSetting(Context context) {
        showToast("WorkshopManager 没有此权限");
    }

    @Override
    public void personalSetting(Context context) {
        updateInfo(context);
    }
}
