package com.onix.internship.ui.homeMenu

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.DividerItemDecoration
import com.onix.internship.R
import com.onix.internship.arch.BaseFragment
import com.onix.internship.databinding.FragmentHomeBinding
import com.onix.internship.ui.homeMenu.adapter.daysList.DayRecyclerListAdapter
import com.onix.internship.ui.homeMenu.adapter.weatherDuringDayList.WeatherDuringDayRecyclerListAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment : BaseFragment<FragmentHomeBinding>(R.layout.fragment_home) {
    override val viewModel: HomeViewModel by viewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewModel = viewModel

        setRecyclerAdapter()
        setRecyclerDecoration()

        viewModel.getListOfDay()
    }

    private fun setRecyclerAdapter() {
        val daysAdapter = DayRecyclerListAdapter(viewModel)
        val weatherDuringDayAdapter = WeatherDuringDayRecyclerListAdapter()

        binding.dayRecycler.adapter = daysAdapter
        binding.weatherDuringDayRecycler.adapter = weatherDuringDayAdapter

        viewModel.daysList.observe(viewLifecycleOwner) {
            daysAdapter.submitList(it)
        }

        viewModel.weatherDuringDayList.observe(viewLifecycleOwner) {
            weatherDuringDayAdapter.submitList(it)
        }
    }

    private fun setRecyclerDecoration() {
        binding.dayRecycler.addItemDecoration(
            DividerItemDecoration(requireContext(), DividerItemDecoration.HORIZONTAL)
        )
        binding.weatherDuringDayRecycler.addItemDecoration(
            DividerItemDecoration(requireContext(), DividerItemDecoration.HORIZONTAL)
        )
    }
}