package com.hamscdev.examgapsy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.ProgressBar
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
    lateinit var progressBar: ProgressBar



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
        progressBar = findViewById(R.id.progress_bar)

        searchView.setOnQueryTextListener(this)

        progressBar.visibility = View.VISIBLE
        recycleView.visibility = View.GONE

        setVisible(true)
        vM.onCreate()
        vM.model.observe(this, Observer {
            recycleView.layoutManager = LinearLayoutManager(this)
            recycleView.adapter = adapterList(this, it)
            setVisible(false)

        })
    }

    override fun setVisible(isActive: Boolean){
        if (isActive) {
            progressBar.visibility = View.VISIBLE
            recycleView.visibility = View.GONE
        }else {
            progressBar.visibility = View.GONE
            recycleView.visibility = View.VISIBLE
        }
    }
    override fun onQueryTextSubmit(query: String?): Boolean {
        setVisible(true)
        vM.onCreateSearch(query.toString())
       return false
    }

    override fun onQueryTextChange(newText: String?): Boolean {

        return false
    }

}