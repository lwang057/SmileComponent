package com.lwang.user.viewmodel;

import android.app.Application;
import android.text.TextUtils;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;

import com.lwang.core.global.SPKeyGlobal;
import io.reactivex.disposables.Disposable;
import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.binding.command.BindingAction;
import me.goldze.mvvmhabit.binding.command.BindingCommand;
import me.goldze.mvvmhabit.utils.SPUtils;

/**
 * @Author lwang
 * @Date 2021/4/19 22:32
 * @Description
 */
public class MeViewModel extends BaseViewModel {


    public ObservableInt loginBtnVisible = new ObservableInt();
    public ObservableField<String> userInfoObservable = new ObservableField<>();
    private Disposable subscribe;


    public MeViewModel(@NonNull Application application) {
        super(application);
    }


    @Override
    public void onCreate() {
        initData();
    }


    public void initData() {
        String userInfo = SPUtils.getInstance().getString(SPKeyGlobal.USER_INFO);
        if (!TextUtils.isEmpty(userInfo)) {
            userInfoObservable.set(userInfo);
            loginBtnVisible.set(View.GONE);
        } else {
            loginBtnVisible.set(View.VISIBLE);
        }
    }


    //登录按钮点击事件
    public BindingCommand startLoginOnClickCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {


        }
    });


    //退出登录按钮点击事件
    public BindingCommand outLoginOnClickCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            initData();
        }
    });


}
