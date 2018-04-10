package com.dwman.preformmanagesystem.ui.activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;

import com.dwman.preformmanagesystem.R;
import com.dwman.preformmanagesystem.app.Constant;
import com.dwman.preformmanagesystem.ui.base.BaseActivity;
import com.dwman.preformmanagesystem.utils.SPUtils;
import com.dwman.preformmanagesystem.utils.T;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity {

    @InjectView(R.id.et_login_user)
    EditText etLoginUser;
    @InjectView(R.id.et_login_password)
    EditText etLoginPassword;
    @InjectView(R.id.btn_login)
    Button btnLogin;

    private ProgressDialog mProgressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.inject(this);
    }

    @OnClick(R.id.btn_login)
    public void onViewClicked() {



        final String userName = etLoginUser.getText().toString().trim();
        final String pwd = etLoginPassword.getText().toString().trim();
        if (TextUtils.isEmpty(userName) || TextUtils.isEmpty(pwd)){
            T.showShort(this,"用户名或密码不能为空");
            return;
        }


        mProgressDialog = ProgressDialog.show(this,null,"正在登陆...",false,false);

        new Thread(){
            @Override
            public void run() {
                super.run();

                SystemClock.sleep(2000);

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {

                        mProgressDialog.dismiss();
                        if (TextUtils.equals(userName,"ldw") && TextUtils.equals(pwd,"123")){
                            T.showShort(LoginActivity.this,"登陆成功");


                            int status = (int) (Math.random() * 3 +1);
                            String info = userName+"#"+pwd+"#"+status;
                            SPUtils.put(LoginActivity.this, Constant.USER_INFO,info);

                            startActivity(new Intent(LoginActivity.this,HomeActivity.class));
                            finish();

                        }else {

                            T.showShort(LoginActivity.this,"用户名或密码错误");
                        }

                    }
                });



            }
        }.start();



    }
}
