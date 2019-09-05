package com.janet

fun main(args: Array<String>) {
 //println("Hello kotlin")
  //  Human().hello()
    var s : String? = "abcde" //?讓s可以為 null
    s = null //不會出現 nullpointerexception
    println(s?.length)  //* s!! null exception 要被處理，不當調
    println(s?.get(3))
    println(s?.substring(3))
    val h = Human(weight = 55.5f, height = 17.2f)
    h.hello()
    println(h.bmi())
    val score = 88;
    println(score > 80)
    val c : Char = 'A'
    println(c.toInt())
    println(c.toInt() > 60)
   /* val age : Int = 19 // value 不能改變
    val age2 = 19
    var weight = 55.5f // variable 未來可改變
    var name : String
    name = "janet"*/
}
class Human(var name: String="", var weight: Float, var  height: Float){
    init {
        println("test $weight")
    }
    //constructor(name:String,weight: Float,height: Float):this(weight,height)
    fun bmi() : Float {
        val bmi = weight / (height*height)
        return  bmi
    }
    fun hello() {
        println("Hello kotlin")
    }
}


