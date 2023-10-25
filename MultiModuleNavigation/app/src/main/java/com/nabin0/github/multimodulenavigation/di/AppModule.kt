package com.nabin0.github.multimodulenavigation.di

import com.nabin0.github.multimodulenavigation.HomeNavigationFactory
import com.nabin0.github.navigation.navigation.NavigationFactory
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoSet
import javax.inject.Singleton

@Module
@InstallIn(ViewModelComponent::class)
object SplashViewModelModule {
    /**
     * Home singleton module
     *
     * @constructor Create empty Splash singleton module
     */
    @Module
    @InstallIn(SingletonComponent::class)
    interface SplashSingletonModule {
        /**
         * Bind splash navigation factory
         *
         * @param factory
         * @return
         */
        @Singleton
        @Binds
        @IntoSet
        fun bindSplashNavigationFactory(factory: HomeNavigationFactory): NavigationFactory

    }
}