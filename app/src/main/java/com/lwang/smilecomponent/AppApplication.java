package com.lwang.smilecomponent;

import com.lwang.core.config.ModuleLifecycleConfig;

import me.goldze.mvvmhabit.base.BaseApplication;

/**
 * @Author lwang
 * @Date 2021/4/16 15:06
 * @Description
 */
public class AppApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();

        //初始化组件(靠前)
        ModuleLifecycleConfig.getInstance().initModuleAhead(this);


        //初始化组件(靠后)
        ModuleLifecycleConfig.getInstance().initModuleLow(this);
    }

}
