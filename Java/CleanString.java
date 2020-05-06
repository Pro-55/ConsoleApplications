import java.util.*;
import java.lang.*;

public class CleanString {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    boolean shouldRepeat = true;

    do {
      System.out.println();
      System.out.println("Enter a string:");
      String input = scan.nextLine();
      String cleanString = stringClean(input);
      System.out.println(input + " -> " + cleanString);

      System.out.println("Want to go again? (y/n)");
      String choice = scan.nextLine();
      shouldRepeat = choice.equalsIgnoreCase("y");
    } while (shouldRepeat);

    System.out.println("</---------------------------------------------------------------------->");
    scan.close();
  }

  public static String stringClean(String input) {
    String output = "";
    for (int i = 0; i < input.length(); ++i) {
      CharSequence c = String.valueOf(input.charAt(i));
      if (!output.contains(c)) {
        output += c;
      }
    }
    return output;
  }

}