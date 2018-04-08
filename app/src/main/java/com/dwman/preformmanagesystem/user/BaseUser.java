package com.dwman.preformmanagesystem.user;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import com.dwman.preformmanagesystem.app.MyApp;
import com.dwman.preformmanagesystem.ui.activity.LoginActivity;
import com.dwman.preformmanagesystem.ui.activity.SettingActivity;
import com.dwman.preformmanagesystem.utils.T;

/**
 * Created by ldw on 2018/4/8.
 */

public abstract class BaseUser implements IUser{


    public void updateInfo(Context context) {
        if (context == null) {
            return;
        }
        if (context instanceof AppCompatActivity){


        Intent intent = new Intent();
        intent.setClass(context,SettingActivity.class);
        context.startActivity(intent);
        ((AppCompatActivity)context).finish();
        }
    }
    public void login(Context context) {
        if (context == null) {
            return;
        }
        T.showShort(context,"现在为游客模式请先登录");
        if (context instanceof AppCompatActivity){
            Intent intent = new Intent();
            intent.setClass(context,LoginActivity.class);
            context.startActivity(intent);
            ((AppCompatActivity)context).finish();
        }
    }
    public void showToast(String msg){
        T.showShort(MyApp.getMyApp(),msg);
    }
}
