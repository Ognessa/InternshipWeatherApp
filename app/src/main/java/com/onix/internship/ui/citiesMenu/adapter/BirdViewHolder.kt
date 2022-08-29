package com.onix.internship.ui.citiesMenu.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.onix.internship.databinding.LocationItemBinding
import com.onix.internship.entity.TestDataClass

class BirdViewHolder private constructor(private val binding: LocationItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(item: TestDataClass, onSensorClickListener: OnBirdClickListener) {
        binding.locationItem = item

        binding.executePendingBindings()
    }

    companion object {
        fun from(parent: ViewGroup): BirdViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = LocationItemBinding.inflate(layoutInflater, parent, false)
            return BirdViewHolder(binding)
        }
    }
}