package com.ufukgoksu.vki

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun hesapla(View: View) {

        /*

        var boy: Double? = 0.0
        var kilo: Double? = 0.0

        boy = txtboy.text.toString().toDoubleOrNull()
        kilo = txtkilo.text.toString().toDoubleOrNull()

        if (boy!=null && kilo!= null){
            var xboy: Double = boy!!/100
            var sonuc =(kilo!!/(xboy*xboy))
            var durum = ""
            if (sonuc <= 18.0) {
                durum = "ZAYIF"
                println(durum)
            }
            else if (sonuc > 18.0 && sonuc <= 30)
            {
                durum = "NORMAL"
                println(durum)
            } else if (sonuc>30.0 && sonuc <= 50)
            {
                durum = "KİLOLU"
                println(durum)
            } else if (sonuc > 50)
            {
                durum = "OBEZ"
                println(durum)
            }

            val intent = Intent(applicationContext,MainActivity2::class.java)
            intent.putExtra("boy",sonuc.toString().substring(0,5))
            intent.putExtra("durum",durum.toString())
            startActivity(intent)

            /* alert
            val alert = AlertDialog.Builder(this)
            alert.setTitle("Vücut Kitle Endeks")
            alert.setMessage("%.2f".format(sonuc))
            alert.setNegativeButton("Kapat") {dialog,which ->
                txtboy.text.clear()
                txtkilo.text.clear()
            }*/

        }
        else if (boy==null)
        {
            Toast.makeText(this,"Lütfen Boyunuzu Yazınız",Toast.LENGTH_SHORT).show()
        }else if (kilo==null)
        {
            Toast.makeText(this,"Lütfen Kilonuzu Yazınız",Toast.LENGTH_SHORT).show()
        }



*/

        val boy: Float? = txtboy.text.toString().toFloatOrNull()
        val kilo: Float? = txtkilo.text.toString().toFloatOrNull()

        if (boy!=null && kilo != null)
        {
            if (boy.toString().toFloat() <= 99 || boy.toString().toFloat() >= 201)
            {
                Toast.makeText(this,"Boyunuz 100 - 200 cm arasında olmalıdır",Toast.LENGTH_SHORT).show()
            }
            else if (kilo.toString().toFloat() <= 29 || kilo.toString().toFloat() >= 301)
            {
                Toast.makeText(this,"Kilonuz 30 - 300 km arasında olmalıdır",Toast.LENGTH_SHORT).show()
            }
            else
            {
            val intent = Intent(applicationContext,MainActivity2::class.java)
            intent.putExtra("sendboy",txtboy.text.toString())
            intent.putExtra("sendkilo",txtkilo.text.toString())
            startActivity(intent)
            }
        }
        else if (boy==null)
        {
            Toast.makeText(this,"Lütfen Boyunuzu Yazınız",Toast.LENGTH_SHORT).show()
        } else if (kilo==null)
        {
            Toast.makeText(this,"Lütfen Kilonuzu Yazınız",Toast.LENGTH_SHORT).show()
        }
    }
}