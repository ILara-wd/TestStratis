package com.warriorsdev.teststratis.remote

import com.warriorsdev.teststratis.remote.data.RetrofitFactory

object ApiFactory {

    fun Api() : StratisApi{
        return RetrofitFactory
            .retrofit()
            .create(StratisApi::class.java)
    }
}