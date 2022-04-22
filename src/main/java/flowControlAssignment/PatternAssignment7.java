package flowControlAssignment;

import java.util.Scanner;

public class PatternAssignment7 {
	private static Scanner sc;
	public static void main(String[] args) {
		int rows, columns, i, j;

	    sc = new Scanner(System.in);

		System.out.println("How many rows you want in this pattern?  ");
		rows = sc.nextInt();
		 System.out.println("Here is a pattern");

		 for ( i = 1; i <= rows; i++) 
	        {
	            for ( j = rows; j >= i; j--)
	            {
	                System.out.print(j+" ");
	            }
	             
	            System.out.println();
	        }
		sc.close();
		
	}
}
