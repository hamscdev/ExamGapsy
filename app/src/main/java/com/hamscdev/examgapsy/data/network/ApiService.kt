package com.hamscdev.examgapsy.data.network

import android.util.Log
import com.hamscdev.examgapsy.core.HelperRetrofit
import com.hamscdev.examgapsy.data.model.ResponseService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.ResponseBody
import retrofit2.Response


class ApiService {

    private val r = HelperRetrofit.getRetrofit()

    suspend fun getSearch(productToSearch: String, page: Int): ResponseService? {
        return withContext(Dispatchers.IO) {
           val response: Response<ResponseService> = r.create(ApiClient::class.java).getProduct(
                numberPage = page,
                wordSearch = productToSearch)
            Log.e("ERROR", response.body().toString())
            response.body()
        }
    }
}