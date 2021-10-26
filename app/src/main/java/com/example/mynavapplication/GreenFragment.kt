package com.example.mynavapplication

import androidx.navigation.fragment.findNavController

class GreenFragment : BaseFragment(R.layout.fragment_green) {
    override fun onClick() {
        findNavController().navigate(R.id.action_greenFragment_to_blueFragment)
    }
}