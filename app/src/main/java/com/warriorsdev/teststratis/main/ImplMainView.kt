package com.warriorsdev.teststratis.main

import com.warriorsdev.teststratis.remote.data.DataTimeZone

interface ImplMainView {
    fun errorMessage(message: String)
    fun showHexadecimal(hexadecimal: String)
    fun showRGB(rgbString: String)
    fun dataTimeZone(dataTimeZone: DataTimeZone)
}