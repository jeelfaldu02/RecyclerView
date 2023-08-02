package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    var titles=ArrayList<String>()
    var status=ArrayList<Boolean>()
    lateinit var adapter:TodoAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         var recyclerView=findViewById<RecyclerView>(R.id.rv)

        recyclerView.layoutManager= LinearLayoutManager(this@MainActivity)

        titles.add("hi")
        titles.add("hii")
        titles.add("hiii")
        titles.add("hiiii")
        titles.add("hiiiii")
        titles.add("hiiiiii")

        status.add(false)
        status.add(true)
        status.add(false)
        status.add(true)
        status.add(false)
        status.add(true)


        adapter=TodoAdapter(titles,status,this@MainActivity)

        recyclerView.adapter=adapter
    }
}