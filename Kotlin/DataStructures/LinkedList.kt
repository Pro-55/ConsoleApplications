package ConsoleApp

import java.util.*
import java.lang.*

private val scan = Scanner(System.`in`)

fun main(args: Array<String>) {
	var option:String
	var menuOption:String
	println("\n\n\nWelcome To LinkedList: ")
	do{	
		println("************************************************************")
		println("1. Insert\n2. Insert At N\n3. Remove\n4. Remove At N\n5. Display")
		println("************************************************************")
		println("Enter Your Choice: ")
		var scan = Scanner(System.`in`)
		menuOption=scan.nextLine() 
		when(menuOption){
			"1"-> Insert()
			"2"-> InsertAt()
			"3"-> Remove()
			"4"-> RemoveAt()
			"5"-> Display()
			else-> println("Invalid Choice!")
		}
		do{
			println("\nContinue in Stack?: Y/N")
			option=scan.nextLine()
			if(askAgain(option)==1){
				println("\nPlease Select: Y/N")	
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

fun Insert(){
	println("\nEnter An Elemnet: ")
	val node=Node(scan.nextLine(),null)
	println("Node.data= "+ node.getData()+"\n Node.nextNode= "+node.getNextNode())
}

fun InsertAt(){
	println("You Selected: 2")
}

fun Remove(){
	println("You Selected: 3")
}

fun RemoveAt(){
	println("You Selected: 4")
}

fun Display(){
	println("You Selected: 5")
}

public class Node{
	var nData:String=""
	var nNextNode:Node?=null
	constructor (){

	}

	constructor(data:String,nextNode:Node?){
		nData=data
		nNextNode=nextNode
	}

	fun getData():String{
		return nData
	}

	fun getNextNode():Node?{
		return nNextNode
	}
}