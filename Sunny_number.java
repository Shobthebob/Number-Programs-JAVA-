/* If the square root of the (number+1) is a whole number then the number is said to be a sunny number
 * [Examples - 3, 24, 80]
 */

import java.util.*; // For the scanner class

public class Sunny_number {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in); // Creating an object with the name "scan"
		
		System.out.println("Enter a number"); // Telling the user to input a number
		int num = scan.nextInt( ); // Input function
		int sq = num+1; // sq stores the number adjacent to the number entered 
		
		if(Math.sqrt(sq)%1 == 0) { // Math.sqrt( ) returns the square root of the number 
			System.out.println(num + " is a sunny number"); // if the sq.rt of num+1 is a whole number
		}
		else {
			System.out.println(num + " is not a sunny number"); // if the sq.rt of num+1 is not a whole number
		}
		
		scan.close( ); // closing the scanner class since we have no further use of it
	}
}
