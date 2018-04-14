package summation;

public class SumOfNumbers {

	public static void main(String[] args) {
		
		// Sum up the numbers from 1 to 900 using a for loop
		int sum = 0;
		for (int i=1; i<=900; i++) {

			sum += i;
		}
		
		System.out.println("Sum is " + sum);

	}

}
