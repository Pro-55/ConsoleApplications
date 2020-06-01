package Stars

import java.lang.*
import java.util.*

fun main(args: Array<String>) {
  var option: String
  do {
    println()

    print("Enter No. of Lines: ")

    var scan = Scanner(System.`in`)
    val rows = scan.nextInt()

    println()

    for (i in 0..rows) {
      for (j in 0 until rows - i) print(" ")

      for (j in 0..i) print("* ")

      for (j in i until rows) print("  ")

      for (j in 0..i) print(" *")

      println()
    }

    for (i in 0..rows) {
      for (j in 0..i * 2) print(" ")

      for (j in i * 2..rows * 2) print("* ")

      println()
    }

    do {
      println()

      print("Go Again?(Y/N): ")
      scan = Scanner(System.`in`)
      option = scan.nextLine()

      println()

      if (askAgain(option) == 1) println("Y/N")
    
    } while (askAgain(option) == 1)

    println("_____________________________________________________")

  } while (!option.equals("n", ignoreCase = true))

  println()

  println("Thank You!")

}

fun askAgain(option: String): Int {
  if (option.equals("n", ignoreCase = true) || option.equals("y", ignoreCase = true)) return 0
  return 1
}
