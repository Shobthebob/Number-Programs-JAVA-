/* If the sum of the digits of the square of a number is equal to the number itself the number is 
 * said to be a Neon number. [Examples - 0, 1, 9]
 */

import java.util.*; // For the scanner class

public class Neon_number {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in); // Creating an object with the name "scan"
		
		System.out.println("Enter a number"); // Telling the user to input a number
		int num = scan.nextInt( ); // Input function
		int sq = num*num; // holds the square of the number entered 		
		int rem=0,sum=0;
		
		while(sq!=0) {
			rem = sq%10; // will store the last digit of the square of the number 
			sum+=rem; // will store the sum of the digits of the square 
			sq = sq/10; // diving sq by 10 to remove the last digit and avoid performing any further actions on it
		}
		
		if(sum==num) {
			System.out.println(num + " is a neon number"); // if the sum of the square of the digits is equal to the number
		}
		else {
			System.out.println(num + " is not a neon number"); // if the sum of the square of the digits is not equal to the number
		}
		
		scan.close( ); // closing the scanner class since we have no further use of it

	}

}
