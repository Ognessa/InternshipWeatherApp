package com.onix.internship.ui.citiesMenu.adapter

import com.onix.internship.arch.adapter.BaseViewHolder
import com.onix.internship.databinding.LocationItemBinding
import com.onix.internship.entity.local.Data

class ViewHolder(locationItemBinding: LocationItemBinding) :
    BaseViewHolder<Data, LocationItemBinding>(locationItemBinding) {
    override fun bindView(position: Int) {
        binding.locationItem = item
    }
}