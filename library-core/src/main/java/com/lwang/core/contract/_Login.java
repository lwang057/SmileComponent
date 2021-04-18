package com.lwang.core.contract;

/**
 * @Author lwang
 * @Date 2021/4/17 09:20
 * @Description 登录完成后，组件间通信的契约类
 */
public class _Login {

    private String userName;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
