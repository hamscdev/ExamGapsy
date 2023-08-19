package com.hamscdev.examgapsy.ui

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hamscdev.examgapsy.data.model.ItemStack
import com.hamscdev.examgapsy.domain.UseCase
import kotlinx.coroutines.launch

class ViewModelMain: ViewModel(){



     val model = MutableLiveData<List<ItemStack>>()
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
            Log.e("tag word",word)
            val result = uc.invoke(word = word, page = 1)
            if (!result.isNullOrEmpty()){
                model.postValue(result!!)
            }
        }
    }

}