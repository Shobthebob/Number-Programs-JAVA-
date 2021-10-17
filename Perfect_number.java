/* If the sum of the factors of the number is equal to the number itself then the number is said
 * to be a Perfect number. [Examples - 6, 28, 496]
 */

import java.util.*; // For the scanner class 

public class Perfect_number {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in); // Creating an object with the name "scan"
		
		System.out.println("Enter a number"); // Telling the user to input a number
		int num = scan.nextInt( ); // Input function
		int e = 0; // Initializing and Declaring e with integer value 0
		for(int i = 1; i<=num; i++) { // running a for loop till num
			if(num%i==0) {
				i+=i; // going to hold the sum of the factors			
			}
			e = i; // e stores the sum of the factors
		}
		if(num == e) {
			System.out.println(num + " is a perfect number"); // if the sum of the factors is equal to the number
		}
		else {
			System.out.println(num + " is not a perfect number"); // if the sum of the factors is not equal to the number
		}
		
		scan.close( ); // closing the scanner class since we have no further use of it
	}
}
