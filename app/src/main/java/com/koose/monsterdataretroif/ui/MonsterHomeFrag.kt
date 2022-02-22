package com.koose.monsterdataretroif.ui

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import com.koose.monsterdataretroif.R
import com.koose.monsterdataretroif.data.MonsterData
import com.koose.monsterdataretroif.databinding.MonsterHomeFragmentBinding
import java.lang.StringBuilder
import java.util.*

class MonsterHomeFrag : Fragment() {
    private lateinit var binding:   MonsterHomeFragmentBinding
    private lateinit var viewModel:  MonsterHomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = MonsterHomeFragmentBinding.inflate(inflater, container, false)

        viewModel = ViewModelProvider(this).get(MonsterHomeViewModel::class.java)

        viewModel.monsterData.observe(viewLifecycleOwner, androidx.lifecycle.Observer {
            val strg = StringBuilder()
            for(monsterD in it){
                strg.append(monsterD.monsterName + "\n")
            }
        binding.tvNames.text = strg
        })

        return binding.root

    }



}