package com.ufukgoksu.vki

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View as View1

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
    }

    fun geri (View: View1)
    {
        val geri = Intent(applicationContext,MainActivity::class.java)
        startActivity(geri)
    }
}