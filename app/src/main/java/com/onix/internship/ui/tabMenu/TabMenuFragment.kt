package com.onix.internship.ui.tabMenu

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.onix.internship.R
import com.onix.internship.arch.BaseFragment
import com.onix.internship.arch.ext.navigate
import com.onix.internship.databinding.FragmentTabMenuBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class TabMenuFragment : BaseFragment<FragmentTabMenuBinding>(R.layout.fragment_tab_menu) {
    override val viewModel: TabMenuViewModel by viewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupNavController()
    }

    override fun setObservers() {
        super.setObservers()

        viewModel.model.goToAddFragment.observe(viewLifecycleOwner) {
            navigateToAddFragment()
        }
    }

    private fun navigateToAddFragment() {
        navigate(TabMenuFragmentDirections.actionTabMenuFragmentToAddCityFragment())
    }

    private fun setupNavController() {
        val navHost = childFragmentManager.findFragmentById(R.id.tabNavFragment) as NavHostFragment
        val navController = navHost.navController
        binding.bottomNavigationView.setupWithNavController(navController)
    }
}