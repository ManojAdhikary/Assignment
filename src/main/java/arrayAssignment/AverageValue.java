package arrayAssignment;

public class AverageValue {
	public static void main(String[] args) {
		int value[]= {23,45,69,90};
		int sum=0;
		Double average;
		
		//Sum of Number
		for(int num: value) {
			sum+=num;
		}
		
		//Counting lenght of array
		int arrayLength = value.length;
		
		//Calculate average
		average = ((double)sum/(double)arrayLength);
		
		System.out.println("Average: "+ average);
		
		
	}

}
