fun main() {
  // Write your code below 🏞
  var responsibilities = listOf("feed the chimps", "play a random game", "conduct a health check on Foxie")
  var responsibilitiesComplete = 0
  var timeSpent = 0
  val totalShiftTime = 4
  var responsibilitiesSize = responsibilities.size 


  var foxiesHealthCheck = mutableMapOf<String, Any?>()
  var chimpsHaveEaten = mutableMapOf("Bonnie" to false, "Jubilee" to false, "Frodo" to false, "Foxie" to false)
  println("First ${responsibilities[0]}")

  for (name in chimpsHaveEaten.keys) {
    println("Feeding $name ...")
    chimpsHaveEaten[name] = true
  }
    
  timeSpent += 1

  responsibilitiesComplete += 1
  println("All chimps have now been fed!")
  println("You've completed ${responsibilitiesComplete} / ${responsibilitiesSize} responsibilities.")
  println("Next, ${responsibilities[1]}")
  var games = mutableSetOf("tug-of-war with a blanket", "catch and throw", "number game")
  var randomGame = games.random()
  println(randomGame)
  timeSpent += 1
  responsibilitiesComplete += 1
  println("Each chimp has now played a game of ${randomGame}! You've completed ${responsibilitiesComplete} / ${responsibilitiesSize} responsibilities.")
  println("Next, ${responsibilities[2]}")

  foxiesHealthCheck.put("temperature", 32.7)
  foxiesHealthCheck.put("mood", "happy")
  println("Foxie has a temperature of ${foxiesHealthCheck["temperature"]} and is feeling ${foxiesHealthCheck["mood"]}")
  timeSpent += 1
  responsibilitiesComplete += 1
  println("You've now completed ${responsibilitiesComplete} / ${responsibilitiesSize} responsibilities.")
  if (timeSpent <= totalShiftTime && responsibilitiesComplete == responsibilitiesSize) {
    println("Congratulations! You did a great job of completing the responsibilities on time")
  }
  else if (timeSpent >= totalShiftTime && responsibilitiesComplete == responsibilitiesSize ) {
    println("Congrats! You've completed all the responsibilities but with overtime")
  }
  else {
      println("Oops! responsibilities are not completed and took extra time")
    }






}
