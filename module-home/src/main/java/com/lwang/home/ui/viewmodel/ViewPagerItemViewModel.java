package com.lwang.home.ui.viewmodel;

import androidx.annotation.NonNull;

import me.goldze.mvvmhabit.base.ItemViewModel;
import me.goldze.mvvmhabit.binding.command.BindingAction;
import me.goldze.mvvmhabit.binding.command.BindingCommand;

/**
 * @Author lwang
 * @Date 2021/4/19 10:33
 * @Description
 */
public class ViewPagerItemViewModel extends ItemViewModel<HomeViewModel> {

    public String text;

    public ViewPagerItemViewModel(@NonNull HomeViewModel viewModel, String t) {
        super(viewModel);
        this.text = t;
    }


    /**
     * item点击事件的处理
     */
    public BindingCommand onClick = new BindingCommand(new BindingAction() {
        @Override
        public void call() {

            //点击之后将逻辑转到adapter中处理
            viewModel.itemClickEvent.setValue(text);
        }
    });

}
