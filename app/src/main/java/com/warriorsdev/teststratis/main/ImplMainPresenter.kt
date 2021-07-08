package com.warriorsdev.teststratis.main

import com.warriorsdev.teststratis.remote.data.DataTimeZone

interface ImplMainPresenter {
    fun validateRGB(stringRGB: String)
    fun getService()
    fun showError(error: String)
    fun showResponse(response: DataTimeZone)
}