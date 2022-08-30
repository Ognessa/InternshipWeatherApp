package com.onix.internship.ui.cityMoreInfo

import com.onix.internship.R
import com.onix.internship.arch.BaseFragment
import com.onix.internship.databinding.FragmentCityInfoBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class CityInfoFragment : BaseFragment<FragmentCityInfoBinding>(R.layout.fragment_city_info) {
    override val viewModel: CityInfoViewModel by viewModel()

}