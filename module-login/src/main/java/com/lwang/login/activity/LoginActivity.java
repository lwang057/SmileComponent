package com.lwang.login.activity;

import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;

import androidx.lifecycle.Observer;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.lwang.core.router.RouterActivityPath;
import com.lwang.login.BR;
import com.lwang.login.R;
import com.lwang.login.databinding.LoginActivityLoginBinding;
import com.lwang.login.viewmodel.LoginViewModel;

import me.goldze.mvvmhabit.base.BaseActivity;

/**
 * @Author lwang
 * @Date 2021/4/20 22:31
 * @Description
 */
@Route(path = RouterActivityPath.Login.PAGER_LOGIN)
public class LoginActivity extends BaseActivity<LoginActivityLoginBinding, LoginViewModel> {

    @Autowired(name = "name")
    String userName;


    @Override
    public void initParam() {

        //注入路由框架，拿到Autowired值，必须在initParam方法中注入，不然传到ViewModel里面的name为空
        ARouter.getInstance().inject(this);
    }

    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.login_activity_login;
    }


    @Override
    public int initVariableId() {
        return BR.viewModel;
    }


    @Override
    public void initData() {
        if (!TextUtils.isEmpty(userName)){
            viewModel.userName.set(userName);
        }
    }

    @Override
    public void initViewObservable() {
        //监听ViewModel中pSwitchObservable的变化, 当ViewModel中执行【uc.pSwitchObservable.set(!uc.pSwitchObservable.get());】时会回调该方法
        viewModel.uc.pSwitchEvent.observe(this, new Observer<Boolean>() {
            @Override
            public void onChanged(Boolean aBoolean) {
                //pSwitchObservable是boolean类型的观察者,所以可以直接使用它的值改变密码开关的图标
                if (viewModel.uc.pSwitchEvent.getValue()) {
                    //密码可见
                    //在xml中定义id后,使用binding可以直接拿到这个view的引用,不再需要findViewById去找控件了
                    binding.ivSwichPasswrod.setImageResource(R.mipmap.show_psw_press);
                    binding.etPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                } else {
                    //密码不可见
                    binding.ivSwichPasswrod.setImageResource(R.mipmap.show_psw);
                    binding.etPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
        });
    }
}
