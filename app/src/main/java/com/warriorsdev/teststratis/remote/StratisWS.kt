package com.warriorsdev.teststratis.remote

import com.warriorsdev.teststratis.remote.data.DataTimeZone
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

object StratisWS {

    fun getDataTimeZone(handler : (error: String?, response: DataTimeZone?) -> Unit){
        GlobalScope.launch(Dispatchers.Main) {

            val api = ApiFactory.Api()
            val response = api.getTimeZoneAsync()

            if (!response.isSuccessful){
                handler ("Ha ocurrido un error al leer el servicio web", null)
            }else{
                val data = response.body()
                handler(null, data)
            }


        }
    }


}