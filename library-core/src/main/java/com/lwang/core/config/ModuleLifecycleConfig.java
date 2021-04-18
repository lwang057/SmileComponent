package com.lwang.core.config;

import android.app.Application;

import io.reactivex.annotations.Nullable;

/**
 * @Author lwang
 * @Date 2021/4/17 08:24
 * @Description 作为组件生命周期初始化的配置类，通过反射机制，动态调用每个组件初始化逻辑
 */
public class ModuleLifecycleConfig {


    public static ModuleLifecycleConfig getInstance() {
        return SingletonHolder.instance;
    }


    private static class SingletonHolder {
        public static ModuleLifecycleConfig instance = new ModuleLifecycleConfig();
    }


    private ModuleLifecycleConfig() {
    }


    /**
     * 初始化组件-靠前
     *
     * @param application
     */
    public void initModuleAhead(@Nullable Application application) {
        for (String moduleName : ModuleLifecycleReflex.initModuleNames) {

            try {
                Class<?> aClass = Class.forName(moduleName);
                IModuleInit init = (IModuleInit) aClass.newInstance();

                //调用初始化方法
                init.onInitAhead(application);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }
    }


    /**
     * 初始化组件-靠后
     *
     * @param application
     */
    public void initModuleLow(@Nullable Application application) {
        for (String moduleName : ModuleLifecycleReflex.initModuleNames) {

            try {
                Class<?> aClass = Class.forName(moduleName);
                IModuleInit init = (IModuleInit) aClass.newInstance();

                //调用初始化方法
                init.onInitLow(application);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }
    }

}
