package Assignment;

public class DominosPizza {
	public static void main(String[] args) {

		double discount, totalAmount, priceForEachPizza, actualPrice;

		int noOfPizza = 2;
		priceForEachPizza = 399.0f;
		discount = 20;

		System.out.println("Price for each pizza is:Rs " + priceForEachPizza);

		actualPrice = noOfPizza * priceForEachPizza;

		System.out.println("Total price for pizza before discount is:Rs " + priceForEachPizza);
		totalAmount = actualPrice - (actualPrice * discount) / 100;

		System.out.println("Total price of Pizza after " + discount + "% discount is:Rs " + totalAmount);

	}

}
