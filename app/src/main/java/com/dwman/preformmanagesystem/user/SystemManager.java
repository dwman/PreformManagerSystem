package com.dwman.preformmanagesystem.user;

import android.content.Context;

/**
 * Created by ldw on 2018/4/8.
 */

public class SystemManager extends BaseUser {
    @Override
    public void qualityTrace(Context context) {
        showToast("SystemManager  qualityTrace");
    }

    @Override
    public void contractManage(Context context) {
        showToast("SystemManager  contractManage");
    }

    @Override
    public void productionManage(Context context) {
        showToast("SystemManager  productionManage");
    }

    @Override
    public void storageManage(Context context) {
        showToast("SystemManager  storageManage");
    }

    @Override
    public void tracingManage(Context context) {
        showToast("SystemManager  tracingManage");
    }

    @Override
    public void lifeCycleManage(Context context) {
        showToast("SystemManager  lifeCycleManage");
    }

    @Override
    public void projectSetting(Context context) {
        showToast("SystemManager  projectSetting");
    }

    @Override
    public void systemSetting(Context context) {
        showToast("SystemManager  systemSetting");

    }

    @Override
    public void personalSetting(Context context) {
        updateInfo(context);
    }
}
