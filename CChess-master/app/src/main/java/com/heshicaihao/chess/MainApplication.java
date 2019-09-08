package com.heshicaihao.chess;

import android.app.Application;

import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.Utils;
import com.heshicaihao.chess.BuildConfig;

/**
 * Created by HZY on 2018/3/6.
 */

public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(this);
        LogUtils.getConfig().setLogSwitch(BuildConfig.DEBUG)
                .setLogHeadSwitch(false).setBorderSwitch(false);
    }
}
