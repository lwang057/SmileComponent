package com.lwang.work.viewmodel;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;

import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.base.ItemViewModel;

/**
 * @Author lwang
 * @Date 2021/4/19 21:52
 * @Description
 */
public class WorkItemViewModel extends ItemViewModel {


    public ObservableField<String> text = new ObservableField<>();

    public WorkItemViewModel(@NonNull BaseViewModel viewModel, String t) {
        super(viewModel);
        this.text.set(t);
    }

}
