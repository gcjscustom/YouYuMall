package com.example.yousheng.youyumall;

import android.app.Application;

import com.example.yousheng.latte.app.Latte;

/**
 * Created by yousheng on 17/7/15.
 */

public class ExampleApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        init();
    }

    private void init() {
        //初始化配置项目
        Latte.init(this).withApiHost("")
                .withLoaderDelayed(1000)
                .withJavascriptInterface("latte")
                .withWeChatAppId("")
                .withWeChatAppSecret("")
                .configure();


    }


}