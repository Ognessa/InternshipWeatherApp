package com.onix.internship.ui.tabMenu

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.onix.internship.R
import com.onix.internship.arch.BaseFragment
import com.onix.internship.databinding.TabMenuFragmentBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class TabMenuFragment : BaseFragment<TabMenuFragmentBinding>(R.layout.tab_menu_fragment){

    override val viewModel: TabMenuViewModel by viewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupNavController()
    }

    private fun setupNavController(){
        val navHost = childFragmentManager.findFragmentById(R.id.tabNavFragment) as NavHostFragment
        val navController = navHost.navController
        binding.bottomNavigationView.setupWithNavController(navController)
    }
}