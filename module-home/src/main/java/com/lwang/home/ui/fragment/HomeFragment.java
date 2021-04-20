package com.lwang.home.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.android.material.tabs.TabLayout;
import com.lwang.core.router.RouterFragmentPath;
import com.lwang.home.BR;
import com.lwang.home.R;
import com.lwang.home.databinding.HomeFragmentHomeBinding;
import com.lwang.home.ui.adapter.ViewPagerBindingAdapter;
import com.lwang.home.ui.viewmodel.HomeViewModel;

import me.goldze.mvvmhabit.base.BaseFragment;
import me.goldze.mvvmhabit.utils.ToastUtils;

/**
 * @Author lwang
 * @Date 2021/4/19 09:52
 * @Description
 */
@Route(path = RouterFragmentPath.Home.PAGER_HOME)
public class HomeFragment extends BaseFragment<HomeFragmentHomeBinding, HomeViewModel> {


    @Override
    public int initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return R.layout.home_fragment_home;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }


    @Override
    public void initData() {

        binding.setAdapter(new ViewPagerBindingAdapter());


        //使用 TabLayout 和 ViewPager 相关联
        binding.tabs.setupWithViewPager(binding.viewPager);
        binding.viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(binding.tabs));


        viewModel.addPage();
    }


    @Override
    public void initViewObservable() {

        //item的点击事件
        viewModel.itemClickEvent.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                ToastUtils.showShort(s);
            }
        });
    }


}
