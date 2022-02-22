package com.koose.monsterdataretroif.data.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.koose.monsterdataretroif.R
import com.koose.monsterdataretroif.data.MonsterData

class MonsterAdapter( val context: Context,
                      val monstList: List<MonsterData>
): RecyclerView.Adapter<MonsterAdapter.ViewHolder>(){

    override fun getItemCount() = monstList.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.monster_grid_items, parent, false)

        return ViewHolder(view )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

    }

}