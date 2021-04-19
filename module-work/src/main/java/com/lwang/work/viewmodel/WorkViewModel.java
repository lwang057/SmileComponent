package com.lwang.work.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;

import com.lwang.work.BR;
import com.lwang.work.R;

import me.goldze.mvvmhabit.base.BaseViewModel;
import me.tatarka.bindingcollectionadapter2.ItemBinding;

/**
 * @Author lwang
 * @Date 2021/4/19 21:52
 * @Description
 */
public class WorkViewModel extends BaseViewModel {

    //给RecyclerView添加ObservableList
    public ObservableList<WorkItemViewModel> observableList = new ObservableArrayList<>();


    public WorkViewModel(@NonNull Application application) {
        super(application);
    }


    @Override
    public void onCreate() {
        super.onCreate();
        for (int i = 0; i < 10; i++) {
            observableList.add(new WorkItemViewModel(this, "条目" + i));
        }
    }

    //给RecyclerView添加ItemBinding
    public ItemBinding<WorkItemViewModel> itemBinding = ItemBinding.of(BR.viewModel, R.layout.work_item_grid);


}
