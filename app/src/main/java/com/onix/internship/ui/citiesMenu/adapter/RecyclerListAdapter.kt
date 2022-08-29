package com.onix.internship.ui.citiesMenu.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import com.onix.internship.R
import com.onix.internship.arch.adapter.BaseRecyclerListAdapter
import com.onix.internship.arch.adapter.BaseViewHolder
import com.onix.internship.databinding.LocationItemBinding
import com.onix.internship.entity.local.Data

class RecyclerListAdapter : BaseRecyclerListAdapter<Data>(RecyclerDiffCallback()) {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BaseViewHolder<Data, out ViewDataBinding> {
        return from(parent)
    }

    private fun from(parent: ViewGroup): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.location_item, parent, false)
        val binding = LocationItemBinding.bind(view)
        return ViewHolder(binding)
    }
}