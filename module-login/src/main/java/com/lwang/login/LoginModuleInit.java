package com.lwang.login;

import android.app.Application;

import com.lwang.core.config.IModuleInit;

import me.goldze.mvvmhabit.utils.KLog;

/**
 * @Author lwang
 * @Date 2021/4/18 21:53
 * @Description
 */
public class LoginModuleInit implements IModuleInit {


    @Override
    public boolean onInitAhead(Application application) {
        KLog.i("登录模块初始化 -- onInitAhead");
        return false;
    }

    @Override
    public boolean onInitLow(Application application) {
        KLog.i("登录模块初始化 -- onInitLow");
        return false;
    }

}
