package com.dwman.preformmanagesystem.user;

import android.content.Context;

/**
 * Created by ldw on 2018/4/9.
 */

public class StorageManager extends BaseUser {
    @Override
    public void qualityTrace(Context context) {
        showToast("StorageManager qualityTrace");
    }

    @Override
    public void contractManage(Context context) {
//        showToast("WorkshopManager contractManage");
        contractManageForDetail(context);
    }

    @Override
    public void productionManage(Context context) {
        showToast("StorageManager 没有此权限");

    }

    @Override
    public void storageManage(Context context) {
        showToast("StorageManager storageManage");
    }

    @Override
    public void tracingManage(Context context) {
        showToast("StorageManager 没有此权限");
    }

    @Override
    public void statisticsManage(Context context) {
//        showToast("WorkshopManager 没有此权限");
        statisticsManageForDetail(context);
    }

    @Override
    public void StockCheckManage(Context context) {
//        showToast("WorkshopManager StockCheckManage");
        storageManageForDetail(context);
    }

    @Override
    public void systemSetting(Context context) {
        showToast(" 没有此权限");
    }

    @Override
    public void personalSetting(Context context) {
        updateInfo(context);
    }
}
