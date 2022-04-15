package fundamnetalPractice;

public class Swap2NumberWithOutTempVariable3 {
	public static void main(String[] args) {
		int fno = 100;
		int sno = 200;
		

		System.out.println("Before Swapping 2 numbers: ");
		System.out.println("Fno : " + fno + " Sno : " + sno );

		// Swapping
		int temp = 0;
		temp = fno;
		fno = sno;
		sno = fno;
		fno = temp;

		System.out.println("After Swapping 2 numbers: ");
		System.out.println("Fno : " + fno + " Sno : " + sno );

	}

}
