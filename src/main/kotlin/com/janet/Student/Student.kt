package com.janet.Student

import java.util.*

fun main() {
    //userInput2()
    val stu = Student2("Janet", 80, 70   )
    stu.print()
    val test = "1234"
    println("value=$test") //$ 代表變數
    println("highscore = ${stu.highscore()}") //{}代表方法傳回直
}
class Student2(var name:String?,var english:Int,var math:Int) {
    fun print(){
        println("$name\t$english\t$math\t${getAvg()}\t${passOrFail()}\t${getGrade()}")
      /*  println(name+"\t"+english+"\t"+math+"\t"+getAvg() + "\t"
                + passOrFail() +"\t" )
        println("grade=" + getGrade())*/
    }
    fun getGrade() = when(getAvg()){ //like switch case
        in 90..100 -> 'A'
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        in 60..69 -> 'D'
        else -> 'F'
    }
    fun passOrFail() = if (getAvg() >=60) "Pass" else "Fail"
    /*fun getAvg() : Int{
      return  (english+math)/2
    }*/
    fun getAvg() = (english+math)/2
    /*fun highscore() : Int {
        var max = if (english> math)
        {
            english
        }
        else{
            math
        }
        return max
    }*/
    fun highscore() = if (english> math)
    {
        english
    }
    else{
        math
    }
    fun nameCheck(){
        println(name?.length)
    }
private fun userInput2() {
    val scanner = Scanner(System.`in`)
    print("please enter students name:")
    //val name = scanner.next()
    val name = null
    print("please enter students english:")
    val english = scanner.nextInt()
    print("please enter students math:")
    val math = scanner.nextInt()
    val stu = Student2(name, english, math)
    stu.print()
    stu.nameCheck()
}


}