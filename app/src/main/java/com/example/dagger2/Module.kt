package com.example.dagger2

import dagger.Module
import dagger.Provides

/**
 * Module: Provider
 *
 * Module -> Component -> Inject
 */
@Module
class Module {
    @Provides
    fun provideBurger(bun:Bun, patty:Patty): Burger {
        return Burger(bun, patty)
    }

    @Provides
    fun provideBun(): Bun {
        return Bun()
    }

    @Provides
    fun providePatty(): Patty {
        return Patty()
    }
}