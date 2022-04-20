package FlowControlAssignment;

import java.util.Scanner;

public class PatternAssignment3 {
	private static Scanner sc;
	public static void main(String[] args) {
		int rows, columns, i, j,k=1;

	    sc = new Scanner(System.in);

		System.out.println("Enter a number of rows: ");
		rows = sc.nextInt();

		System.out.println("Enter a number of columns: ");
		columns = sc.nextInt();

		for (i = 0; i < rows; i++) {
			for (j = 0; j < columns; j++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}

}
