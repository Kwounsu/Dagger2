package com.example.dagger2

import dagger.Component

/**
 * Component: Sender
 *
 * Module -> Component -> Inject
 */
@Component(modules = [Module::class])
interface Component {g
    fun inject(activity: MainActivity)
}