package com.lwang.home;

import android.app.Application;

import com.lwang.core.config.IModuleInit;

import me.goldze.mvvmhabit.utils.KLog;

/**
 * @Author lwang
 * @Date 2021/4/18 21:49
 * @Description
 */
public class HomeModuleInit implements IModuleInit {


    @Override
    public boolean onInitAhead(Application application) {
        KLog.i("首页模块初始化 -- onInitAhead");
        return false;
    }

    @Override
    public boolean onInitLow(Application application) {
        KLog.i("首页模块初始化 -- onInitLow");
        return false;
    }

}
