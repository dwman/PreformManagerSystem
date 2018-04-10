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

//        showToast("ProjectManager qualityTrace");
        qualityTraceForDetail(context);
    }

    @Override
    public void contractManage(Context context) {
//        showToast("ProjectManager contractManage");
        contractManageForDetail(context);
    }

    @Override
    public void productionManage(Context context) {
//        showToast("ProjectManager productionManage");
        productionManageForDetail(context);
    }

    @Override
    public void storageManage(Context context) {
//        showToast("ProjectManager storageManage");
        storageManageForDetail(context);
    }

    @Override
    public void tracingManage(Context context) {
//        showToast("ProjectManager tracingManage");
        tracingManageForDetail(context);
    }

    @Override
    public void statisticsManage(Context context) {
//       showToast("没有此权限");
        statisticsManageForDetail(context);
    }

    @Override
    public void StockCheckManage(Context context) {
//        showToast("ProjectManager StockCheckManage");
        StockCheckManageForDetail(context);
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
