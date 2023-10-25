package com.nabin0.github.multimodulenavigation

import android.widget.Toast
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import com.nabin0.github.modularnavigation.HomeViewModel
import com.nabin0.github.navigation.navigation.NavigationDestination
import com.nabin0.github.navigation.navigation.NavigationCommand

@Composable
fun HomeScreen(viewModel: HomeViewModel) {


    val context = LocalContext.current

    Text("Home Screen")
    Button(onClick = {
        Toast.makeText(context, "clicked", Toast.LENGTH_SHORT).show()
        viewModel.navigationManager.navigate(object : NavigationCommand {
            override val destination = NavigationDestination.Dashboard.route

        })
    }) {
        Text(text = "click me")
    }
}