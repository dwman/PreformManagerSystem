package com.dwman.preformmanagesystem.ui.fragment;


import android.os.Bundle;
import android.widget.TextView;

import com.dwman.preformmanagesystem.R;
import com.dwman.preformmanagesystem.ui.base.BaseFragment;

import butterknife.InjectView;

/**
 * Created by ldw on 2018/4/9.
 */
public class StockCheckFragment extends BaseFragment {


    @InjectView(R.id.tv_content)
    TextView tvContent;

    public static StockCheckFragment newInstance() {

        StockCheckFragment fragment = new StockCheckFragment();
        Bundle bundle = new Bundle();

        fragment.setArguments(bundle);

        return fragment;
    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void initView() {
        tvContent.setText("StockCheckFragment");
    }

    @Override
    protected int getResLayout() {
        return R.layout.fragment_;
    }


}
