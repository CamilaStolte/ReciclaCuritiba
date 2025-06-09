package com.example.reciclacuritiba.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.reciclacuritiba.R
import com.example.reciclacuritiba.model.Ecoponto

class EcopontoAdapter(
    private var ecopontos: List<Ecoponto>,
    private val onItemClick: (Ecoponto) -> Unit
) : RecyclerView.Adapter<EcopontoAdapter.EcopontoViewHolder>() {

    class EcopontoViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nomeTextView: TextView = view.findViewById(R.id.tvNomeEcoponto)
        val enderecoTextView: TextView = view.findViewById(R.id.tvEndereco)
        val materiaisTextView: TextView = view.findViewById(R.id.tvMateriais)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EcopontoViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_ecoponto, parent, false)
        return EcopontoViewHolder(view)
    }

    override fun onBindViewHolder(holder: EcopontoViewHolder, position: Int) {
        val ecoponto = ecopontos[position]
        holder.nomeTextView.text = ecoponto.nome
        holder.enderecoTextView.text = ecoponto.endereco
        holder.materiaisTextView.text = "Materiais: ${ecoponto.materiais.joinToString(", ")}"
        
        holder.itemView.setOnClickListener {
            onItemClick(ecoponto)
        }
    }

    override fun getItemCount() = ecopontos.size

    fun updateEcopontos(newEcopontos: List<Ecoponto>) {
        ecopontos = newEcopontos
        notifyDataSetChanged()
    }
} 