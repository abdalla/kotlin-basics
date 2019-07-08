package demo

import java.util.Random

fun runIt() {
    val name = "Carlos Abdalla" //==> val - values is not going to change
    var age = 37

    println("Hello, $name - $age")

    var bigInt: Int = Int.MAX_VALUE
    var smallInt: Int = Int.MIN_VALUE

    println("Biggest Int: $bigInt")
    println("Smallest Int: $smallInt")

    var bigLong: Long = Long.MAX_VALUE
    var smallLong: Long = Long.MIN_VALUE

    println("Biggest Long : $bigLong")
    println("Smallest Long : $smallLong")

    var bigDouble: Double = Double.MAX_VALUE
    var smallDouble: Double = Double.MIN_VALUE

    println("Biggest Double : $bigDouble")
    println("Smallest Double : $smallDouble")

    var bigFloat: Float = Float.MAX_VALUE
    var smallFloat: Float = Float.MIN_VALUE

    println("Biggest Float : $bigFloat")
    println("Smallest Float : $smallFloat")

    // Doubles are normally precise to 15 digits
    var dblNum1: Double = 1.11111111111111111
    var dblNum2: Double = 1.11111111111111111

    println("Sum : " + (dblNum1 + dblNum2))

    /* We also have the following
    Short 16 Bytes
    Byte 8 Bytes
    */

    // Booleans are either true or false
    if (true is Boolean) {
        print("true is boolean\n")
    }


}

fun castingStuff() {
    // ----- CASTING -----
    // You can cast from one type to another using
    // toShort, toInt, toLong, toFloat, toDouble, toChar,
    // toString

    // Characters are single quoted characters
    var letterGrade: Char = 'A'

    println("A is a Char : " + (letterGrade is Char))

    println("3.14 to Int : " + (3.14.toInt()))
    println("A to Int : " + (letterGrade.toInt()))
    println("65 to Char : " + (65.toChar()))
}

fun stringStuff() {
    // ----- STRINGS -----
    // Strings are double quoted series of characters

    val myName = "Derek Banas"

    val longStr = """This is a
    long string """

    var fName = "Doug"
    var lName = "Smith"

    // You can change values
    fName = "Sally"

    // You can combine strings
    var fullName = fName + " " + lName

    // You can use string interpolation
    println("Name : $fullName")

    // You can perform other operations with {}
    println("1 + 2 = ${1 + 2}")

    // Get length
    println("String length : ${longStr.length}")

    var str1 = "A random string"
    var str2 = "a random string"

    // Compare strings
    println("Strings Equal : ${str1.equals(str2)}")

    // Compare strings
    // 0 : Equal, Negative if less, Positive if greater
    println("Compare A to B : ${"A".compareTo("B")}")

    // Get character at an index
    println("2nd Index : ${str1.get(2)}")

    // Get a substring from start up to but not including end
    println("Index 2-7 : ${str1.subSequence(2,8)}")

    // Checks if a string contains another
    println("Contains random : ${str1.contains("random")}")
}

fun arrayStuff() {
    // ----- ARRAYS -----
    // You can store multiple types in arrays
    var myArray = arrayOf(1, 1.23, "Doug")

    // You can access values using indexes starting at 0
    println(myArray[2])

    // Change the value
    myArray[1] = 3.14
    println(myArray[1])

    // Elements in array
    println("Array Length : ${myArray.size}")

    // Is element in the array
    println("Doug in Array : ${myArray.contains("Doug")}")

    // Get first 2 elements in array as an array
    var partArray = myArray.copyOfRange(0,1)
    println("partArray size: ${partArray.size}")

    // Get the first element
    println("First : ${myArray.first()}")

    // Get index of value
    println("Doug Index : ${myArray.indexOf("Doug")}")

    // Create an array of squares
    var sqArray = Array(5, { x -> x * x})
    println(sqArray[4])

    // There are type specific arrays
    var arr2: Array<Int> = arrayOf(1,2,3)
    println(arr2[2])

}

fun rangeStuff() {
    // ----- RANGES -----
    // You define ranges by providing a starting and ending
    // value

    val oneTo10 = 1..10
    val alpha = "A".."Z"

    // Use in to search a Range
    println("R in alpha : ${"R" in alpha}")

    // Create ranges that decrement
    val tenTo1 = 10.downTo(1)

    // Create array up to a value
    val twoTo20 = 2.rangeTo(20)
    println("towTo20 1st pos: ${twoTo20.first}")
    println("towTo20 last pos: ${twoTo20.last}")

    // Step through an array while adding 3
    val rng3 = oneTo10.step(3)

    // Cycle through a range and print
    for(x in rng3) println("rng3 : $x")

    // Reverse a range
    for(x in tenTo1.reversed()) println("Reverse : $x")
    for(x in tenTo1) println("Conventional : $x")
}

