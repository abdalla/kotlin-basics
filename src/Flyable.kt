package demo

// ----- INTERFACES -----
// An interface is a contract that states all fields
// and methods a class must implement

interface Flyable {
    var flies: Boolean

    fun fly(distMiles: Double): Unit
}