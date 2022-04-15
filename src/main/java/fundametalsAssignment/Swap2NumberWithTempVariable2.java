package fundametalsAssignment;

public class Swap2NumberWithTempVariable2 {
	public static void main(String[] args) {
		int fno = 100;
		int sno = 200;
	

		System.out.println("Before Swapping 2 numbers: ");
		System.out.println("Fno : " + fno + " Sno : " + sno );

		// Swapping
		fno = fno+sno;//100+200=300
		sno = fno-sno;//300-100=200
		fno = fno-sno;//300-200=100
	

		System.out.println("After Swapping 2 numbers: ");
		System.out.println("Fno : " + fno + " Sno : " + sno );

	}

}
