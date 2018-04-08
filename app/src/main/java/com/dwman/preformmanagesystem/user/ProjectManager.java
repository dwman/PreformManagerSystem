package com.dwman.preformmanagesystem.user;

import android.content.Context;

import com.dwman.preformmanagesystem.app.MyApp;
import com.dwman.preformmanagesystem.utils.L;
import com.dwman.preformmanagesystem.utils.T;

/**
 * Created by ldw on 2018/4/8.
 */

public class ProjectManager extends BaseUser {
    private static final String TAG = "ProjectManager";
    @Override
    public void qualityTrace(Context context) {
        L.i(TAG,"qualityTrace");

        showToast("ProjectManager qualityTrace");
    }

    @Override
    public void contractManage(Context context) {
        L.i(TAG,"contractManage");
        showToast("ProjectManager contractManage");
    }

    @Override
    public void productionManage(Context context) {
        L.i(TAG,"productionManage");
        showToast("ProjectManager productionManage");
    }

    @Override
    public void storageManage(Context context) {
        L.i(TAG,"storageManage");
        showToast("ProjectManager storageManage");
    }

    @Override
    public void tracingManage(Context context) {
        L.i(TAG,"tracingManage");
        showToast("ProjectManager tracingManage");
    }

    @Override
    public void lifeCycleManage(Context context) {
       showToast("没有此权限");
    }

    @Override
    public void projectSetting(Context context) {
        L.i(TAG,"projectSetting");
        showToast("ProjectManager projectSetting");
    }

    @Override
    public void systemSetting(Context context) {
        showToast("没有此权限");
    }

    @Override
    public void personalSetting(Context context) {
    updateInfo(context);
    }

}
