package com.koose.monsterdataretroif.data.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
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
        val monster = monstList[position]
        holder.nameText.text = monster.monsterName
        holder.ratingBar.rating = monster.scariness.toFloat()

        Glide.with(context)
            .load(monster.imageFileUrl)
            .into(holder.monsterImage)
    }

    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val nameText: TextView = itemView.findViewById(R.id.nameText)
        val monsterImage: ImageView = itemView.findViewById(R.id.monsterImage)
        val ratingBar: RatingBar = itemView.findViewById(R.id.ratingBar)

    }

}