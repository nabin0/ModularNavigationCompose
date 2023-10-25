package com.nabin0.github.multimodulenavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.nabin0.github.modularnavigation.HomeViewModel
import com.nabin0.github.multimodulenavigation.navigation.NavigationHost
import com.nabin0.github.multimodulenavigation.ui.theme.MultiModuleNavigationTheme
import com.nabin0.github.navigation.navigation.NavigationFactory
import com.nabin0.github.navigation.navigation.NavigationManager
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var navigationFactories: @JvmSuppressWildcards Set<NavigationFactory>

    @Inject
    lateinit var navigationManager: NavigationManager

    lateinit var viewModel: HomeViewModel

    private val scope = CoroutineScope(Dispatchers.IO + SupervisorJob())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        setContent {
            MultiModuleNavigationTheme {
                val navController = rememberNavController()
                Scaffold {
                    NavigationHost(
                        modifier = Modifier
                            .padding(it),
                        navController = navController,
                        factories = navigationFactories
                    )
                }


                LaunchedEffect(navController) {
                        navigationManager
                            .navigationEvent
                            .collect {
                                navController.navigate(it.destination, it.configuration)
                            }
                }
            }
        }
    }
}
