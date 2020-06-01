import java.util.*

fun main(args: Array<String>) {
   val list = ArrayList<Int>()
   for (i in 100..9999) {
       if (isThis(i)) {
           if (isThisIt(i)) {
               println(i)
               list.add(i)
           }
       }
   }
    val x = list.size
    println("\n\n list.size: $x")
}

fun isThis(n: Int): Boolean {
   var x = n
   var sum = 0
   while (x > 0) {
       sum += x % 10
       x /= 10
   }
    val a = sum == 6
    val b = sum == 9
    val c = sum == 15 || sum == 24 || sum == 33 || sum == 42 || sum == 51 || sum == 60
    val d = sum == 18 || sum == 27 || sum == 36 || sum == 45 || sum == 54 || sum == 63 || sum == 72 || sum == 90
   return a || b || c || d
}

fun isThisIt(x: Int): Boolean {
   val a = x % 10
   val b = x / 10 % 10
   val c = x / 100 % 10
   val d = x / 1000 % 10
   return a > b && b > c && c > d
}
