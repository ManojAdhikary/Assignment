package arrayAssignment;

import java.util.Scanner;

public class CheckIntValueContain {
	
	 public static void main(String[] args) {

		    int[] num = {1, 2, 3, 4, 7, 9, 5};
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter a lucky number: ");
		    int toFind = sc.nextInt();
		    boolean found = false;
		    
		    for(int n : num) {
		    	if(n==toFind) {
		    		found=true;
		    		break;
		    	}
		    	
		    	
		    }
		    if(found) {
	    		System.out.println(toFind+ " is Found");
	    	}else
	    	{
	    		System.out.println(toFind+ " is not found");
	    	}
		    
	 }
}
