package com.hamscdev.examgapsy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.WindowManager
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



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        setContentView(R.layout.activity_main)

        initial()
    }

    override fun onDestroy() {
        super.onDestroy()
        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
    }




    fun initial(){
        recycleView = findViewById(R.id.recyclerView)

        searchView = findViewById(R.id.searchView)
        searchView.setOnQueryTextListener(this)

        vM.onCreate()
        vM.model.observe(this, Observer {
            recycleView.layoutManager = LinearLayoutManager(this)
            recycleView.adapter = adapterList(this, it)
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