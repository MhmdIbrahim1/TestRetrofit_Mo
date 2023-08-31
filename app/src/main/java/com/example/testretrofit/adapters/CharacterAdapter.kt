package com.example.testretrofit.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.bumptech.glide.Glide
import com.example.testretrofit.R
import com.example.testretrofit.databinding.ItemListBinding
import com.example.testretrofit.model.Character

class CharacterAdapter(private val character: List<Character>) :
    RecyclerView.Adapter<CharacterAdapter.ViewHolder>() {
    class ViewHolder(private val binding: ItemListBinding) : RecyclerView.ViewHolder(binding.root) {
        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ItemListBinding.inflate(layoutInflater, parent, false)
                return ViewHolder(binding)
            }
        }

        fun bind(character: Character){
            binding.textView.text = character.name
            val image = binding.imageView

            Glide.with(itemView)
                .load(character.image)
                .circleCrop()
                .error(R.drawable.erro)
                .into(image)
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }

    override fun getItemCount(): Int {
      return character.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(character[position])
    }

}