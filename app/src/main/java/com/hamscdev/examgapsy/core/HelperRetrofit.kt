package com.hamscdev.examgapsy.core
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit


object HelperRetrofit {

    val okHttpClient = OkHttpClient.Builder()
        .readTimeout(60, TimeUnit.SECONDS)
        .connectTimeout(60, TimeUnit.SECONDS)
        .build()

        fun getRetrofit() : Retrofit {
            return Retrofit.Builder()
                .baseUrl("https://00672285.us-south.apigw.appdomain.cloud/demo-gapsi/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build()
        }



}

