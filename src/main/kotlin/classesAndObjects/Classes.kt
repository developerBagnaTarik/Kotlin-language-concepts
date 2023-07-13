package classesAndObjects

//  CLASSES
/*
    Way to declare class
*/
class Person{

}
//  CONSTRUCTORS
//      PRIMARY CONSTRUCTORS
// To define a class with his primary constructor
class AnotherPerson constructor(firstname:String){

}

//  if the primary constructor does not have any annotations or visibility modifiers,the constructor keyword can be
//  omitted
class ThirdPerson(firstname: String){

}

//  The primary constructor cannot contain any code.
//  Initialization code can be placed in initializer blocks prefixed with the init keyword.
class InitOrderDemo(name: String) {
    val firstProperty = "First property: $name".also(::println)

    init {
        println("First initializer block that prints $name")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer block that prints ${name.length}")
    }
}

//  We can use trailing comma
class Person3(
    val someVariable:String,
    var someVariable2: Int,
){}

//  As you can see below val variables are variables that cannot be mutable
//  var can
//  If the constructor has annotations or visibility modifiers the constructor keyword is required
class Customer private constructor(name:String){
}
//      SECOND CONSTRUCTORS
//          inside the class which are prefixed with constructor keyword

class Person4(val pets:MutableList<Pet> = mutableListOf())
class Pet{
    constructor(owner:Person4){
        owner.pets.add(this)
    }
}

//          If the class has a primary constructor,
//          each secondary constructor needs to delegate to the primary constructor directly or indirectly
//          through another secondary constructor
//          the delegation is done with the "this" keyword
class Person5(val name:String){
    private val children: MutableList<Person5> = mutableListOf()

    constructor(name: String,parent:Person5) : this(name) {
        parent.children.add(this)
    }
}

//          Non-abstract class declared with no constructor will have a primary constructor with no args
//          And his visibility will be public

//          If you don't want the visibility to be public,
//          You can change it
class DontCreateMe private constructor(){}
//  CREATING INSTANCES OF CLASSES
val aPerson = Person4()
val aCustomer = Person()
//  CLASSES MEMBERS
//      Constructors and initializer blocks
//      Functions
//      Properties
//      Nested and Inner classes
//      Object declarations
//  ABSTRACT CLASSES
abstract class Polygon{
    abstract fun draw()
}

class Rectangle:Polygon(){
    override fun draw() {
        // Draw code
    }

}

//      We can override a non-abstract method
//      With the open keyword
open class Polygon2{
    open fun draw(){

    }
}

abstract class WillShape:Polygon2(){
    abstract override fun draw()
}