package FlowControlAssignment;

import java.util.Scanner;

public class PatternAssignment {
	private static Scanner sc;
	public static void main(String[] args) {
		int rows, columns, i, j;

	    sc = new Scanner(System.in);

		System.out.println("Enter a number of rows: ");
		rows = sc.nextInt();

		System.out.println("Enter a number of columns: ");
		columns = sc.nextInt();

		for (i = 1; i <= rows; i++) {
			for (j = 1; j <= columns; j++) {
				System.out.print("* ");
			}
			System.out.println("\n");
		}
	}

}
