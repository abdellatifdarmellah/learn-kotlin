fun main() {
  val quizAnswer1 = 15
  var quizAnswer2 = 3
  val quizAnswer3 = "isosceles"
  val quizAnswer4 = 47

  // Write your code below
 println("What is 75 / 5?")
 var studentAnswer1 = Integer.valueOf(readLine())
 println("value of y? in the equation: 6 * 2y = 36")
 var studentAnswer2 = Integer.valueOf(readLine())

 println("what's the tpe of triange that has two equal sides?")
 var studentAnswer3 = readLine()

 println("What's the value of: 8 * 6 - (3 - 2)")
 var studentAnswer4 = Integer.valueOf(readLine())

 var points = 0
  if (studentAnswer1 == quizAnswer1) {
    points += 25
  }
  if (studentAnswer2 == quizAnswer2) {
    points += 25
  }
  else if (studentAnswer2 == quizAnswer2 + 1 || studentAnswer2 == quizAnswer2 - 1) {
    println("The answer ${studentAnswer2} is within 1 point of ${quizAnswer2}")
    points += 20
  }
  else {
    points += 1
  }
  if (studentAnswer3 == quizAnswer3) {
    points += 25
  }
  else if (studentAnswer3 == "equilateral") {
    points += 10
  }
  else {
    points += 1
  }
  if (studentAnswer4 == quizAnswer4) {
    points += 25
  }
  else if (studentAnswer4 > 44 && studentAnswer4 < 54) {
    points += 20
  }
  else {
    points += 1
  }




  if (points >= 0 && points <= 59) {
    println("F")
  }
  if (points >= 60 && points <= 69) {
    println("D")
  }
  if (points >= 70 && points <= 79) {
    println("C")
  }
  if (points >= 80 && points <= 89) {
    println("B")
  }
  if (points >= 90 && points <= 100) {
    println("A")
  }
  if (points >= 101 && points <= 110) {
    println("+A")
  }
}
