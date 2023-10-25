package com.nabin0.github.multimodulenavigation

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.nabin0.github.navigation.navigation.NavigationDestination
import com.nabin0.github.navigation.navigation.NavigationFactory
import javax.inject.Inject

class HomeNavigationFactory @Inject constructor() : NavigationFactory {
    override fun create(builder: NavGraphBuilder) {
        builder.composable(NavigationDestination.Home.route) {
            HomeScreen(viewModel = hiltViewModel())
        }
    }
}
