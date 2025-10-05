package com.bcsbattle.letsbuy.views.starter

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.bcsbattle.letsbuy.R
import com.bcsbattle.letsbuy.databinding.FragmentStarterBinding


class StarterFragment : Fragment() {

    lateinit var binding: FragmentStarterBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStarterBinding.inflate(layoutInflater, container, false)


        binding.btnLogin.setOnClickListener {
            findNavController().navigate(R.id.action_starterFragment_to_loginFragment)

        }
        binding.btnRegister.setOnClickListener {
            findNavController().navigate(R.id.action_starterFragment_to_registerFragment)
        }

        return binding.root
    }


}