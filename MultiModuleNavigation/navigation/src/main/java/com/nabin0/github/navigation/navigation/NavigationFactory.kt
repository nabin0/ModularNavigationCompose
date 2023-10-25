package com.nabin0.github.navigation.navigation

import androidx.navigation.NavGraphBuilder

interface NavigationFactory {
    /**
     * Create
     *
     * @param builder
     */
    fun create(builder: NavGraphBuilder)
}
