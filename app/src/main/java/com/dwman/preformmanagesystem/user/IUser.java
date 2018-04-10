package com.dwman.preformmanagesystem.user;

import android.content.Context;

/**
 * Created by ldw on 2018/4/8.
 */

public interface IUser {
    void qualityTrace(Context context);

    void contractManage(Context context);

    void productionManage(Context context);

    void storageManage(Context context);

    void tracingManage(Context context);

    void statisticsManage(Context context);

    void StockCheckManage(Context context);

    void systemSetting(Context context);

    void personalSetting(Context context);
}
