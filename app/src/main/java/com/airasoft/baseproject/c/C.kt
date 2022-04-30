package com.airasoft.baseproject.c

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.airasoft.baseproject.R

class C : Fragment() {

    companion object {
        fun newInstance() = C()
    }

    private lateinit var viewModel: CViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.c_fragment, container, false)
    }

}