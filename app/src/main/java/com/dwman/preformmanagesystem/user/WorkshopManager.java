package com.dwman.preformmanagesystem.user;

/**
 * Created by ldw on 2018/4/8.
 */

public class WorkshopManager extends BaseUser {
    @Override
    public void qualityTrace() {
        showToast("WorkshopManager qualityTrace");
    }

    @Override
    public void contractManage() {
        showToast("WorkshopManager contractManage");
    }

    @Override
    public void productionManage() {
        showToast("WorkshopManager 没有此权限");

    }

    @Override
    public void storageManage() {
        showToast("WorkshopManager storageManage");
    }

    @Override
    public void tracingManage() {
        showToast("WorkshopManager 没有此权限");
    }

    @Override
    public void lifeCycleManage() {
        showToast("WorkshopManager 没有此权限");
    }

    @Override
    public void projectSetting() {
        showToast("WorkshopManager projectSetting");
    }

    @Override
    public void systemSetting() {
        showToast("WorkshopManager 没有此权限");
    }

    @Override
    public void personalSetting() {
        updateInfo();
    }
}
