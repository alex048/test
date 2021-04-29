package com.barrientos.test.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.barrientos.test.R
import com.barrientos.test.databinding.ActivityLoginBinding
import com.barrientos.test.util.toast

class LoginActivity : AppCompatActivity(),AuthListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityLoginBinding=DataBindingUtil.setContentView(this,R.layout.activity_login)
       // setContentView(R.layout.activity_login)
        val viewModel= ViewModelProviders.of(this).get(AuthViewModel::class.java)
        binding.viewmodel=viewModel

        viewModel.authListener=this
    }

    override fun onStarted() {
        toast("Login onStarted")
    }

    override fun onSuccess() {
        toast("Login onSuccess")
    }

    override fun onFailure(msg: String) {
        toast(msg)
    }
}