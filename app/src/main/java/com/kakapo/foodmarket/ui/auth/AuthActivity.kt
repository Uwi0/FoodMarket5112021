package com.kakapo.foodmarket.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kakapo.foodmarket.R
import com.kakapo.foodmarket.databinding.ActivityAuthBinding

class AuthActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityAuthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityAuthBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
    }
}