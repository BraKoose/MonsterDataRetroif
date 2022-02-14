package com.koose.monsterdataretroif.ui

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.koose.monsterdataretroif.R

class MonsterProfileFrag : Fragment() {

    companion object {
        fun newInstance() = MonsterProfileFrag()
    }

    private lateinit var viewModel: MonsterProfileViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.monster_profile_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MonsterProfileViewModel::class.java)
        // TODO: Use the ViewModel
    }

}