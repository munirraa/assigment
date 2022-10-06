package com.example.myapplication



fun main() {
    var result = (mathematical(4.2 ,3.5,"+"))
    println(result)
    var subscriptt = (mathematical(1.1 ,3.5,"-"))
    println(subscriptt)
    var multi= (mathematical(2.8 ,2.5,"*"))
    println(multi)
    var dividedd = (mathematical(4.2 ,8.5,"/"))
    println(dividedd )

}
fun mathematical (number1 :Double,number2 :Double,operatoor :String) :Double {
    var result = number1 + number2
    var subscriptt =  number1 -number2
    var multi = number1 * number2
    var dividedd = number1 / number2
    return result
    return subscriptt
    return multi
    return dividedd
}