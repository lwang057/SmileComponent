package com.lwang.main;

import android.app.Application;

import com.lwang.core.config.IModuleInit;

import me.goldze.mvvmhabit.utils.KLog;

/**
 * @Author lwang
 * @Date 2021/4/16 23:18
 * @Description 主业务模块自身初始化操作
 */
public class MainModuleInit implements IModuleInit {

    @Override
    public boolean onInitAhead(Application application) {
        KLog.i("主业务模块初始化 -- onInitAhead");
        return false;
    }

    @Override
    public boolean onInitLow(Application application) {
        KLog.i("主业务模块初始化 -- onInitLow");
        return false;
    }

}
