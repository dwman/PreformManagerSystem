package com.dwman.preformmanagesystem.ui.base;

import android.content.Context;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import com.dwman.preformmanagesystem.app.Constant;
import com.dwman.preformmanagesystem.user.BaseUser;
import com.dwman.preformmanagesystem.user.Guest;
import com.dwman.preformmanagesystem.user.ProjectManager;
import com.dwman.preformmanagesystem.user.QualityInspector;
import com.dwman.preformmanagesystem.user.StorageManager;
import com.dwman.preformmanagesystem.user.SystemManager;
import com.dwman.preformmanagesystem.user.UserContext;
import com.dwman.preformmanagesystem.user.UserFactory;
import com.dwman.preformmanagesystem.user.WorkshopManager;
import com.dwman.preformmanagesystem.utils.SPUtils;

public class BaseActivity extends AppCompatActivity {

    protected String mUserName;
    protected String mPassword;
    protected int mCurrentStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(getWindow().getDecorView().getWindowToken(), 0);
    }


    public void initToolBar(Toolbar toolBar) {

        if (toolBar != null) {
            setSupportActionBar(toolBar);

            ActionBar actionBar = getSupportActionBar();
            if (actionBar != null) {
                actionBar.setDisplayHomeAsUpEnabled(true);
                actionBar.setDisplayShowTitleEnabled(false);


            }
            toolBar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
        }


    }


    public boolean getUserInfoCache(){

        String  info = (String) SPUtils.get(this, Constant.USER_INFO, "");
        BaseUser baseUser;
        if (TextUtils.isEmpty(info)) {
            baseUser = UserFactory.createNewUser(UserContext.STATUS_GUEST);
            UserContext.getUserContext().setUser(baseUser);
            return false;
        }
        String regex = "#";
        String[] infos = info.split(regex);
        mCurrentStatus = Integer.parseInt(infos[2]);
        mUserName = infos[0];
        mPassword = infos[1];

         baseUser = UserFactory.createNewUser(mCurrentStatus);
        UserContext.getUserContext().setUser(baseUser);


        return true;
    }
}
