package com.warriorsdev.teststratis.main

import com.warriorsdev.teststratis.Tools
import com.warriorsdev.teststratis.remote.data.DataTimeZone
import com.warriorsdev.teststratis.ternary

class MainPresenter(private val implMainView :ImplMainView) : ImplMainPresenter {

    private val mainInteract = MainInteract(this)

    override fun validateRGB(stringRGB: String) {

        if ( stringRGB.isEmpty() ){ showError( "Debe poner el número RGB"); return }

        val array = stringRGB.split(",")

        if (array.size >= 3){
            val r = array[0].isEmpty().ternary(0) ?: array[0].toInt()
            val g = array[1].isEmpty().ternary(0) ?: array[1].toInt()
            val b = array[2].isEmpty().ternary(0) ?: array[2].toInt()

            implMainView.showHexadecimal(Tools.validateRGB(r, g, b))
            implMainView.showRGB("$r".plus(",$g").plus(",$b"))

        }else{
            showError( "el formato es incorrecto")
        }

    }

    override fun getService() {
        mainInteract.getDataTimeZone()
    }

    override fun showError(error: String) {
        implMainView.errorMessage(message = error)
    }

    override fun showResponse(response: DataTimeZone) {
        implMainView.dataTimeZone(dataTimeZone = response)
    }

}