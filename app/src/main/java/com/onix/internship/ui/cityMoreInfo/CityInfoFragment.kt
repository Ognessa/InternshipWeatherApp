package com.onix.internship.ui.cityMoreInfo

import com.onix.internship.R
import com.onix.internship.arch.BaseFragment
import com.onix.internship.databinding.CityInfoFragmentBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class CityInfoFragment : BaseFragment<CityInfoFragmentBinding>(R.layout.city_info_fragment){
    override val viewModel: CityInfoViewModel by viewModel()

}