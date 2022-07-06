// Write your code here 
class Calculator(name: String) {
  init {
    println("${name} Calculator!")
  }
  fun add(x: Int, y: Int): Int {
    return x + y
  }
  fun subtract (x: Int, y: Int): Int {
    return x - y
  }
  fun multiply (x: Int, y: Int): Int {
    return x * y
  }
  fun divide (x: Int, y: Int): Any {
    if (y == 0) {
      println("Error")
    }
    return x / y
  }
  fun power(x: Int, y: Int): Int {
    var z = 1
    for (i in 1..y) {
      z = z * x
    }
    return z
  }

}
fun main() {
  val user = Calculator("Codey")
  println(user.add(1, 2))
  println(user.subtract(1, 2))
  println(user.multiply(1, 2))
  println(user.divide(1, 2))
  println(user.power(5, 2))

}
