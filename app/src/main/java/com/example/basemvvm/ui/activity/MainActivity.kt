package com.example.basemvvm.ui.activity

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.basemvvm.base.BaseActivity
import com.example.basemvvm.databinding.ActivityMainBinding
import com.example.basemvvm.viewmodel.activity.MainViewModel

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {

    override fun getViewBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun createViewModel(): MainViewModel {
        return ViewModelProvider(this)[MainViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}