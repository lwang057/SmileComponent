package com.lwang.work.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

import com.lwang.work.BR;
import com.lwang.work.R;
import com.lwang.work.databinding.WorkFragmentWorkBinding;
import com.lwang.work.viewmodel.WorkViewModel;

import me.goldze.mvvmhabit.base.BaseFragment;

/**
 * @Author lwang
 * @Date 2021/4/19 21:51
 * @Description
 */
public class WorkFragment extends BaseFragment<WorkFragmentWorkBinding, WorkViewModel> {


    @Override
    public int initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return R.layout.work_fragment_work;
    }


    @Override
    public int initVariableId() {
        return BR.viewModel;
    }


    @Override
    public void initData() {
        super.initData();
    }


}
