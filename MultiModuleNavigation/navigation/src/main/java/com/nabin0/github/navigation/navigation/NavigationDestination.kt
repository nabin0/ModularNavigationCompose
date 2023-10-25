package com.nabin0.github.navigation.navigation


sealed class NavigationDestination(
    open var route: String
) {
    data object Home : NavigationDestination("home")
    data object Dashboard : NavigationDestination("dash")
}
