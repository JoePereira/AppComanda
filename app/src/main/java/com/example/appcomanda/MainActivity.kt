package com.example.appcomanda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etCoxinha = findViewById<EditText>(R.id.etCoxinha)
        val etBebidas = findViewById<EditText>(R.id.etBebidas)
        val btnTotal = findViewById<Button>(R.id.btnTotal)

        btnTotal.setOnClickListener{
            val coxinhas = etCoxinha.text.toString().toInt()
            val bebidas = etBebidas.text.toString().toInt()
            val intentResult = Intent(this, ValorTotalActivity::class.java)
            intentResult.putExtra("coxinhas", coxinhas)
            intentResult.putExtra("bebidas", bebidas)
            startActivity(intentResult)
        }

    }
}