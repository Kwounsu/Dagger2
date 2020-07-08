package com.example.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import javax.inject.Inject


/**
 * Inject: Receiver
 *
 * Module -> Component -> Inject
 */
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var burger: Burger

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component:Component = DaggerComponent.builder()
            .build()
        component.inject(this)

        Log.d("MyTag","burger bun : " + burger.bun.getBun() + " , patty : " + burger.patty.getPatty());
    }
}