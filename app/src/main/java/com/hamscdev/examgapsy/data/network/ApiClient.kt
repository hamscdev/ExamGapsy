package com.hamscdev.examgapsy.data.network

import com.hamscdev.examgapsy.data.model.ResponseService
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.FieldMap
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query
import retrofit2.http.QueryMap

interface ApiClient {

    @Headers("X-IBM-Client-Id: adb8204d-d574-4394-8c1a-53226a40876e")
    @GET("search")
    suspend fun getProduct(
        @Query("") param: String = "",
        @Query("page") numberPage: Int,
        @Query("query") wordSearch: String): Response<ResponseService>



}