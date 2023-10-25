package com.nabin0.github.multimodulenavigation.navigation

import com.viewlift.core.di.MainImmediateScope
import com.nabin0.github.navigation.navigation.NavigationCommand
import com.nabin0.github.navigation.navigation.NavigationManager
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * Navigation manager impl
 * @author Anand
 *
 * @property externalMainImmediateScope
 * @constructor Create Navigation manager impl
 */
class NavigationManagerImpl @Inject constructor(
    @MainImmediateScope private val externalMainImmediateScope: CoroutineScope
) : NavigationManager {
    private val navigationCommandChannel = Channel<NavigationCommand>(Channel.BUFFERED)
    override val navigationEvent = navigationCommandChannel.receiveAsFlow()

    override fun navigate(command: NavigationCommand) {
        externalMainImmediateScope.launch {
            navigationCommandChannel.send(command)
        }
    }
}
