import java.util.*;
import java.lang.*;

public class CatDog {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    boolean shouldRepeat = true;

    do {
      System.out.println();
      System.out.println("Enter a string:");
      String input = scan.nextLine();
      boolean isValid = cat_dog(input);
      System.out.println(input + " -> " + isValid);

      System.out.println("Want to go again? (y/n)");
      String choice = scan.nextLine();
      shouldRepeat = choice.equalsIgnoreCase("y");
    } while (shouldRepeat);

    System.out.println("</---------------------------------------------------------------------->");
    scan.close();
  }

  public static boolean cat_dog(String input) {
    int catCount = countSubstring(input, "cat");
    int dogCount = countSubstring(input, "dog");
    return catCount == dogCount;
  }

  public static int countSubstring(String input, String sub) {
    return input.split(sub, -1).length - 1;
  }

}