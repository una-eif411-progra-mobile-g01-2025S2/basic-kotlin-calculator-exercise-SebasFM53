package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val calc= Calculator()

    val a =5.5
    val b = 6.9
    println(calc.addition(a,b))
        try {
            val result = calc.divide(5.0, 0.0)
            println(result)
        } catch (e: IllegalArgumentException) {
            println("Error: ${e.message}")
        }

}