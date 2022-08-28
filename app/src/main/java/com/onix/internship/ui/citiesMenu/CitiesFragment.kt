package com.onix.internship.ui.citiesMenu

import com.onix.internship.R
import com.onix.internship.arch.BaseFragment
import com.onix.internship.databinding.CitiesFragmentBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class CitiesFragment : BaseFragment<CitiesFragmentBinding>(R.layout.cities_fragment) {

    override val viewModel: CitiesViewModel by viewModel()

}