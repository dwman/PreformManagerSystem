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
    String[] functions = {"质量追溯管理","合同管理","生产管理"
            ,"仓库管理","生命周期管理","项目设置","系统管理","个人中心"};
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

    private void initListener() {
        mGvFunctionMenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        UserContext.getUserContext().qualityTrace();

                        break;
                    case 1:
                        UserContext.getUserContext().contractManage();
                        break;
                    case 2:
                        UserContext.getUserContext().productionManage();
                        break;
                    case 3:
                        UserContext.getUserContext().storageManage();
                        break;
                    case 4:
                        UserContext.getUserContext().lifeCycleManage();
                        break;
                    case 5:
                        UserContext.getUserContext().projectSetting();
                        break;
                    case 6:
                        UserContext.getUserContext().systemSetting();
                        break;
                    case 7:
                        UserContext.getUserContext().personalSetting();
                        break;

                }
            }
        });
    }

    private void initData() {
//        startActivity(new Intent(this,LoginActivity.class));

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
