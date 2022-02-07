package com.example.each_item_scrolls_horizontally_kotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.each_item_scrolls_horizontally_kotlin.R
import com.example.each_item_scrolls_horizontally_kotlin.model.Member

class VerticalAdapter(var context: Context, var members:ArrayList<Member>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.horizontal_recycler,parent,false)
        return VerticalViewHolder(view)
    }

            override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
                var member = members[position]

                if (holder is VerticalViewHolder){

                    var recyclerView = holder.recyclerViewHozrizontal

                    recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL,false)
                    val adapterHorizontal = HorizontalAdapter(context,members)

                    recyclerView.adapter = adapterHorizontal


        }
    }

    override fun getItemCount(): Int {
        return members.size
    }
}

class VerticalViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    var recyclerViewHozrizontal: RecyclerView
    init {
        recyclerViewHozrizontal = view.findViewById(R.id.horizontal_recycler)
    }

}
