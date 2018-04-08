package com.dwman.preformmanagesystem.ui.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

import com.dwman.preformmanagesystem.R;
import com.dwman.preformmanagesystem.ui.base.BaseActivity;

public class MainActivity extends BaseActivity {

    private GridView mGvFunctionMenu;
    String[] functions = {"质量追溯","合同管理","生产管理"
            ,"仓库管理","溯源管理","统计管理","盘点管理","系统管理"};
    private BaseAdapter mAdapter;
    private LayoutInflater mLayoutInflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();


    }

    private void initData() {


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
