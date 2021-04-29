package com.barrientos.test.ui.auth

import android.view.View
import androidx.lifecycle.ViewModel

class AuthViewModel:ViewModel() {
 //TODO:declarar bariables
    var username:String?=null
    var password:String?=null

    var authListener:AuthListener?=null
 //TODO:declarar funcion Onlogin
    fun onLogin(view:View){
     authListener?.onStarted()
        //validacion de datos
        if(username.isNullOrEmpty() || password.isNullOrEmpty()){
            authListener?.onFailure("usuario incorrecto o contraseña")
            //message
            return
        }
        //success
     authListener?.onSuccess()
    }
}