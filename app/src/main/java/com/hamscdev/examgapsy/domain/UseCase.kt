package com.hamscdev.examgapsy.domain

import com.hamscdev.examgapsy.data.model.ItemX
import com.hamscdev.examgapsy.data.repository.SearchRepository

class UseCase {



    private val repository = SearchRepository()
    suspend operator fun invoke(word: String , page: Int): List<ItemX>? = repository.getAllSearch(page = page, wordSearch = word)

}