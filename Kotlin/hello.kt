package hello 

import java.util.*
import java.lang.*

fun main(args: Array<String>) { 
	var option:String
	do{
		println("Enter a string:")
  
		val scan = Scanner(System.`in`)
		var str = scan.nextLine()
		var rts=reverce(str)

		println("You Entered: "+str)
		println("Rsult: "+rts)

		do{
			println("Go Again?: Y/N")	
			option=scan.nextLine()
			if(askAgain(option)==1){
				println("Y/N")	
			}
		}while(askAgain(option)==1)
		println("_____________________________________________________")	
	}while(!option.equals("n", ignoreCase = true))
}

fun reverce(inputString:String):String{
	var outputSting=""
	for (c in inputString){
		outputSting=c+outputSting;
	}
	return outputSting
}

fun askAgain(option: String):Int{
	if(option.equals("n", ignoreCase = true)||option.equals("y", ignoreCase = true)){
		return 0
	}
	return 1
}