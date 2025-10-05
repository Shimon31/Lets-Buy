package com.bcsbattle.letsbuy.views.register

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.bcsbattle.letsbuy.R
import com.bcsbattle.letsbuy.databinding.FragmentRegisterBinding


class RegisterFragment : Fragment() {

    lateinit var binding: FragmentRegisterBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegisterBinding.inflate(layoutInflater,container,false)

        binding.btnRegister.setOnClickListener {
            findNavController().navigate(R.id.action_registerFragment_to_dashboardFragment)
        }

        binding.btnLogin.setOnClickListener {
            findNavController().navigate(R.id.action_registerFragment_to_loginFragment)
        }

        return binding.root
    }


}