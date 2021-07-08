package com.warriorsdev.teststratis.remote.data

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.squareup.moshi.Moshi
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object RetrofitFactory {

    private val interceptor = run {
        val httpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.apply {
            httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        }
    }

    private val client = OkHttpClient.Builder().addNetworkInterceptor(interceptor).build()

    fun retrofit(): Retrofit = Retrofit.Builder()
        .client(client)
        .baseUrl("http://worldtimeapi.org/")
        .addConverterFactory(
            MoshiConverterFactory.create(
                Moshi.Builder()
                    .build()))
        .addCallAdapterFactory(CoroutineCallAdapterFactory())
        .build()

}