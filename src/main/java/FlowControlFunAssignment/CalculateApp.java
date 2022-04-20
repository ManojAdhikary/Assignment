package FlowControlFunAssignment;

import java.util.Scanner;

public class CalculateApp {
	int fno;
	int sno;
	Scanner sc = new Scanner(System.in);

	void add() {
		System.out.println("enter the first number");
		fno=sc.nextInt();
		System.out.println("enter the second number");
		sno=sc.nextInt();
		int result=fno+sno;
    	System.out.println("Adding two number: "+ result);	
	}
	void sub() {
		System.out.println("enter the first number");
		fno=sc.nextInt();
		System.out.println("enter the second number");
		sno=sc.nextInt();
		int result=fno-sno;
    	System.out.println("Sub two number: "+ result);	
	}
	void mul() {
		System.out.println("enter the first number");
		fno=sc.nextInt();
		System.out.println("enter the second number");
		sno=sc.nextInt();
		int result=fno*sno;
    	System.out.println("mul two number: "+ result);	
	}
	public static void main(String[] args) {
		
		CalculateApp ca = new CalculateApp();
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			System.out.println("********************");
			
			System.out.println("             1. Add          ");
			System.out.println("             1. Sub          ");
			System.out.println("             1. Mul          ");
			System.out.println("             1. Exit         ");
			System.out.println("********************");
			
			System.out.println(" Enter the choice");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				ca.add();
				break;
			case 2:
				ca.sub();
			}
		}
	}

}
