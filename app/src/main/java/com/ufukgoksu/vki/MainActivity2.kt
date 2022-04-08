package com.ufukgoksu.vki

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*
import android.view.View as View1

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        /*
        val intent = intent
       val boy = intent.getStringExtra("boy")
       val durum = intent.getStringExtra("durum")

        tvsonuc.text = "${boy}"
        tvdurum.text="Vücut Endeks Durumu | ${durum}"
    }


    fun geri (View: View1) {
        val geriintent = Intent(applicationContext,MainActivity::class.java)
        startActivity(geriintent)
*/

        val intent = intent
        val getboy: Float = intent.getStringExtra("sendboy").toString().toFloat()
        val getkilo: Float = intent.getStringExtra("sendkilo").toString().toFloat()
        val boy = intent.getFloatExtra("sendboy",getboy)
        val  kilo = intent.getFloatExtra("sendkilo",getkilo)
        val sonuc = kilo / ((boy/100) * (boy/100))
        tvsonuc.text = "%.2f".format(sonuc)

        if (sonuc < 18.0) { tvdurum.text = "Kitle Endeks Durumunuz: ZAYIF" }
        else if (sonuc >= 18.0 && sonuc < 30.0) { tvdurum.text = "Kitle Endeks Durumunuz: NORMAL" }
        else if (sonuc >= 30.0 && sonuc < 50.0) { tvdurum.text = "Kitle Endeks Durumunuz: KİLOLU" }
        else if (sonuc > 50.0) { tvdurum.text = "Kitle Endeks Durumunuz: OBEZ" }

    }

        fun geri(View: View1)
        {
            val geriintent = Intent(applicationContext,MainActivity::class.java)
            startActivity(geriintent)
        }

    fun resimac (View: View1)
    {
        val getresim = Intent(applicationContext,MainActivity3::class.java)
        startActivity(getresim)
    }
}