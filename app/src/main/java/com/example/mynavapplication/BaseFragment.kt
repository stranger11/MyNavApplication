package com.example.mynavapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button

abstract class BaseFragment(layoutResId: Int) : Fragment(layoutResId) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.button).setOnClickListener { onClick() }
    }

    abstract fun onClick()
}