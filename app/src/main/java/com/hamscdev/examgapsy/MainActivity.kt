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
import com.hamscdev.examgapsy.data.model.ItemX
import com.hamscdev.examgapsy.ui.ViewModelMain

class MainActivity : AppCompatActivity() , OnQueryTextListener {



    val vM: ViewModelMain by viewModels()
    lateinit var recycleView: RecyclerView
    lateinit var searchView: SearchView

     lateinit var adapterList: adapterList
     lateinit var list: List<ItemX>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initial()
    }




    fun initial(){

        list = emptyList()
        recycleView = findViewById(R.id.recyclerView)
        recycleView.layoutManager = LinearLayoutManager(this)
        adapterList = adapterList(this, list)
        searchView = findViewById(R.id.searchView)
        searchView.setOnQueryTextListener(this)

        vM.onCreate()
        vM.model.observe(this, Observer {
            recycleView.adapter = adapterList(this, it)
            list = it
            adapterList.notifyDataSetChanged()

        })
    }

    override fun onQueryTextSubmit(query: String?): Boolean {
        vM.onCreateSearch(query.toString())
       return false
    }

    override fun onQueryTextChange(newText: String?): Boolean {

        return false
    }

}