package com.onix.internship.ui.citiesMenu.adapter

import androidx.recyclerview.widget.DiffUtil
import com.onix.internship.entity.TestDataClass

class BirdDiffCallback : DiffUtil.ItemCallback<TestDataClass>() {
    override fun areItemsTheSame(oldItem: TestDataClass, newItem: TestDataClass): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: TestDataClass, newItem: TestDataClass): Boolean {
        return oldItem.id == newItem.id
    }
}