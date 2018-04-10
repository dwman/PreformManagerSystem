package com.dwman.preformmanagesystem.ui.fragment;


import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import android.widget.TextView;

import com.dwman.preformmanagesystem.R;
import com.dwman.preformmanagesystem.ui.activity.ContentActivity;
import com.dwman.preformmanagesystem.ui.base.BaseFragment;

import java.util.Arrays;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by ldw on 2018/4/9.
 */
public class QualityFragment extends BaseFragment {


    @InjectView(R.id.tv_toolbar_title)
    TextView tvToolbarTitle;
    @InjectView(R.id.tool_bar)
    Toolbar toolBar;
    @InjectView(R.id.spinner)
    Spinner spinner;

    private String[] contents= {"台模、水电预埋检查","模具组装检查","预埋件安装检查"
            ,"钢筋网和钢筋成品(骨架)尺寸检查","门窗框检查","构件成品检查","构件表观质量检查"
            ,"预制件养护管理"};

    public static QualityFragment newInstance() {

        QualityFragment fragment = new QualityFragment();
        Bundle bundle = new Bundle();

        fragment.setArguments(bundle);

        return fragment;
    }

    @Override
    protected void initData(Bundle savedInstanceState) {
        List<String> datas = Arrays.asList(contents);


    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void initView() {
        tvToolbarTitle.setText("合同管理");
        ContentActivity activity = (ContentActivity) getActivity();
        activity.initToolBar(toolBar);
    }

    @Override
    protected int getResLayout() {
        return R.layout.fragment_quality;
    }


}
