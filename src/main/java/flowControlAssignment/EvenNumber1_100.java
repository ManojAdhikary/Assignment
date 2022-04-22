package flowControlAssignment;

import java.util.Scanner;

public class EvenNumber1_100 {
	private static Scanner sc;
	public static void main(String[] args) {
	    sc = new Scanner(System.in);

		System.out.println("Enter a numbers: ");
		int number = sc.nextInt();
		int n1=0, n2=1,num;
	for (int i=1;i<=number;i++) {
		num = n1+n2;
		System.out.println(num+" ");
		n1=n2;
		n2=num;
		
	
	}

	
	}

}
