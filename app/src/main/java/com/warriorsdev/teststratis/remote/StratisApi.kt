package com.warriorsdev.teststratis.remote

import com.warriorsdev.teststratis.remote.data.DataTimeZone
import retrofit2.Response
import retrofit2.http.GET

interface StratisApi {

    @GET("api/timezone/America/Mexico_City")
    suspend fun getTimeZoneAsync() : Response<DataTimeZone>

}