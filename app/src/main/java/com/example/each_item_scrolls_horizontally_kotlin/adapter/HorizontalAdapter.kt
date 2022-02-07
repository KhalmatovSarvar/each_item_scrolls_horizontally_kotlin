package com.example.each_item_scrolls_horizontally_kotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.each_item_scrolls_horizontally_kotlin.R
import com.example.each_item_scrolls_horizontally_kotlin.model.Member

class HorizontalAdapter(var context: Context, var members:ArrayList<Member>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.horizontal_item_view,parent,false)
        return HorizontalViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var member = members[position]

        if (holder is HorizontalViewHolder){
            var tv = holder.tv

            tv.text = member.name
        }
    }

    override fun getItemCount(): Int {
        return members.size
    }
}

class HorizontalViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    var tv :TextView
    init {
        tv = view.findViewById(R.id.tv_name_horizontal)
    }

}
