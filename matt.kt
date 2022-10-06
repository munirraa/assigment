package com.example.myapplication

fun main() {

    var result= (mathematical(4.2 ,3.5,"+"))
    println(result)

}
fun mathematical (number1 :Double,number2 :Double,operatoor :String) :Double {
    val  result : Double
    when (operatoor) {

        "+" -> {
            result =  number1 + number2
        }
        "-" -> {
            result =  number1 - number2
        }
        "*" -> {
            result =  number1 * number2
        }
        else ->  result = number1 / number2
    }
    return result
}