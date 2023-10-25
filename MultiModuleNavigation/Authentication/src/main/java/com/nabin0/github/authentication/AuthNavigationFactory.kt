package com.nabin0.github.authentication

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.nabin0.github.dashboard.Dashboard
import com.nabin0.github.navigation.navigation.NavigationDestination
import com.nabin0.github.navigation.navigation.NavigationFactory
import javax.inject.Inject

class AuthNavigationFactory @Inject constructor() : NavigationFactory {
    override fun create(builder: NavGraphBuilder) {
        builder.composable(NavigationDestination.Dashboard.route) {
            Dashboard()
        }
    }
}
