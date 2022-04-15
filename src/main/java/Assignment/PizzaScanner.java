package assignment;

import java.util.Scanner;

public class PizzaScanner {
	static int price;
	static int quantity;
	static int discount;
	static int finalPrice;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the price of each PIZZA : ");
		price = sc.nextInt();

		System.out.println("Enter the quanity of PIZZA : ");
		quantity = sc.nextInt();

		System.out.println("Enter the discount of pizza : ");
		discount = sc.nextInt();

		finalPrice = (price * quantity - (price * quantity * discount / 100));
		System.out.println("The final price of pizza after discount is : " + finalPrice);

	}

}
