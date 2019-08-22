package com.example.tae_kotlin_mvp_git.network

import com.example.tae_kotlin_mvp_git.ConstantsGit

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInstanceGit {
    val retrofitInstances: Retrofit
        get() {
            val httpLoggingInterceptor = HttpLoggingInterceptor()
            val okHttpClient = OkHttpClient.Builder()
                .addInterceptor(httpLoggingInterceptor)
                .build()

            httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY


            return Retrofit.Builder()
                .baseUrl(ConstantsGit.BASE_URL_GIT)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build()
        }
}