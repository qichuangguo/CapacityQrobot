package com.android.cgcxy.capacityqrobot.base.util;

import android.util.Log;

/**
 * Created by chuangguo.qi on 2016/11/11.
 */

public class LogUtils {

    private static boolean isShowLog=true;
    private static String TAG="chuangguo.qi";
    public static void i(String str){
        Log.i(TAG, "LogUtils: "+str);
    }

}
