package com.dwman.preformmanagesystem.user;

import android.content.Context;

import com.dwman.preformmanagesystem.utils.L;

/**
 * Created by ldw on 2018/4/8.
 */

public class UserContext extends BaseUser {
    private static final String TAG = "UserContext";
    public static final int STATUS_SYSTEM_MANAGER = 1;
    public static final int STATUS_PROJECT_MANAGER = 2;
    public static final int STATUS_STORAGE_MANAGER = 3;
    public static final int STATUS_WORKSHOP_MANAGER = 4;
    public static final int STATUS_QUALITY_INSPECTOR = 5;
    public static final int STATUS_GUEST = 0;

    public static UserContext getUserContext() {

        if (mUserContext ==null){
            synchronized (UserContext.class){
                if (mUserContext == null) {
                    mUserContext = new UserContext();
                }
            }
        }

        return mUserContext;
    }

    public int getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(int currentStatus) {
        this.currentStatus = currentStatus;
    }

    public int currentStatus ;

    private BaseUser baseUser = new Guest() ;

    /**
     * 设置当前的用户
     * @param baseUser
     * @param status 用户的等级
     */
    public void setiUser(BaseUser baseUser, int status) {
        this.baseUser = baseUser;
        this.currentStatus = status;
    }
    private static UserContext mUserContext;
    private UserContext (){}


    @Override
    public void qualityTrace(Context context) {
        if (baseUser != null) {
            baseUser.qualityTrace(context);
        }else {
            L.i(TAG,"user is null");
        }
    }

    @Override
    public void contractManage(Context context) {
        if (baseUser != null) {
            baseUser.contractManage(context);
        }else {
            L.i(TAG,"user is null");
        }
    }

    @Override
    public void productionManage(Context context) {
        if (baseUser != null) {
            baseUser.productionManage(context);
        }else {
            L.i(TAG,"user is null");
        }
    }

    @Override
    public void storageManage(Context context) {
        if (baseUser != null) {
            baseUser.storageManage(context);
        }else {
            L.i(TAG,"user is null");
        }
    }

    @Override
    public void tracingManage(Context context) {
        if (baseUser != null) {
            baseUser.tracingManage(context);
        }else {
            L.i(TAG,"user is null");
        }
    }

    @Override
    public void lifeCycleManage(Context context) {
        if (baseUser != null) {
            baseUser.lifeCycleManage(context);
        }else {
            L.i(TAG,"user is null");
        }
    }

    @Override
    public void projectSetting(Context context) {
        if (baseUser != null) {
            baseUser.projectSetting(context);
        }else {
            L.i(TAG,"user is null");
        }
    }

    @Override
    public void systemSetting(Context context) {
        if (baseUser != null) {
            baseUser.systemSetting(context);
        }else {
            L.i(TAG,"user is null");
        }
    }

    @Override
    public void personalSetting(Context context) {
        if (baseUser != null) {
            baseUser.personalSetting(context);
        }else {
            L.i(TAG,"user is null");
        }


    }


}
