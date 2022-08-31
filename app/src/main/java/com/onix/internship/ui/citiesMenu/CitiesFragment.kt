package com.onix.internship.ui.citiesMenu

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.onix.internship.R
import com.onix.internship.arch.BaseFragment
import com.onix.internship.databinding.FragmentCitiesBinding
import com.onix.internship.ui.citiesMenu.adapter.CityRecyclerListAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

class CitiesFragment : BaseFragment<FragmentCitiesBinding>(R.layout.fragment_cities) {
    override val viewModel: CitiesViewModel by viewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewModel = viewModel

        viewModel.addLocationToRecycler()

        setAdapter()
    }

    override fun setObservers() {
        super.setObservers()

        viewModel.navigateToPrevious.observe(viewLifecycleOwner){
            navigateToPrevious()
        }
    }

    private fun setAdapter() {
        val adapter = CityRecyclerListAdapter(viewModel)

        binding.locationRecycler.adapter = adapter

        viewModel.locationList.observe(viewLifecycleOwner) {
            adapter.submitList(it)
        }
    }

    private fun navigateToPrevious(){
        findNavController().popBackStack()
    }
}