// Write your code below
fun getListOfNumbers(): List<Int> {
  var myList = mutableListOf<Int>()
  for (i in 1..7) {
    println("Enter a number:")
    var number = Integer.valueOf(readLine())
    myList.add(number)
  }
  return myList
}
fun findMax(list: List<Int>): Int {
  var largestNumber = list[0]
  for (i in list) {
    if (i > largestNumber) {
      largestNumber = i
    }
  }
  return largestNumber
}
fun findMin(list: List<Int>): Int {
  var smallestNumber = list[0]
  for (i in list) {
    if (i < smallestNumber) {
      smallestNumber = i
    }
  }
  return smallestNumber
}
fun findAverage(list: List<Int>): Int {
  var sum = 0
  for (i in list) {
    sum = sum + i
  }
  return sum / list.size
}

fun checkIfListContains(list: List<Int>, x: Int): Boolean {
  for (i in list) {
    if (x == i) {
      return true
    }
  }
  return false
}
fun main() {
  // Write more code below
  var values = getListOfNumbers()
  println(values)
  var largestValue = findMax(values)
  println("The largest number is // Write your code below
fun getListOfNumbers(): List<Int> {
  var myList = mutableListOf<Int>()
  for (i in 1..7) {
    println("Enter a number:")
    var number = Integer.valueOf(readLine())
    myList.add(number)
  }
  return myList
}
fun findMax(list: List<Int>): Int {
  var largestNumber = list[0]
  for (i in list) {
    if (i > largestNumber) {
      largestNumber = i
    }
  }
  return largestNumber
}
fun findMin(list: List<Int>): Int {
  var smallestNumber = list[0]
  for (i in list) {
    if (i < smallestNumber) {
      smallestNumber = i
    }
  }
  return smallestNumber
}
fun findAverage(list: List<Int>): Int {
  var sum = 0
  for (i in list) {
    sum = sum + i
  }
  return sum / list.size
}

fun checkIfListContains(list: List<Int>, x: Int): Boolean {
  for (i in list) {
    if (x == i) {
      return true
    }
  }
  return false
}
fun main() {
  // Write more code below
  var values = getListOfNumbers()
  println(values)
  var largestValue = findMax(values)
  println("The largest number is ${largestValue}.")
  var smallestNumber = findMin(values)
  println("The smallest number is ${smallestNumber}.")
  var average = findAverage(values)
  println("The average is ${average}.")
  println("Enter a number to check for:")
  var numToFind = Integer.valueOf(readLine())
  var containsValue = checkIfListContains(values, numToFind)
  if (containsValue == true) {
    println("${numToFind} exists within the list.")
  }
    else {
      println("${numToFind} doesn't exist within the list.")
    }



}

${largestValue}.")
  var smallestNumber = findMin(values)
  println("The smallest number is ${smallestNumber}.")
  var average = findAverage(values)
  println("The average is ${average}.")
  println("Enter a number to check for:")
  var numToFind = Integer.valueOf(readLine())
  var containsValue = checkIfListContains(values, numToFind)
  if (containsValue == true) {
    println("${numToFind} exists within the list.")
  }
    else {
      println("${numToFind} doesn't exist within the list.")
    }



}

