package com.kakapo.foodmarket.ui.auth.signin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kakapo.foodmarket.databinding.FragmentSignInBinding

class SignInFragment : Fragment() {

    private lateinit var mBinding: FragmentSignInBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = FragmentSignInBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }

}