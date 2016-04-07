package cxx

import scala.util.control.Breaks._


object Example2 {
  def main(args: Array[String]) 
  {
    //if else 语法
    val s = if(1==1) 1 else 0
    println(s)
    
    //代码块
    val d = {
      val s=1+1
      val g = s*2
      g
    }
    println(d)
    
    //包含上界
    for(i<-0 to 10)
    {
      print(i+",")
    }
    println()
    
    //不包含上界
    for(i<-0 until 10)
    {
      print(i+",")
    }
    println()
    
    
    val s2 = "hello"   
    var sum = ""
    for (ch<-s2) sum +=ch
    println("sum: "+sum)
    
    
    //普通循环不能用break.要用break必须要用breakable
    breakable{
      for(i<-0 until 10)
      {
        if(1 == 1)
        {
          println("break!")
          break;
        }
      }
      
    }
    
    //多层嵌套的一种写法
    for(i<-1 to 3;j<-1 to 3) print((i,j))
    println()  
    for(i<-1 to 3;j<-1 to 3 if i!=j) print((i,j))
    println()
    for(i<-1 to 3;from=4-i;j<-from to 3) print((i,j))
    println()
    
    //返回一个vector
    val numVector = for(i<-1 to 10) yield i%3
    println(numVector)
    
    val name = readLine("your name: ")
    println("name: "+name)
    val  age = readInt()
    println("age: "+age)
  }
}