package com.dwman.preformmanagesystem.user;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import com.dwman.preformmanagesystem.app.Constant;
import com.dwman.preformmanagesystem.app.MyApp;
import com.dwman.preformmanagesystem.ui.activity.ContentActivity;
import com.dwman.preformmanagesystem.ui.activity.LoginActivity;
import com.dwman.preformmanagesystem.ui.activity.SettingActivity;
import com.dwman.preformmanagesystem.utils.T;

/**
 * Created by ldw on 2018/4/8.
 */

public abstract class BaseUser implements IUser{
    public int currentStatus ;

    protected void updateInfo(Context context) {
        if (context == null) {
            return;
        }
        if (context instanceof AppCompatActivity){


        Intent intent = new Intent();
        intent.setClass(context,SettingActivity.class);
        context.startActivity(intent);
//        ((AppCompatActivity)context).finish();
        }
    }

    protected void qualityTraceForDetail(Context context){

        Intent intent =createIntent(context);
        intent.putExtra(Constant.FRAGMENT_KEY,Constant.FRAGMENT_QUALITY);
        context.startActivity(intent);
    }

    private Intent createIntent(Context context) {
        Intent intent = new Intent();
        intent.setClass(context,ContentActivity.class);

        return intent;
    }

    protected void contractManageForDetail(Context context) {
        Intent intent =createIntent(context);
        intent.putExtra(Constant.FRAGMENT_KEY,Constant.FRAGMENT_CONTRACT);
        context.startActivity(intent);
    }

    protected void productionManageForDetail(Context context) {
        Intent intent =createIntent(context);
        intent.putExtra(Constant.FRAGMENT_KEY,Constant.FRAGMENT_PRODUCTION);
        context.startActivity(intent);
    }

    protected void storageManageForDetail(Context context) {
        Intent intent =createIntent(context);
        intent.putExtra(Constant.FRAGMENT_KEY,Constant.FRAGMENT_STORAGE);
        context.startActivity(intent);
    }

/*    protected void tracingManageForDetail(Context context) {
        Intent intent =createIntent(context);
        intent.putExtra(Constant.FRAGMENT_KEY,Constant.FRAGMENT_QUALITY);
        context.startActivity(intent);
    }*/

    protected void lifeCycleManageForDetail(Context context) {
        Intent intent =createIntent(context);
        intent.putExtra(Constant.FRAGMENT_KEY,Constant.FRAGMENT_LIFECYCLE);
        context.startActivity(intent);
    }

    protected void projectSettingForDetail(Context context) {
        Intent intent =createIntent(context);
        intent.putExtra(Constant.FRAGMENT_KEY,Constant.FRAGMENT_PROJECTION);
        context.startActivity(intent);
    }

    protected void systemSettingForDetail(Context context) {
        Intent intent =createIntent(context);
        intent.putExtra(Constant.FRAGMENT_KEY,Constant.FRAGMENT_SYSTEM);
        context.startActivity(intent);
    }


    protected void login(Context context) {
        if (context == null) {
            return;
        }
        T.showShort(context,"现在为游客模式请先登录");
        if (context instanceof AppCompatActivity){
            Intent intent = new Intent();
            intent.setClass(context,LoginActivity.class);
            context.startActivity(intent);
//            ((AppCompatActivity)context).finish();
        }
    }
    protected void showToast(String msg){
        T.showShort(MyApp.getMyApp(),msg);
    }
}
