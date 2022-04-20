package FlowControlAssignment;

import java.util.Scanner;

public class PatternAssignment6 {
	private static Scanner sc;
	public static void main(String[] args) {
		int rows, i, j,k;

	    sc = new Scanner(System.in);

		System.out.println("How many rows you want in this pattern?  ");
		rows = sc.nextInt();
		 System.out.println("Here is a pattern");

		   for( i=1;i< rows+1 ;i++)
	        {
	            for( j=i; j < rows+1 ;j++)
	            {
	                System.out.print(j + " ");
	            }
	            for( k=1; k < i ;k++)
	            {
	                System.out.print(k + " ");
	            }
	            System.out.println();
	        }
		sc.close();
		
	}
}
