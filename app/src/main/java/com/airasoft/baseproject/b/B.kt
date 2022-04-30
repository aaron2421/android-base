package com.airasoft.baseproject.b

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.airasoft.baseproject.R

class B : Fragment() {

    companion object {
        fun newInstance() = B()
    }

    private lateinit var viewModel: BViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.b_fragment, container, false)
    }

}