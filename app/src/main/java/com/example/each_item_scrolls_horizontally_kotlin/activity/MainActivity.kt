package com.example.each_item_scrolls_horizontally_kotlin.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.each_item_scrolls_horizontally_kotlin.R
import com.example.each_item_scrolls_horizontally_kotlin.adapter.HorizontalAdapter
import com.example.each_item_scrolls_horizontally_kotlin.adapter.VerticalAdapter
import com.example.each_item_scrolls_horizontally_kotlin.model.Member

class MainActivity : AppCompatActivity() {


    lateinit var recyclerViewVertical: RecyclerView
   lateinit var recyclerViewHorizontal: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        recyclerViewVertical = findViewById(R.id.recycler_view_vertical)

        recyclerViewVertical.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        refreshAdapter(getMembers())
    }

    private fun refreshAdapter(members: ArrayList<Member>) {

        val adapterVertical = VerticalAdapter(this,members)

        recyclerViewVertical.adapter = adapterVertical

    }

    private fun getMembers(): ArrayList<Member> {

        var members: ArrayList<Member> = ArrayList()

        for(i in 0..25){
            members.add(Member("Sarvar $i"))
        }
        return  members

    }
}