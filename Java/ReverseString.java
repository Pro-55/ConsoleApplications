import java.util.*;
 
public class ReverseString
{
    public static void main(String[] args)
    {
        System.out.println("Enter a string:");
        
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        
        StringBuilder sb = new StringBuilder(str);
        
	String rts =sb.reverse().toString();
	if(str.equalsIgnoreCase(rts)){
        	System.out.println("True");
	} else {
        	System.out.println("False");
	}	
    }
}