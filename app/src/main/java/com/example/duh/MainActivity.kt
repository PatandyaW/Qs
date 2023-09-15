package com.example.duh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
//import android.view.View
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

    fun fTambah(view: android.view.View) {
        nomorAntrian += 1
        tampilNomor.setText(nomorAntrian.toString())
    }

    fun fReset(view: android.view.View){
        nomorAntrian = 0
        tampilNomor.setText(nomorAntrian.toString())
        Toast.makeText(applicationContext, "Reset", Toast.LENGTH_SHORT).show()
    }

}