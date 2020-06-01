import java.util.*;
import java.lang.*;

public class Stars {
	public static void main(String[] args) {
		String option;
		Scanner scan;
		do {
			System.out.println();

			System.out.print("Enter No. of Lines: ");

			scan = new Scanner(System.in);
			int rows = scan.nextInt();

			System.out.println();

			for (int i = 0; i <= rows; ++i) {
				for (int j = 0; j < rows - i; ++j) {
					System.out.print(" ");
				}
				for (int j = 0; j <= i; ++j) {
					System.out.print("* ");
				}
				for (int j = i; j < rows; ++j) {
					System.out.print("  ");
				}
				for (int j = 0; j <= i; ++j) {
					System.out.print(" *");
				}
				System.out.println();
			}

			for (int i = 0; i <= rows; ++i) {
				for (int j = 0; j <= i * 2; ++j) {
					System.out.print(" ");
				}
				for (int j = i * 2; j <= rows * 2; ++j) {
					System.out.print("* ");
				}
				System.out.println();
			}

			do {
				System.out.println();

				System.out.print("Go Again?(Y/N): ");
				scan = new Scanner(System.in);
				option = scan.nextLine();
				
				System.out.println();
				
				if (askAgain(option) == 1) {
					System.out.println("Y/N");
				}
			
			} while (askAgain(option) == 1);
			
			System.out.println("_____________________________________________________");
		
		} while (!option.equalsIgnoreCase("n"));
		
		scan.close();
		System.out.println();
		
		System.out.println("Thank You!");
	
	}

	public static int askAgain(String option) {
		if (option.equalsIgnoreCase("n") || option.equalsIgnoreCase("y")) {
			return 0;
		}
		return 1;
	}

}