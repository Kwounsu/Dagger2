package com.example.dagger2

class Burger (val bun: Bun, val patty: Patty)

class Bun () {
    fun getBun(): String {
        return "Wheat bun"
    }
}
class Patty () {
    fun getPatty(): String {
        return "Beef patty"
    }
}