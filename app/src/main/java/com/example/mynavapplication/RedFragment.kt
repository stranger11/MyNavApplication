package com.example.mynavapplication

import androidx.navigation.fragment.findNavController

class RedFragment : BaseFragment(R.layout.fragment_red) {
    override fun onClick() {
        findNavController().navigate(R.id.action_redFragment_to_greenFragment)
    }
}