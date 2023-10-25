package com.nabin0.github.multimodulenavigation.navigation

import com.nabin0.github.multimodulenavigation.navigation.NavigationManagerImpl
import com.nabin0.github.navigation.navigation.NavigationManager
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Navigation module
 * @author Anand
 *
 * @constructor Create empty Navigation module
 */
@Module
@InstallIn(SingletonComponent::class)
interface NavigationModule {

    /**
     * Bind navigation manager
     *
     * @param impl
     * @return
     */
    @Binds
    @Singleton
    fun bindNavigationManager(impl: NavigationManagerImpl): NavigationManager
}
