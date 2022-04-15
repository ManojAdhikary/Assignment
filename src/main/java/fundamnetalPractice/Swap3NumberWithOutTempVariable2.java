package fundamnetalPractice;

public class Swap3NumberWithOutTempVariable2 {
	public static void main(String[] args) {
		int fno = 100;
		int sno = 200;
		int tno = 300;

		System.out.println("Before Swapping 3 numbers: ");
		System.out.println("Fno : " + fno + " Sno : " + sno + "Tno :" + tno);

		// Swapping
		int temp = 0;
		temp = fno;
		fno = sno;
		sno = tno;
		tno = temp;

		System.out.println("After Swapping 3 numbers: ");
		System.out.println("Fno : " + fno + " Sno : " + sno + "Tno :" + tno);

	}

}
