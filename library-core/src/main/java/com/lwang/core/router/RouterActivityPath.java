package com.lwang.core.router;

/**
 * @Author lwang
 * @Date 2021/4/17 09:21
 * @Description 用于组件开发中，ARouter单Activity跳转的统一路径注册。。。在这里注册添加路由路径，需要清除的写好注释标明功能界面
 */
public class RouterActivityPath {
    /**
     * 主业务组件
     */
    public static class Main {
        private static final String MAIN = "/main";
        /*主业务界面*/
        public static final String PAGER_MAIN = MAIN + "/Main";
    }


    /**
     * 身份验证组件
     */
    public static class Sign {
        private static final String SIGN = "/sign";
        /*登录界面*/
        public static final String PAGER_LOGIN = SIGN + "/Login";
    }


    /**
     * 用户组件
     */
    public static class User {
        private static final String USER = "/user";
        /*用户详情*/
        public static final String PAGER_USERDETAIL = USER + "/UserDetail";
    }
}
