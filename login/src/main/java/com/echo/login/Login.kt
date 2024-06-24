package com.echo.login

import android.util.Log

object Login {
    private const val userId: String = "234"
    fun login(){
        Log.e("SDK Login", "login success. user: $userId")
    }
}