package cxx

import scala.collection.mutable.ArrayBuffer

object Example3 {
  def main(args: Array[String]) {

    val start = System.currentTimeMillis

         //定长数组Array
         val nums =  new Array[Int](3)   
         nums.foreach(println)
     
         val numArray =  Array[Int](3,2,1,3,4,5,6)   
         numArray.foreach(println)
         numArray.filter { x => x > 2 }.foreach { println }
         
         //变长数组ArrayBuffer
         val charArray = ArrayBuffer[Char]()
         charArray += 'H'
         charArray += 'i'
         charArray += (',','g')
         charArray ++= Array('i','r','l')
         charArray.foreach { println }
         //还有各种insert,remove等
      println("//////////////////")
         
    val a = 0 until (10, 3)
    println(a)

    val intArray = a.toArray
    val intArray2 = for (ele <- intArray if ele % 2 == 0) yield 2 * ele //
    intArray2.foreach(println)

    val intArray3 = intArray.filter { _ % 3 == 0 }.map { 2 * _ } //
    intArray3.foreach { println }
//
    println(intArray3.mkString("[", ",", "]"))
   
    val matrix = Array.ofDim[Double](3, 4) //3行4列的数组
    
    println("took " + (System.currentTimeMillis - start) + " ms")

  }
}