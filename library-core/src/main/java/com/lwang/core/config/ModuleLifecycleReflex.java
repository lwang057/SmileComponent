package com.lwang.core.config;

/**
 * @Author lwang
 * @Date 2021/4/17 09:33
 * @Description 组件生命周期反射类名管理，在这里注册需要初始化的组件，通过反射动态调用各个组件的初始化方法
 * 注意：以下模块中初始化的Module类不能被混淆
 */
public class ModuleLifecycleReflex {

    //核心基础库
    private static final String BaseInit = "com.lwang.core.base.BaseModuleInit";

    //主业务模块
    private static final String MainInit = "com.lwang.main.MainModuleInit";
    //首页业务模块
    private static final String HomeInit = "com.lwang.home.HomeModuleInit";
    //工作业务模块
    private static final String WorkInit = "com.lwang.work.WorkModuleInit";
    //消息业务模块
    private static final String MsgInit = "com.lwang.msg.MsgModuleInit";
    //我的业务模块
    private static final String UserInit = "com.lwang.user.UserModuleInit";
    //登录验证模块
    private static final String LoginInit = "com.lwang.login.LoginModuleInit";


    public static String[] initModuleNames = {BaseInit, MainInit, HomeInit, WorkInit, MsgInit, UserInit, LoginInit};


}
