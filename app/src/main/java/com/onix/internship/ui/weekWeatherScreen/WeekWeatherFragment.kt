package com.onix.internship.ui.weekWeatherScreen

import android.os.Bundle
import android.view.View
import com.onix.internship.R
import com.onix.internship.arch.BaseFragment
import com.onix.internship.arch.ext.navigateToPrevious
import com.onix.internship.databinding.WeekWeatherFragmentBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class WeekWeatherFragment : BaseFragment<WeekWeatherFragmentBinding>(R.layout.week_weather_fragment) {

    override val viewModel: WeekWeatherViewModel by viewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.root.setOnClickListener {
            navigateToPrevious()
        }
    }

}