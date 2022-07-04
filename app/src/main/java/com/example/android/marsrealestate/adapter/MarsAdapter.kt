package com.example.android.marsrealestate.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android.marsrealestate.databinding.MarsItemsListBinding
import com.example.android.marsrealestate.network.MarsProperty
import java.util.zip.Inflater

class MarsAdapter() : RecyclerView.Adapter<MarsAdapter.MarsViewHolder>() {


    private val marsPropertyList : MutableList<MarsProperty> = mutableListOf()

    inner class MarsViewHolder(private val binding : MarsItemsListBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(marsProperty : MarsProperty){
            binding.vm = marsProperty
            binding.executePendingBindings()
            //binding.idText.text = marsProperty.id
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MarsViewHolder {
        val inflate = LayoutInflater.from(parent.context)
        val layout = MarsItemsListBinding.inflate(inflate, parent, false)
        return MarsViewHolder(layout)
    }

    override fun onBindViewHolder(holder: MarsViewHolder, position: Int) {
        val marsProperty = marsPropertyList[position]
        holder.bind(marsProperty)
    }

    fun setMarsProperty(marsPropertyValue: List<MarsProperty>){
        marsPropertyList.clear()
        marsPropertyList.addAll(marsPropertyValue)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return marsPropertyList.size
    }
}