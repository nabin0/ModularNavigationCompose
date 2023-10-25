package com.nabin0.github.modularnavigation

import androidx.lifecycle.ViewModel
import com.nabin0.github.navigation.navigation.NavigationManager
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    val navigationManager: NavigationManager,
) : ViewModel() {
}