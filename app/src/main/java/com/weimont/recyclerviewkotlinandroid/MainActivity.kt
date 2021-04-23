package com.weimont.recyclerviewkotlinandroid

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    // https://www.youtube.com/watch?v=5xXTTdTAdU8

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) //OK
        setContentView(R.layout.activity_main) //OK

        //val recycler:RecyclerView = findViewById<RecyclerView>(R.id.recyclerIdMain) //OK
        val recycler = findViewById<RecyclerView>(R.id.recyclerIdMain) //OK
        // recycler.layoutManager = LinearLayoutManager(this ,LinearLayoutManager.VERTICAL ,false)
        recycler.layoutManager = LinearLayoutManager(this) // OK

        val listDatos = arrayListOf<String>() // OK


        for (i in 1..50) { // OK
            listDatos.add("Dato # $i ") // OK
            Log.i("LOGTAG", i.toString())

        }



        //val adapter = AdapterDatos(listDatos)
        //recycler.adapter(adapter)

        recycler.adapter = AdapterDatos(listDatos)




    }
}