package com.onix.internship.ui.settingsMenu

import com.onix.internship.R
import com.onix.internship.arch.BaseFragment
import com.onix.internship.databinding.SettingsFragmentBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class SettingsFragment : BaseFragment<SettingsFragmentBinding>(R.layout.settings_fragment) {

    override val viewModel: SettingsViewModel by viewModel()

}