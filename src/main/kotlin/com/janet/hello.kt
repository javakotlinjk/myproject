package com.janet

fun main(args: Array<String>) {
 //println("Hello kotlin")
  //  Human().hello()
    val h = Human()
    h.hello()
    val age : Int = 19 // value 不能改變
    val age2 = 19
    var weight = 55.5f // variable 未來可改變
    var name : String
    name = "janet"
}
class Human{
    fun hello() {
        println("Hello kotlin")
    }
}


