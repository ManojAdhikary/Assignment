package flowControlAssignment;

import java.util.Scanner;

public class PatternAssignment9 {
	private static Scanner sc;
	public static void main(String[] args) {
		int rows, i, j,k=1;

	    sc = new Scanner(System.in);

		System.out.println("How many rows you want in this pattern?  ");
		rows = sc.nextInt();
		 System.out.println("Here is a pattern");

	        for ( i = 1; i <= rows; i++) 
	        {
	            for ( j = 1; j <= i; j++) 
	            {
	                System.out.print(k+"\t");
	                 
	                k++;
	            }
	             
	            System.out.println();
	        }
		sc.close();
		
	}
}
