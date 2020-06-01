package CleanString

import java.lang.*
import java.util.*

fun main(args: Array<String>) {
  val scan = Scanner(System.`in`)
  var shouldRepeat: Boolean
  do {
    println()
    println("Enter a string:")
    var input = scan.nextLine()
    val cleanString = stringClean(input)
    println("$input -> $cleanString")

    println("Want to go again? (y/n)")
    var choice = scan.nextLine()
    shouldRepeat = choice.equals("y", true)
  } while (shouldRepeat)
  println("</---------------------------------------------------------------------->")
}

fun stringClean(input: String): String {
  var output = ""
  input.forEach { if (!output.contains(it)) output += it }
  return output
}
