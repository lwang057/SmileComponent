package com.lwang.home.ui.adapter;

import android.view.ViewGroup;

import androidx.databinding.ViewDataBinding;

import com.lwang.home.databinding.HomeItemViewpagerBinding;
import com.lwang.home.ui.viewmodel.ViewPagerItemViewModel;

import me.tatarka.bindingcollectionadapter2.BindingViewPagerAdapter;

/**
 * @Author lwang
 * @Date 2021/4/19 09:53
 * @Description
 */
public class ViewPagerBindingAdapter extends BindingViewPagerAdapter<ViewPagerItemViewModel> {


    @Override
    public void onBindBinding(ViewDataBinding binding, int variableId, int layoutRes, int position, ViewPagerItemViewModel item) {
        super.onBindBinding(binding, variableId, layoutRes, position, item);

        //这里可以强转成ViewPagerItemViewModel对应的ViewDataBinding，item里面布局的binding就是这个
        HomeItemViewpagerBinding binding1 = (HomeItemViewpagerBinding) binding;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);

    }


}
