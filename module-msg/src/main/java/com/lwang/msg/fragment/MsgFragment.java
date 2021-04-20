package com.lwang.msg.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.lwang.core.router.RouterFragmentPath;
import com.lwang.msg.BR;
import com.lwang.msg.R;
import com.lwang.msg.databinding.MsgFragmentMsgBinding;
import com.lwang.msg.viewmodel.MsgViewModel;

import me.goldze.mvvmhabit.base.BaseFragment;

/**
 * @Author lwang
 * @Date 2021/4/19 22:17
 * @Description
 */
@Route(path = RouterFragmentPath.Msg.PAGER_MSG)
public class MsgFragment extends BaseFragment<MsgFragmentMsgBinding, MsgViewModel> {


    @Override
    public int initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return R.layout.msg_fragment_msg;
    }


    @Override
    public int initVariableId() {
        return BR.viewModel;
    }


}
