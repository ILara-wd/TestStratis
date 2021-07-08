package com.warriorsdev.teststratis

object Tools {
    fun validateRGB(r : Int, g  : Int, b  : Int)  : String { return String.format("#%02X%02X%02X", r, g, b) }
}

infix fun <T : Any> Boolean.ternary(value: T): T? = if(this) value else null