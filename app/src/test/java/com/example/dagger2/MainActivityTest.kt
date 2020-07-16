package com.example.dagger2

import android.os.Build
import android.widget.TextView
import androidx.test.core.app.ActivityScenario
import org.junit.After
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@Config(manifest= Config.NONE, sdk = [Build.VERSION_CODES.O_MR1])
@RunWith(RobolectricTestRunner::class)
class MainActivityTest {
    lateinit var scenario: ActivityScenario<MainActivity>

    @Before
    fun setUp() {
        scenario = ActivityScenario.launch(MainActivity::class.java)
    }

    @After
    fun tearDown() {
        scenario.close()
    }

    @Test
    fun getBurger() {
        scenario.onActivity { activity ->
            assertTrue(activity.burger.bun.getBun() == "Wheat bun")
            assertTrue(activity.burger.patty.getPatty() == "Beef patty")
        }
    }

    @Test
    fun setBurger() {
        scenario.onActivity { activity ->
            val bun = Bun()
            val patty = Patty()
            activity.burger = Burger(bun, patty)
        }
    }
}