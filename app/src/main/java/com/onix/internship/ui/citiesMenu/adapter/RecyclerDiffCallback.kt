package com.onix.internship.ui.citiesMenu.adapter

import androidx.recyclerview.widget.DiffUtil
import com.onix.internship.entity.local.Data

class RecyclerDiffCallback : DiffUtil.ItemCallback<Data>() {
    override fun areItemsTheSame(oldItem: Data, newItem: Data): Boolean {
        return oldItem.city.id == newItem.city.id
    }

    override fun areContentsTheSame(oldItem: Data, newItem: Data): Boolean {
        return oldItem == newItem
    }
}