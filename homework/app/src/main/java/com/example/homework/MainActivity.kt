package com.example.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView= findViewById(R.id.recyclerView)

        var pic = ArrayList<image>()


        pic.add(image("https://i.pinimg.com/originals/a9/7e/3e/a97e3e1fa135ca11fe183ebef74c1ab7.jpg"))
        pic.add(image("https://i.pinimg.com/originals/62/d6/55/62d6557fe3d3a77284464132cd8c89d6.gif"))
        pic.add(image("https://i.pinimg.com/originals/86/96/f6/8696f62419dae1f2344ca9fff1d982d6.jpg"))
        pic.add(image("https://images-na.ssl-images-amazon.com/images/I/51MW3h7ktrL.jpg"))
        pic.add(image("https://img.artpal.com/430341/2-19-11-28-8-28-41m.jpg"))
        pic.add(image("https://ih1.redbubble.net/image.593384142.8672/flat,750x,075,f-pad,750x1000,f8f8f8.u2.jpg"))


        val adapter = adapter(pic,this)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter=adapter
    }

}