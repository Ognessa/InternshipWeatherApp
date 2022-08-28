package com.onix.internship.ui.homeScreen

import android.os.Bundle
import android.view.View
import com.onix.internship.R
import com.onix.internship.arch.BaseFragment
import com.onix.internship.arch.ext.navigate
import com.onix.internship.databinding.HomeScreenFragmentBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeScreenFragment : BaseFragment<HomeScreenFragmentBinding>(R.layout.home_screen_fragment) {

    override val viewModel: HomeScreenViewModel by viewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.root.setOnClickListener {
            navigate(HomeScreenFragmentDirections.actionHomeScreenFragmentToWeekWeatherFragment())
        }
    }

}