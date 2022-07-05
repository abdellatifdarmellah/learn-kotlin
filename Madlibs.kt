fun main () {
  
  val costOfGas = 2.28
  val mileage = 25
  // Declare the variable distance below
    
  println("What's your name?")
  var name = readLine()
  // Write your code below
  // friendsName
  println("What's your friend's name?")
  var friendsName = readLine()

  // describe the nature of your trip!
  println("Descrive the nature of your trip!")
  var adjective = readLine()

  // What city will you and your friend be driving to?!
  println("What city will you and your friend be driving to?!")
  var city = readLine()

  // what band you and your friend will be driving to see!
  println("what band you and your friend will be driving to see!")
  var bandName = readLine()

  // what kind of job
  println("what kind of job i'm doing me and $friendsName?")
  var work = readLine()

    var distance: Int
    println("Distance? (between 400 and 600)")
    distance = Integer.valueOf(readLine())
    // calculating total for gas

    var totalForGas = (costOfGas / mileage) * distance
    totalForGas = Math.round(totalForGas * 100) / 100.00
    var totalMoneySaved = totalForGas + 200








  print("""
    A long time ago, $name and their friend $friendsName planned a(n) $adjective road trip to see their favorite band: $bandName. 
    The venue was $distance miles away which meant they needed to save $totalForGas dollars to get there.\n
    Both of them worked as $work for the whole summer and managed to save up a total of $totalMoneySaved dollars!
    To celebrate, they ended up driving to $city for the whole weekend; seeing their band and buying $bandName t-shirts to remember their trip.
    """.trimIndent())
}
