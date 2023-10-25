package com.nabin0.github.authentication

import com.nabin0.github.navigation.navigation.NavigationFactory
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoSet
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface HomeSingletonModule {

    /**
     * Bind home navigation factory
     *
     * @param factory
     * @return
     */
    @Singleton
    @Binds
    @IntoSet
    fun bindHomeNavigationFactory(factory: AuthNavigationFactory): NavigationFactory
}