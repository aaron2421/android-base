package com.airasoft.baseproject.a

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.airasoft.baseproject.R

class A : Fragment() {

    companion object {
        fun newInstance() = A()
    }

    private lateinit var viewModel: AViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.a_fragment, container, false)
    }

}