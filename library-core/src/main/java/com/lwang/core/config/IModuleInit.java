package com.lwang.core.config;

import android.app.Application;

/**
 * @Author lwang
 * @Date 2021/4/17 08:24
 * @Description 动态配置Application，有需要初始化的组件实现该接口，统一在主app的Application中进行初始化
 */
public interface IModuleInit {


    /**
     * 初始化优先的
     *
     * @param application
     * @return
     */
    boolean onInitAhead(Application application);


    /**
     * 初始化靠后的
     *
     * @param application
     * @return
     */
    boolean onInitLow(Application application);
}
