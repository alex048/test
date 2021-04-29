package com.barrientos.test.ui.auth

interface AuthListener {
    //TODO:DECLARA FUNCIONES
    fun onStarted()
    fun onSuccess()
    fun onFailure(msg:String)
}