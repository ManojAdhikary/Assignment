package fundamnetalPractice;

public class Swap3NumberWithTempVariable {
	public static void main(String[] args) {
		int fno = 100;
		int sno = 200;
		int tno = 300;

		System.out.println("Before Swapping 3 numbers: ");
		System.out.println("Fno : " + fno + " Sno : " + sno + " Tno :" + tno);

		// Swapping
		fno = fno+sno+tno;//100+200+300=600
		sno = fno-sno-tno;//600-200-300=100
		tno = fno-sno-tno;//600-100-300=200
		fno = fno-sno-tno;//600-100-200=300

		System.out.println("After Swapping 3 numbers: ");
		System.out.println("Fno : " + fno + " Sno : " + sno + " Tno :" + tno);

	}

}
