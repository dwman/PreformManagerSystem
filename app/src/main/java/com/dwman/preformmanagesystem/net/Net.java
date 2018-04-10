package com.dwman.preformmanagesystem.net;

import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.builder.GetBuilder;
import com.zhy.http.okhttp.builder.PostFormBuilder;
import com.zhy.http.okhttp.callback.Callback;

import java.util.Map;
import java.util.Set;

/**
 * Created by ldw on 2018/4/10.
 */

public class Net {

    public static void get(String url, Map<String,String> params, Callback callback){

        if (url == null) {


            throw new RuntimeException("url 地址为空");
        }

        GetBuilder getBuilder = OkHttpUtils.get().url(url);
        if (params != null && params.size()>0) {
            for (String s :params.keySet()){
                getBuilder.addParams(s,params.get(s));
            }

        }

        getBuilder.build().execute(callback);

    }

    public static void post(String url, Map<String,String> params, Callback callback){

        if (url == null) {


            throw new RuntimeException("url 地址为空");
        }

        PostFormBuilder builder = OkHttpUtils.post().url(url);
        if (params!=null){
            for (String s :params.keySet()){
                builder.addParams(s,params.get(s));
            }
        }


        builder.build().execute(callback);

    }

}
