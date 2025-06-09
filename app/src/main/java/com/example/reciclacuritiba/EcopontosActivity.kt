package com.example.reciclacuritiba

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.reciclacuritiba.adapter.EcopontoAdapter
import com.example.reciclacuritiba.model.Ecoponto
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.floatingactionbutton.FloatingActionButton

class EcopontosActivity : AppCompatActivity() {
    private lateinit var adapter: EcopontoAdapter
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ecopontos)

        // Configurar a Toolbar
        val toolbar = findViewById<MaterialToolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        
        setupRecyclerView()
        setupFab()
        
        // TODO: Load ecopontos from database
        loadMockData()
    }

    private fun setupRecyclerView() {
        recyclerView = findViewById(R.id.rvEcopontos)
        adapter = EcopontoAdapter(emptyList()) { ecoponto ->
            // TODO: Handle ecoponto click - show details
            Toast.makeText(this, "Detalhes em desenvolvimento", Toast.LENGTH_SHORT).show()
        }
        
        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@EcopontosActivity)
            adapter = this@EcopontosActivity.adapter
        }
    }

    private fun setupFab() {
        findViewById<FloatingActionButton>(R.id.fabAddEcoponto).setOnClickListener {
            Toast.makeText(this, "Cadastro em desenvolvimento", Toast.LENGTH_SHORT).show()
        }
    }

    private fun loadMockData() {
        // Mock data for testing
        val mockEcopontos = listOf(
            Ecoponto(
                nome = "Ecoponto Centro",
                endereco = "Rua XV de Novembro, 1500",
                materiais = listOf("Papel", "Plástico", "Vidro", "Metal"),
                latitude = -25.428954,
                longitude = -49.271662
            ),
            Ecoponto(
                nome = "Ecoponto Portão",
                endereco = "Rua João Bettega, 100",
                materiais = listOf("Eletrônicos", "Pilhas", "Baterias"),
                latitude = -25.477176,
                longitude = -49.290338
            )
        )
        adapter.updateEcopontos(mockEcopontos)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
} 