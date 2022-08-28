package com.onix.internship.ui.addCity

import com.onix.internship.R
import com.onix.internship.arch.BaseFragment
import com.onix.internship.databinding.AddCityFragmentBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class AddCityFragment : BaseFragment<AddCityFragmentBinding>(R.layout.add_city_fragment){

    override val viewModel: AddCityViewModel by viewModel()

}