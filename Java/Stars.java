import java.util.*;
import java.lang.*;

public class Stars {
	public static void main(String[] args) {
		int i, j, k, n;
		String option;
		Scanner input;
		do {
			input = new Scanner(System.in);
			System.out.println("Enter the No. of Rows: ");
			n = input.nextInt();
			for (i = 0; i < n; i++) {
				for (j = 0; j <= i; j++) {
					System.out.print("  ");
				}

				for (k = n; k > 0 + i; k--) {
					System.out.print("*  ");
				}
				System.out.println();
			}
			input = new Scanner(System.in);
			System.out.println("Continu? Y/N");
			option = input.nextLine();
			do {
				if (!option.equalsIgnoreCase("y") || !option.equalsIgnoreCase("y")) {
					input = new Scanner(System.in);
					System.out.println("Continu? Y/N");
					option = input.nextLine();
				}
			} while (!option.equalsIgnoreCase("y") || !option.equalsIgnoreCase("n"));
		} while (!option.equalsIgnoreCase("n"));
	}
}