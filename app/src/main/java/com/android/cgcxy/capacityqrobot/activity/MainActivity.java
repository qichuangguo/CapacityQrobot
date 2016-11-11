package com.android.cgcxy.capacityqrobot.activity;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android.cgcxy.capacityqrobot.R;
import com.android.cgcxy.capacityqrobot.base.BaseActivity;
import com.android.cgcxy.capacityqrobot.base.util.LogUtils;
import com.turing.androidsdk.InitListener;
import com.turing.androidsdk.SDKInit;
import com.turing.androidsdk.SDKInitBuilder;

public class MainActivity extends BaseActivity {

    /**
     * 申请的secret
     * **/
    private final String TURING_SECRET = "4145a1cb5f92901b";
    /**
     * 申请的turing的apikey
     *  **/
    private final String TURING_APIKEY = "1be69d0ade17478f94dd65580212a55c";
    /**
     * 填写一个任意的标示，没有具体要求，，但一定要写，
     * **/
    private final String UNIQUEID = "asdfadfadf";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initTuSdk();

    }

    /**
     * 初始化图灵机器人
     */
    private void initTuSdk() {

        SDKInitBuilder builder = new SDKInitBuilder(this).setSecret(TURING_SECRET).setTuringKey(TURING_APIKEY).setUniqueId(UNIQUEID);
        SDKInit.init(builder, new InitListener() {
            @Override
            public void onComplete() {
                 // 获取userid成功后，才可以请求Turing服务器，需要请求必须在此回调成功，才可正确请求
            }

            @Override
            public void onFail(String s) {
                LogUtils.i(s);
            }
        });

    }
}
