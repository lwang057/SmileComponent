package com.lwang.core.base;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;
import com.lwang.core.BuildConfig;
import com.lwang.core.config.IModuleInit;

import me.goldze.mvvmhabit.utils.KLog;

/**
 * @Author lwang
 * @Date 2021/4/17 09:28
 * @Description 核心基础库自身初始化操作
 */
public class BaseModuleInit implements IModuleInit {


    @Override
    public boolean onInitAhead(Application application) {
        //开启打印日志
        KLog.init(true);

        if (BuildConfig.DEBUG){
            ARouter.openLog();
            ARouter.openDebug();
        }
        //尽可能早，推荐在Application中初始化
        ARouter.init(application);

        KLog.i("基础层初始化 -- onInitAhead");
        return false;
    }


    @Override
    public boolean onInitLow(Application application) {
        KLog.i("基础层初始化 -- onInitLow");

        return false;
    }

}
