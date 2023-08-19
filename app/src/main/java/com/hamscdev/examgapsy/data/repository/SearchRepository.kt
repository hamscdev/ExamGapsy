package com.hamscdev.examgapsy.data.repository

import com.hamscdev.examgapsy.data.model.ItemStack
import com.hamscdev.examgapsy.data.model.ResponseService
import com.hamscdev.examgapsy.data.network.ApiService

class SearchRepository {


    private val api = ApiService()

    suspend fun getAllSearch(page: Int, wordSearch: String ): List<ItemStack> {
        val response: ResponseService? = api.getSearch(productToSearch = wordSearch, page = page)
        if (response != null) {
           return response.item.props.pageProps.initialData.searchResult.itemStacks
        } else {
            return emptyList()
        }
    }
}