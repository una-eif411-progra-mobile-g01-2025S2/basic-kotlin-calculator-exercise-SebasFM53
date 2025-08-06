package org.example

class Calculator {
    fun addition(a: Double, b: Double): Double {
        return a + b
    }
    fun subtract(a: Double, b: Double): Double {
        return a-b
    }
    fun multiply(a: Double, b: Double): Double {
        return a*b
    }
    fun divide(a: Double, b: Double): Double {
        require(b!=0.0){"No se puede dividir entre 0"}
        return a / b
    }
}