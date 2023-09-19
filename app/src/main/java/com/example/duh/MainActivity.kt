package com.example.duh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var nomorAntrian = 0
    lateinit var tampilNomor: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tampilNomor = findViewById<TextView>(R.id.tvNomor)

    }

    fun fTambah1(view: android.view.View) {
        nomorAntrian += 1
        tampilNomor.setText(nomorAntrian.toString())
    }

    fun fTambah2(view: android.view.View) {
        nomorAntrian += 9
        tampilNomor.setText(nomorAntrian.toString())
    }

    fun fTambah5(view: android.view.View) {
        nomorAntrian += 5
        tampilNomor.setText(nomorAntrian.toString())
    }

    fun fkurang1(view: android.view.View) {
        if (nomorAntrian >= 1) {nomorAntrian -= 1
        tampilNomor.setText(nomorAntrian.toString())}
        else{
            Toast.makeText(applicationContext, "Angka lebih kecil dari 1", Toast.LENGTH_LONG).show()
        }
    }

    fun fkurang2(view: android.view.View) {
        if (nomorAntrian >= 9) {nomorAntrian -= 9
            tampilNomor.setText(nomorAntrian.toString())}
        else{
            Toast.makeText(applicationContext, "Angka lebih kecil dari 2", Toast.LENGTH_LONG).show()
        }
    }

    fun fkurang5(view: android.view.View) {
        if (nomorAntrian >= 5) {nomorAntrian -= 5
            tampilNomor.setText(nomorAntrian.toString())}
        else{
            Toast.makeText(applicationContext, "Angka lebih kecil dari 5", Toast.LENGTH_LONG).show()
        }
    }

    fun fReset(view: android.view.View){
        nomorAntrian = 0
        tampilNomor.setText(nomorAntrian.toString())
        Toast.makeText(applicationContext, "Reset", Toast.LENGTH_SHORT).show()
    }

}