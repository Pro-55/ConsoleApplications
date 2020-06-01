package CatDog

import java.lang.*
import java.util.*

fun main(args: Array<String>) {
  val scan = Scanner(System.`in`)
  var shouldRepeat: Boolean
  do {
    println()
    println("Enter a string:")
    var input = scan.nextLine()
    val isValid = cat_dog(input)
    println("$input -> $isValid")

    println("Want to go again? (y/n)")
    var choice = scan.nextLine()
    shouldRepeat = choice.equals("y", true)
  } while (shouldRepeat)
  println("</---------------------------------------------------------------------->")
}

fun cat_dog(input: String): Boolean {
  val catCount = countSubstring(input, "cat")
  val dogCount = countSubstring(input, "dog")
  return catCount == dogCount
}

fun countSubstring(input: String, sub: String): Int = input.split(sub).size - 1
