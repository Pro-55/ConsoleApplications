import java.util.*;
import java.lang.*;

public class Reversify
{
    public static void main(String[] args)
    {
    	String option="";
    	do{
	        System.out.println("Enter a string:");
	        
	        Scanner read = new Scanner(System.in);
	        String str = read.nextLine();
	        
	        String rts=reverse(str);
	       	System.out.println("You Entered: "+str);
	       	System.out.println("Reverse: "+rts);

	        if(str.equalsIgnoreCase(rts)){
		       	System.out.println("Its a Palindrome!");
			} else {
		       	System.out.println("Its not a Palindrome!");
			}	

		System.out.println("Go Again?: Y/N");
	   	Scanner in = new Scanner(System.in);
	    option = in.nextLine();
	    }while(!option.equalsIgnoreCase("n"));
    }

    private static String reverse(String inputString){
    	String outputString="";
    	for(int index=inputString.length()-1; index>=0; index--){
    		outputString=outputString+inputString.charAt(index);
    	}
    	return outputString;
    }
}