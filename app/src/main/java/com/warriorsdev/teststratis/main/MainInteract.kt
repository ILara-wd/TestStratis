package com.warriorsdev.teststratis.main

import com.warriorsdev.teststratis.remote.StratisWS

class MainInteract(private val implMainInteract: ImplMainPresenter) : ImplMainInteract {

    override fun getDataTimeZone(){
        StratisWS.getDataTimeZone{ error, response ->
            if (error != null){
                implMainInteract.showError(error)
            }
            if (response != null){
                implMainInteract.showResponse(response)
            }
        }
    }

}