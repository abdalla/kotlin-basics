package demo

// ----- INHERITANCE -----
class Dog(name: String,
               height: Double,
               weight: Double,
               var owner: String) : Animal(name, height, weight){

    // Overriding `Animal.kt` method
    override fun getInfo(): Unit{
        println("$name is $height tall, weighs $weight and is owned by $owner")
    }

}