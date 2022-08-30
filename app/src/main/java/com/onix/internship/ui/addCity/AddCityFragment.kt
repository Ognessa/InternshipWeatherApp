package com.onix.internship.ui.addCity

import android.os.Bundle
import android.view.View
import com.onix.internship.R
import com.onix.internship.arch.BaseFragment
import com.onix.internship.arch.ext.navigateToPrevious
import com.onix.internship.databinding.FragmentAddCityBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class AddCityFragment : BaseFragment<FragmentAddCityBinding>(R.layout.fragment_add_city) {
    override val viewModel: AddCityViewModel by viewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewModel = viewModel
    }

    override fun setObservers() {
        super.setObservers()
        viewModel.goBack.observe(viewLifecycleOwner) {
            navigateToPrevious()
        }
    }
}