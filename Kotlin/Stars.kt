package Stars

import java.util.*
import java.lang.*

fun main(args: Array<String>) {
	var option:String
	do{
		println("Enter No. of Lines: ")
  
		var scan = Scanner(System.`in`)
		var lines = scan.nextInt()
		for(x in 0..lines-1){
			for(y in lines-2 downTo x){
				print(" ")
			}
			for(z in x downTo 0){
				print("* ")
			}
			for(y in lines-2 downTo x){
				print("  ")
			}
			for(z in x downTo 0){
				print("* ")
			}
			println("")
		}

		for(x in 0..lines-1){
			for(y in 0..x){
				print(" ")
			}
			for(z in x*2 downTo 0){
				print("* ")
			}
			println("")
		}

		do{
			println("Go Again?: Y/N")
			scan = Scanner(System.`in`)	
			option=scan.nextLine()
			if(askAgain(option)==1){
				println("Y/N")	
			}
		}while(askAgain(option)==1)
		println("_____________________________________________________")	
	}while(!option.equals("n", ignoreCase = true))
	println("Thank You!")	
}

fun askAgain(option: String):Int{
	if(option.equals("n", ignoreCase = true)||option.equals("y", ignoreCase = true)){
		return 0
	}
	return 1
}
