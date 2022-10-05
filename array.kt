package com.example.kotlinbasics.assignments

fun main() {
    var arrayy = arrayListOf<Double>(2.4,4.6,3.5,11.5,8.9)
    var num :Double =0.0
    for (index in arrayy){
        num += index
    }
    var sum = num/5
    println(sum)
}