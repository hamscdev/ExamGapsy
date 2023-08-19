package com.hamscdev.examgapsy.core
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit


object HelperRetrofit {

    val logging = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BASIC)

    val okHttpClient = OkHttpClient.Builder()
        .readTimeout(60, TimeUnit.SECONDS)
        .connectTimeout(60, TimeUnit.SECONDS)
        .addInterceptor(logging)
        .build()

        fun getRetrofit() : Retrofit {
            return Retrofit.Builder()
                .baseUrl("https://00672285.us-south.apigw.appdomain.cloud/demo-gapsi/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build()
        }



}

