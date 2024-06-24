package com.echo.multi_module

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.echo.core.Core
import com.echo.login.Login

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Core.init()
        Login.login()

    }
}