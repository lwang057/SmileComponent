package com.lwang.user.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

import com.lwang.user.BR;
import com.lwang.user.R;
import com.lwang.user.databinding.UserFragmentMeBinding;
import com.lwang.user.viewmodel.MeViewModel;

import me.goldze.mvvmhabit.base.BaseFragment;

/**
 * @Author lwang
 * @Date 2021/4/19 22:31
 * @Description
 */
public class MeFragment extends BaseFragment<UserFragmentMeBinding, MeViewModel> {


    @Override
    public int initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return R.layout.user_fragment_me;
    }


    @Override
    public int initVariableId() {
        return BR.viewModel;
    }


}
