package com.engin.uygulamaornek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var boy = findViewById<EditText>(R.id.boy)
        var kilo = findViewById<EditText>(R.id.kilo)
        var hesapla = findViewById<Button>(R.id.hesapla)
        var sonuc = findViewById<TextView>(R.id.sonuc)
        var durum = findViewById<TextView>(R.id.durum)


        hesapla.setOnClickListener {
            var boybilgi = boy.text.toString().toFloat()/100
            var kilobilgi = kilo.text.toString().toFloat()
            var bki = kilobilgi/(boybilgi*boybilgi)
            sonuc.text = bki.toString()

            if ( 10 < bki && bki < 18.5){
                durum.setText("Zayıf");
            }
            else if ( 18.5 < bki && bki < 25){
                durum.setText("Sağlıklı")
            }
            else if (25 < bki && bki < 30){
                durum.setText("Kilolu")
            }
            else if (30 < bki && bki < 40){
                durum.setText("Şişman")
            }
            else if (40 < bki && bki < 60){
                durum.setText("Aşırı Şişman")
            }
            else{
                durum.setText("Tanımsız Değerler")
            }
        }


        hesapla.setOnLongClickListener {
            boy.setText("")
            kilo.setText("")
            sonuc.text = ""
            durum.text = ""
            Toast.makeText(applicationContext, "Hafıza Temizlendi", Toast.LENGTH_SHORT).show()
            true
        }

    }
}