fun conditionalStuff() {
    // ----- CONDITIONALS -----
    // Conditional Operators : >, <, >=, <=, ==, !=
    // Logical Operators : &&, ||, !

    val age = 8

    if (age < 5){
        println("Go to Preschool")
    } else if (age == 5){
        println("Go to Kindergarten")
    } else if ((age > 5) && (age <= 17)){
        val grade = age - 5
        println("Go to Grade $grade")
    } else {
        println("Go to College")
    }

    // When works like Switch in other languages
    when (age) {

        // Match a list
        0,1,2,3,4 -> println("Go to Preschool")

        // Match a specific value
        5 -> println("Go to Kindergarten")

        // Match a range
        in 6..17 -> {
            val grade = age - 5
            println("Go to Grade $grade")
        }

        // Default
        else -> println("Go to College")
    }
}

fun loopStuff() {
    // You can use for loops to cycle through arrays
    // ranges, or anything else that implements the
    // iterator function

    for (x in 1..10){
        println("Loop : $x")
    }

    // Generate a random number from 1 to 50
    val rand = Random()
    val magicNum = rand.nextInt(50) + 1

    // While loops while a condition is true
    var guess = 0

    while(magicNum != guess){
        guess += 1
    }

    println("Magic num is $magicNum and you guessed $guess")

    for (x in 1..20){
        if (x % 2 == 0) {

            // Continue jumps back to the top of the loop
            continue
        }

        println("Odd : $x")

        // Break jumps out of the loop and stops looping
        if (x == 15) break

    }

    var arr3: Array<Int> = arrayOf(3,6,9)

    // Iterate for indexes
    for (i in arr3.indices){
        println("Mult 3 : ${arr3[i]}")
    }

    // Output indexes
    for ((index, value) in arr3.withIndex()){
        println("Index : $index & Value : $value")
    }
}

fun functionStuff() {

    // ----- FUNCTIONS -----
    // Functions start with fun, function name,
    // parameters and return type

    fun add(num1: Int, num2: Int) : Int = num1 + num2
    println("5 + 4 = ${add(5,4)}")

    // You don't need a return type with single line functions
    // You can define default values for parameters
    fun subtract(num1: Int = 1, num2: Int = 1) = num1 - num2
    println("5 - 4 = ${subtract(5,4)}")

    // You can use named parameters
    println("4 - 5 = ${subtract(num2 = 5, num1 = 4)}")

    // Use unit if you return nothing
    fun sayHello(name: String) : Unit = println("Hello $name")
    sayHello("Derek")

    // Functions can return 2 values with Pair and 3 with Triple
    val (two, three) = nextTwo(1)
    println("1 $two $three")

    // Send a variable number of parameters
    println("Sum : ${getSum(1,2,3,4,5)}")

    // We can define function literals
    val multiply = {num1: Int, num2: Int -> num1 * num2}
    println("5 * 3 = ${multiply(5,3)}")

    // Calculate the Factorial with Tail Recursion
    // Factorial 5 * 4 * 3 * 2 * 1
    println("5! = ${fact(5)}")

    println("5! = ${factorial(5)}")
}

fun highOrderFunctionStuff() {
    // ----- HIGHER ORDER FUNCTIONS -----
    // Higher order functions either accepts or returns
    // another function

    // Use filter to find evens
    val numList = 1..20

    // If a function has only 1 parameter you don't
    // have to declare, but just use it instead
    val evenList = numList.filter { it % 2 == 0 }
    evenList.forEach { n -> println(n) }

    // Call a function that returns dynamically
    // created functions
    val mult3 = makeMathFunc(3)
    println("5 * 3 = ${mult3(5)}")

    // A function that receives a list and a function
    val multiply2 = {num1: Int -> num1 * 2}
    val numList2 = arrayOf(1,2,3,4,5)
    mathOnList(numList2, multiply2)
}

fun main() {
    println("Hello World")

//    runIt()
//    castingStuff()
//    stringStuff()
//    arrayStuff()
//    rangeStuff()
//    conditionalStuff()
//    loopStuff()
//    functionStuff()
    highOrderFunctionStuff()
}

// ----- FUNCTIONS -----

// Returns 2 values
fun nextTwo(num: Int): Pair<Int, Int>{
    return Pair(num+1, num+2)
}

// Receive variable number of parameters
fun getSum(vararg nums: Int): Int {
    var sum = 0

    // For each value in the array add it to sum
    nums.forEach { n -> sum += n }

    return sum
}

fun fact(x: Int): Int {
    tailrec fun factTail(y: Int, z: Int): Int {
        if (y == 0) return z
        else return factTail(y - 1, y * z)
    }
    return factTail(x, 1)
}

fun factorial(x: Int): Int {
    if (x == 0) {
        return 1
    }

    return x * factorial(x - 1)
}

// Returns a custom function that multiplies values
// times the value passed to it
fun makeMathFunc(num1: Int): (Int) -> Int = { num2 -> num1 * num2}

// Receives a list and a function to use on the list
fun mathOnList(numList: Array<Int>, myFunc: (num: Int) -> Int){
    for(num in numList){
        println("MathOnList : ${myFunc(num)}")
    }
}