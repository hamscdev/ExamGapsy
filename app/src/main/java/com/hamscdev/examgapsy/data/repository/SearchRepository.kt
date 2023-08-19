package com.hamscdev.examgapsy.data.repository

import android.util.Log
import com.hamscdev.examgapsy.data.model.ItemX
import com.hamscdev.examgapsy.data.model.ResponseService
import com.hamscdev.examgapsy.data.network.ApiService

class SearchRepository {


    private val api = ApiService()

    suspend fun getAllSearch(page: Int, wordSearch: String ): List<ItemX> {
        val response: ResponseService? = api.getSearch(productToSearch = wordSearch, page = page)
        if (response != null) {
            var listItems: List<ItemX> = mutableListOf()
            response.item.props.pageProps.initialData.searchResult.itemStacks.forEach { listItems =  it.items }
            Log.e("listItems", listItems.toString())
           return  listItems
        } else {
            return emptyList()
        }
    }
}