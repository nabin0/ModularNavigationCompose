package com.nabin0.github.navigation.navigation

import kotlinx.coroutines.flow.Flow

interface NavigationManager {
    val navigationEvent: Flow<NavigationCommand>

    /**
     * Navigate
     *
     * @param command
     */
    fun navigate(command: NavigationCommand)
}
