package com.dwman.preformmanagesystem.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;

import com.dwman.preformmanagesystem.R;
import com.dwman.preformmanagesystem.app.Constant;
import com.dwman.preformmanagesystem.ui.base.BaseActivity;
import com.dwman.preformmanagesystem.ui.fragment.ContractFragment;
import com.dwman.preformmanagesystem.ui.fragment.ProductionFragment;
import com.dwman.preformmanagesystem.ui.fragment.QualityFragment;
import com.dwman.preformmanagesystem.ui.fragment.StatisticsFragment;
import com.dwman.preformmanagesystem.ui.fragment.StockCheckFragment;
import com.dwman.preformmanagesystem.ui.fragment.StorageFragment;
import com.dwman.preformmanagesystem.ui.fragment.SystemFragment;
import com.dwman.preformmanagesystem.ui.fragment.TracingFragment;

public class ContentActivity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
        initView();
    }

    private void initView() {
        Intent intent = getIntent();
        int key = intent.getIntExtra(Constant.FRAGMENT_KEY, -1);
        switch (key){
            case Constant.FRAGMENT_QUALITY:

                replaceFragment(QualityFragment.newInstance());
                break;

            case Constant.FRAGMENT_TRACING:
                replaceFragment(TracingFragment.newInstance());
                break;
            case Constant.FRAGMENT_PRODUCTION:
                replaceFragment(ProductionFragment.newInstance());
                break;
            case Constant.FRAGMENT_STATISTICS:
                replaceFragment(StatisticsFragment.newInstance());
                break;
            case Constant.FRAGMENT_CONTRACT:
                replaceFragment(ContractFragment.newInstance());
                break;
            case Constant.FRAGMENT_STORAGE:
                replaceFragment(StorageFragment.newInstance());
                break;
            case Constant.FRAGMENT_SYSTEM:
                replaceFragment(SystemFragment.newInstance());
                break;
            case Constant.FRAGMENT_STOCK_CHECK:
                replaceFragment(StockCheckFragment.newInstance());
                break;
            default:
                throw new RuntimeException("unknown fragment key,please check your params");
        }

    }


    public void replaceFragment(Fragment fragment){
        replaceFragment(R.id.fragment_container,fragment);
    }

    public void replaceFragment(@IdRes int id, Fragment fragment) {

        getSupportFragmentManager().beginTransaction().replace(id, fragment).commit();
    }

}
