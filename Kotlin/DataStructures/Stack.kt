package ConsoleApp

import java.util.*
import java.lang.*

public class Stack(){

	private var stack = ArrayList<String>()
	private val scan = Scanner(System.`in`)
	private var head = -1

	fun initStack(){
		var option: String
		var menuOption: String
		println("\n\nWelcome To Stack: ")
		do{  
			println("***************************************************")
			println("1. Push\n2. Pop\n3. Display")
			println("***************************************************")
			println("Select an Operation: ")
			menuOption=scan.nextLine() 
			when(menuOption){
				"1"-> push()
				"2"-> pop()
				"3"-> display()
				else-> println("Invalid Choice!")
			}
			do{
				println("Continue in Stack?: Y/N")
				option=scan.nextLine()
					if(askAgain(option)==1){
						println("Please Select: Y/N")	
					}
				}while(askAgain(option)==1)
		}while(!option.equals("n", ignoreCase = true))
	}

	fun askAgain(option: String):Int{
		if(option.equals("n", ignoreCase = true)||option.equals("y", ignoreCase = true)){
			return 0
		}
		return 1
	}

	fun push(){
		head=head+1
		println("Enter an element: ")
		val element=scan.nextLine()
		stack.add(head,element)
	}

	fun pop(){
		if(head>-1){
			head=head-1
		} else {
			println("Stack underflow!")
		}
	}

	fun display(){
		println("Your Stack:")
		println("----------------------------------------------")
		if(head>-1){
			for(x in 0..head){
				print("["+stack[x]+"]")
			}
		} else {
			print("Empty Stack!")
		}
		println("")
		println("----------------------------------------------")
	}
}
