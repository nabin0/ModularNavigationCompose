package com.nabin0.github.multimodulenavigation.navigation

import android.util.Log
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.nabin0.github.navigation.navigation.NavigationDestination
import com.nabin0.github.navigation.navigation.NavigationFactory

@Composable
fun NavigationHost(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    factories: Set<NavigationFactory>
) {
    Log.d("TAG", "NavigationHost: ${factories.toString()}")
        NavHost(
            navController = navController,
            startDestination = NavigationDestination.Home.route,
        ) {
            Log.d("TAG", "11: ${factories.toString()}")

            factories.forEach {
                it.create(this)
            }
        }
}

