package FlowControlAssignment;

import java.util.Scanner;

public class FibonacciSeries1_101 {
	private static Scanner sc;
	public static void main(String[] args) {
	    sc = new Scanner(System.in);

		System.out.println("Enter a numbers: ");
		int num = sc.nextInt();
	for (int i=1;i<=num;i++) {
		if(i%2==0) {
			System.out.println(i+" ");
		}
	}

	
	}

}
