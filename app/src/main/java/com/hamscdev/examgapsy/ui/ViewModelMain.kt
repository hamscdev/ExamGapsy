package com.hamscdev.examgapsy.ui

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hamscdev.examgapsy.data.model.ItemX
import com.hamscdev.examgapsy.domain.UseCase
import kotlinx.coroutines.launch

class ViewModelMain: ViewModel(){



     val model = MutableLiveData<List<ItemX>>()
     val uc = UseCase()

    fun onCreate(){
        viewModelScope.launch {
            val result = uc.invoke(word = "computer", page = 1)
            if (!result.isNullOrEmpty()){
                model.postValue(result!!)
            }
        }
    }


    fun onCreateSearch(word: String){
        viewModelScope.launch {
            val result = uc.invoke(word = word, page = 1)
            Log.e("Resultado onCreate", result.toString())
            if (!result.isNullOrEmpty()){
                Log.e("Resultado onCreate", result.toString())
                model.postValue(result!!)
            }
        }
    }

}