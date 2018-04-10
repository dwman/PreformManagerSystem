package com.dwman.preformmanagesystem.user;

import android.content.Context;

import java.security.KeyStore;

/**
 * Created by ldw on 2018/4/8.
 */

public class SystemManager extends BaseUser {
    @Override
    public void qualityTrace(Context context) {
//        showToast("SystemManager  qualityTrace");
        qualityTraceForDetail(context);
    }

    @Override
    public void contractManage(Context context) {
//        showToast("SystemManager  contractManage");
        contractManageForDetail(context);
    }

    @Override
    public void productionManage(Context context) {
//        showToast("SystemManager  productionManage");
        productionManageForDetail(context);
    }

    @Override
    public void storageManage(Context context) {
//        showToast("SystemManager  storageManage");
        storageManageForDetail(context);
    }

    @Override
    public void tracingManage(Context context) {
//        showToast("SystemManager  tracingManage");
        tracingManageForDetail(context);
    }

    @Override
    public void statisticsManage(Context context) {
//        showToast("SystemManager  statisticsManage");
        statisticsManageForDetail(context);
    }

    @Override
    public void StockCheckManage(Context context) {
//        showToast("SystemManager  StockCheckManage");
        storageManageForDetail(context);
    }

    @Override
    public void systemSetting(Context context) {
//        showToast("SystemManager  systemSetting");
        systemSettingForDetail(context);

    }

    @Override
    public void personalSetting(Context context) {
        updateInfo(context);
    }
}
