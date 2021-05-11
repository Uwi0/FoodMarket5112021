package com.kakapo.foodmarket.ui.auth.signin

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kakapo.foodmarket.databinding.FragmentSignInBinding
import com.kakapo.foodmarket.ui.auth.AuthActivity

class SignInFragment : Fragment() {

    companion object{
        const val PAGE_REQUEST: String = "page request"
        const val VALUE: Int = 2
    }

    private lateinit var mBinding: FragmentSignInBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = FragmentSignInBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        mBinding.btnSignup.setOnClickListener {
            val intent = Intent(requireActivity(), AuthActivity::class.java)
            //put extra
            intent.putExtra(PAGE_REQUEST, VALUE)
            startActivity(intent)
        }
    }

}