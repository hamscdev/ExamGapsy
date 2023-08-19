package com.hamscdev.examgapsy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import androidx.appcompat.widget.SearchView.OnQueryTextListener
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hamscdev.examgapsy.adapter.adapterList
import com.hamscdev.examgapsy.ui.ViewModelMain

class MainActivity : AppCompatActivity() , OnQueryTextListener {



    val vM: ViewModelMain by viewModels()
    lateinit var recycleView: RecyclerView
    lateinit var searchView: SearchView




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initial()
    }




    fun initial(){
        recycleView = findViewById(R.id.recyclerView)
        searchView = findViewById(R.id.searchView)
        searchView.setOnQueryTextListener(this)
        vM.model.observe(this, Observer {
            recycleView.layoutManager = LinearLayoutManager(this)
            recycleView.adapter = adapterList(this, it)
        })
    }

    override fun onQueryTextSubmit(query: String?): Boolean {
       return false
    }

    override fun onQueryTextChange(newText: String?): Boolean {
        vM.onCreateSearch(newText.toString())
        return false
    }

}