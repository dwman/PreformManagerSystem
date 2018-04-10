package com.dwman.preformmanagesystem.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

import com.dwman.preformmanagesystem.R;
import com.dwman.preformmanagesystem.ui.base.BaseActivity;
import com.dwman.preformmanagesystem.user.UserContext;

public class HomeActivity extends BaseActivity {

    private GridView mGvFunctionMenu;
    String[] functions = {"质量追溯","合同管理","生产管理"
            ,"仓库管理","溯源管理","统计管理","盘点管理","系统管理","个人中心"};
    private BaseAdapter mAdapter;
    private LayoutInflater mLayoutInflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initView();
        initData();
        initListener();


    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);

        initData();
    }

    private void initListener() {
        mGvFunctionMenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        UserContext.getUserContext().qualityTrace(HomeActivity.this);
                        break;
                    case 1:
                        UserContext.getUserContext().contractManage(HomeActivity.this);
                        break;
                    case 2:
                        UserContext.getUserContext().productionManage(HomeActivity.this);
                        break;
                    case 3:
                        UserContext.getUserContext().storageManage(HomeActivity.this);
                        break;
                    case 4:
                        UserContext.getUserContext().tracingManage(HomeActivity.this);
                        break;
                    case 5:
                        UserContext.getUserContext().statisticsManage(HomeActivity.this);
                        break;
                    case 6:
                        UserContext.getUserContext().StockCheckManage(HomeActivity.this);
                        break;
                    case 7:
                        UserContext.getUserContext().systemSetting(HomeActivity.this);
                        break;
                    case 8:
                        UserContext.getUserContext().personalSetting(HomeActivity.this);
                        break;

                }
            }
        });
    }

    private void initData() {
        getUserInfoCache();
    }

    private void initView() {

        mGvFunctionMenu = (GridView) findViewById(R.id.gv_function);
        mAdapter= new MenuAdapter();
        mGvFunctionMenu.setAdapter(mAdapter);
    }


    private class MenuAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return functions.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (mLayoutInflater == null) {
                mLayoutInflater = LayoutInflater.from(parent.getContext());
            }
            TextView view = (TextView) mLayoutInflater.inflate(R.layout.item_menu, parent, false);
                view.setText(functions[position]);

            return view;
        }
    }
}
