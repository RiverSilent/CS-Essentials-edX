package summation;

public class SumOfNumbers {

	public static void main(String[] args) {
		
		// Sum up the numbers from 1 to 900 using a while loop
		
		int sum = 0;
		int number = 1;
		
		while (number <= 900) {
			sum += number;
			number += 1;
		}
		
		System.out.println("Sum is " + sum);

	}

}
