package ConsoleApp

import java.lang.*
import java.util.*

public class Queue() {

  private var queue = ArrayList<String>()
  private val scan = Scanner(System.`in`)
  private var queueType = ""
  private var element = ""
  private var tempElement = ""
  private var head = -1
  private var tail = -1

  fun initQueue() {
    var option: String
    var menuOption: String

    println("\n\nWelcome To Queue: ")
    println("***************************************************")
    println("1. Single Ended\n2. Double Ended")
    println("***************************************************")
    println("Select an Type of Queue: ")
    queueType = scan.nextLine()
    do {
      println("***************************************************")
      println("1. Enqueue\n2. Dequeue\n3. Display")
      println("***************************************************")
      println("Select an Operation: ")
      menuOption = scan.nextLine()
      when (menuOption) {
        "1" -> enqueue()
        "2" -> dequeue()
        "3" -> display()
        else -> println("Invalid Choice!")
      }
      do {
        println("Continue in Queue?: Y/N")
        option = scan.nextLine()
        if (askAgain(option) == 1) {
          println("Y/N")
        }
      } while (askAgain(option) == 1)
    } while (!option.equals("n", ignoreCase = true))
  }

  fun askAgain(option: String): Int {
    if (option.equals("n", ignoreCase = true) || option.equals("y", ignoreCase = true)) {
      return 0
    }
    return 1
  }

  fun enqueue() {
    println("Enter an element: ")
    element = scan.nextLine()
    if (queueType.equals("1")) {
      enqueueBack(element)
    } else if (queueType.equals("2")) {
      enqueueFront(element)
    }
  }

  fun dequeue() {
    if (queueType.equals("1")) {
      dequeueFront()
    } else if (queueType.equals("2")) {
      dequeueBack()
    }
  }

  fun display() {
    println("Your Queue:")
    println("----------------------------------------------")
    if (head <= tail && head> -1) {
      for (x in head..tail) {
        print("[" + queue[x] + "]")
      }
    } else {
      print("Empty Queue!")
    }
    println("")
    println("----------------------------------------------")
  }

  fun enqueueBack(element: String) {
    println(head)
    println(tail)
    if (head == tail && head == -1) {
      head = head + 1
    }
    tail = tail + 1
    queue.add(tail, element)
    println(head)
    println(tail)
  }

  fun dequeueFront() {
    if (head != tail) {
      head = head + 1
    } else {
      println("Queue is Already Empty!")
    }
  }

  fun enqueueFront(element: String) {
    println("enqueueFront: " + element)
  }

  fun dequeueBack() {
    println("dequeueBack")
  }
}
