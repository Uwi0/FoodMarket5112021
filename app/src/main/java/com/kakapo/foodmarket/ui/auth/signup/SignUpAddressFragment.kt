package com.kakapo.foodmarket.ui.auth.signup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kakapo.foodmarket.databinding.FragmentSignUpAddressBinding

class SignUpAddressFragment : Fragment() {

    private lateinit var mBinding: FragmentSignUpAddressBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        mBinding = FragmentSignUpAddressBinding.inflate(inflater, container, false)
        return mBinding.root
    }

}