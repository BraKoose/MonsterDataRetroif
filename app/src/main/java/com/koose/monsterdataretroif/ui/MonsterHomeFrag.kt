package com.koose.monsterdataretroif.ui

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.koose.monsterdataretroif.R

class MonsterHomeFrag : Fragment() {

    companion object {
        fun newInstance() = MonsterHomeFrag()
    }

    private lateinit var viewModel: MonsterHomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.monster_home_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MonsterHomeViewModel::class.java)
        // TODO: Use the ViewModel
    }

}