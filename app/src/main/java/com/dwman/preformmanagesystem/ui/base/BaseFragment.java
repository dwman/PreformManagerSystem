package com.dwman.preformmanagesystem.ui.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

/**
 * Created by ldw on 2018/4/8.
 */

public abstract class BaseFragment extends Fragment {

    private View mRootView;
    protected AppCompatActivity mActivity;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        if (mRootView == null) {
            mRootView = inflater.inflate(getResLayout(),container,false);
            ButterKnife.inject(this,mRootView);
        } else {
            ViewGroup viewGroup = (ViewGroup) mRootView.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(mRootView);
            }
        }

        initView();
        return mRootView;
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        super.onActivityCreated(savedInstanceState);
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initData(savedInstanceState);
        initListener();
    }

    protected abstract void initListener();
    protected void loadDataDelay(){}

    protected void initData(Bundle savedInstanceState) {
    }

    /**
     * 在该方法中做view初始化的操作
     */
    protected abstract void initView();

    protected abstract int getResLayout();


}
