package com.example.mynavapplication

import androidx.navigation.fragment.findNavController

class BlueFragment : BaseFragment(R.layout.fragment_blue) {
    override fun onClick() {
        findNavController().navigate(R.id.action_blueFragment_to_redFragment)
    }
}