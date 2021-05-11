package com.kakapo.foodmarket.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavOptions
import androidx.navigation.Navigation
import com.kakapo.foodmarket.R
import com.kakapo.foodmarket.databinding.ActivityAuthBinding
import com.kakapo.foodmarket.ui.auth.signin.SignInFragment

class AuthActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityAuthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityAuthBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        val pageRequest = intent.getIntExtra(SignInFragment.PAGE_REQUEST, 0)
        if (pageRequest == SignInFragment.VALUE){
            val navOptions = NavOptions.Builder()
                .setPopUpTo(R.id.signInFragment, true)
                .build()

            Navigation.findNavController(findViewById(R.id.authHostFragment))
                .navigate(R.id.action_signUp, null, navOptions)
        }
    }
}