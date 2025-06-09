package com.example.reciclacuritiba

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.card.MaterialCardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<MaterialCardView>(R.id.btnVerEcopontos).setOnClickListener {
            startActivity(Intent(this, EcopontosActivity::class.java))
        }

        findViewById<MaterialCardView>(R.id.btnCadastrarEcoponto).setOnClickListener {
            Toast.makeText(this, "Em desenvolvimento", Toast.LENGTH_SHORT).show()
        }

        findViewById<MaterialCardView>(R.id.btnDicasSustentaveis).setOnClickListener {
            Toast.makeText(this, "Em desenvolvimento", Toast.LENGTH_SHORT).show()
        }

        findViewById<MaterialCardView>(R.id.btnBuscarPorMaterial).setOnClickListener {
            Toast.makeText(this, "Em desenvolvimento", Toast.LENGTH_SHORT).show()
        }
    }
}