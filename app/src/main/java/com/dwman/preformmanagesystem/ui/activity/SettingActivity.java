package com.dwman.preformmanagesystem.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.dwman.preformmanagesystem.R;
import com.dwman.preformmanagesystem.app.Constant;
import com.dwman.preformmanagesystem.ui.base.BaseActivity;
import com.dwman.preformmanagesystem.user.UserContext;
import com.dwman.preformmanagesystem.user.UserFactory;
import com.dwman.preformmanagesystem.utils.SPUtils;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class SettingActivity extends BaseActivity {
    private static final String TAG = "SettingActivity";

    @InjectView(R.id.tv_toolbar_title)
    TextView tvToolbarTitle;
    @InjectView(R.id.tool_bar)
    Toolbar toolBar;
    @InjectView(R.id.btn_logout)
    Button btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        ButterKnife.inject(this);
        initView();



    }

    private void initView() {
        tvToolbarTitle.setText("个人设置");
        initToolBar(toolBar);
    }




    @OnClick(R.id.btn_logout)
    public void onViewClicked() {

        SPUtils.remove(this, Constant.USER_INFO);
        startActivity(new Intent(this,HomeActivity.class));

    }
}
