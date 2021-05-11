package com.kakapo.foodmarket.ui.auth.signup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kakapo.foodmarket.databinding.FragmentSignUpBinding

class SignUpFragment : Fragment() {

    private lateinit var mBinding: FragmentSignUpBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = FragmentSignUpBinding.inflate(inflater, container, false)
        return mBinding.root
    }

}