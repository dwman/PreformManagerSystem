package com.dwman.preformmanagesystem.ui.fragment;


import android.os.Bundle;
import android.widget.TextView;

import com.dwman.preformmanagesystem.R;
import com.dwman.preformmanagesystem.ui.base.BaseFragment;

import butterknife.InjectView;

/**
 * Created by ldw on 2018/4/9.
 */
public class SystemFragment extends BaseFragment {


    @InjectView(R.id.tv_content)
    TextView tvContent;

    public static SystemFragment newInstance() {

        SystemFragment fragment = new SystemFragment();
        Bundle bundle = new Bundle();

        fragment.setArguments(bundle);

        return fragment;
    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void initView() {
        tvContent.setText("SystemFragment");
    }

    @Override
    protected int getResLayout() {
        return R.layout.fragment_;
    }


}
