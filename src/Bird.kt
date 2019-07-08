package demo

// We override flies in the constructor
// To implement the interface we follow the
// constructor parameters with a colon and the
// interface name
class Bird constructor(val name: String, override var flies: Boolean = true) : Flyable{

    // We must also override any methods in the interface
    override fun fly(distMiles: Double): Unit{
        if(flies){
            println("$name flies $distMiles miles")
        }
    }
}