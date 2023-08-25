package com.example.basemvvm.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.basemvvm.base.BaseFragment
import com.example.basemvvm.databinding.FragmentMyBinding
import com.example.basemvvm.viewmodel.fragment.MyViewModel

class MyFragment : BaseFragment<FragmentMyBinding, MyViewModel>() {

    override fun getViewBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentMyBinding {
        return FragmentMyBinding.inflate(layoutInflater)
    }

    override fun createViewModel(): MyViewModel {
        return ViewModelProvider(this)[MyViewModel::class.java]
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}