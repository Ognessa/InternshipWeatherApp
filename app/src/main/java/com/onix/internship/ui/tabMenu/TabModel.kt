package com.onix.internship.ui.tabMenu

import androidx.databinding.ObservableField
import com.onix.internship.arch.lifecycle.SingleLiveEvent

data class TabModel(
    val goToAddFragment: SingleLiveEvent<Unit> = SingleLiveEvent(),
    val location: ObservableField<String> = ObservableField()
)