package com.kgc

object Test extends App {
  val person:Person = new Person("xx",7)
  println(person.name+person.age)
}





class Person (var name:String,var age:Int){
  def this(name : String){
    this(name,0)
  }
  def getString(name : String ) :Unit ={

  }
  println("class")
  println("calss1")
}

//object Person{
//  def apply(name: String, age: Int): Person = {
//    println("object aplay")
//    new Person(name,age)
//  }
//}