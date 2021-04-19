package com.lwang.home.ui.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;

import com.lwang.home.BR;
import com.lwang.home.R;

import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.binding.command.BindingCommand;
import me.goldze.mvvmhabit.binding.command.BindingConsumer;
import me.goldze.mvvmhabit.bus.event.SingleLiveEvent;
import me.goldze.mvvmhabit.utils.ToastUtils;
import me.tatarka.bindingcollectionadapter2.BindingViewPagerAdapter;
import me.tatarka.bindingcollectionadapter2.ItemBinding;

/**
 * @Author lwang
 * @Date 2021/4/19 09:52
 * @Description
 */
public class HomeViewModel extends BaseViewModel {

    public SingleLiveEvent<String> itemClickEvent = new SingleLiveEvent<>();

    //给ViewPager添加ObservableList
    public ObservableList<ViewPagerItemViewModel> items = new ObservableArrayList<>();

    public HomeViewModel(@NonNull Application application) {
        super(application);
    }


    public void addPage() {
        items.clear();

        for (int i = 0; i <= 3; i++) {

            ViewPagerItemViewModel itemViewModel = new ViewPagerItemViewModel(this, "第" + i + "个页面");
            items.add(itemViewModel);
        }
    }


    //给ViewPager添加ItemBinding
    public ItemBinding<ViewPagerItemViewModel> itemBinding = ItemBinding.of(BR.viewModel, R.layout.home_item_viewpager);


    //给ViewPager添加PageTitle
    public final BindingViewPagerAdapter.PageTitles<ViewPagerItemViewModel> pageTitles = new BindingViewPagerAdapter.PageTitles<ViewPagerItemViewModel>() {
        @Override
        public CharSequence getPageTitle(int position, ViewPagerItemViewModel item) {
            return "条目" + position;
        }
    };


    //ViewPager切换监听
    public BindingCommand<Integer> onPageSelectedCommand = new BindingCommand<Integer>(new BindingConsumer<Integer>() {
        @Override
        public void call(Integer index) {
            ToastUtils.showShort("ViewPager切换：" + index);
        }
    });

}

