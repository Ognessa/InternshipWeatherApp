package com.onix.internship.ui.citiesMenu.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import com.onix.internship.R
import com.onix.internship.arch.adapter.BaseRecyclerListAdapter
import com.onix.internship.arch.adapter.BaseViewHolder
import com.onix.internship.databinding.LocationItemBinding
import com.onix.internship.entity.local.Data

class CityRecyclerListAdapter(private val onItemClickListener: OnItemClickListener) : BaseRecyclerListAdapter<Data>(RecyclerDiffCallback()) {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BaseViewHolder<Data, out ViewDataBinding> {
        return from(parent, onItemClickListener)
    }

    private fun from(parent: ViewGroup, onItemClickListener: OnItemClickListener): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.location_item, parent, false)
        val binding = LocationItemBinding.bind(view)
        return ViewHolder(binding, onItemClickListener)
    }
}