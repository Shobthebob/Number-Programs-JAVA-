/* If the sum of the digits of a number is divisible by the number itself the number is said to be 
 * a Niven number. [Examples - 18, 21, 111]
 */

import java.util.*; // For the scanner class 

public class Niven_number {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner (System.in); // Creating an object with the name "scan"
		
		System.out.println("Enter a number"); // Telling the user to input a number
		int num = scan.nextInt( ); // Input function
		int n = num; // By storing the value of num in n, we'll be abe to use num later without altering its value
		int rem=0, sum=0;
		
		while (n>0) { // Running a while loop until n is greater than 0
			rem = n%10; // rem will store the last value of the number
			sum = sum+rem; // sum holds the sum of all the digits of the number
			n = n/10; // diving n by 10 to remove the last digit and avoid performing any further actions on it
		}
		
		if(num%s==0) {
			System.out.println(num + " is a niven number"); // if the sum of the digits of the number is divisible by the number
		}
		else {
			System.out.println(num + " is not a niven number"); // if the sum of the digits of the number is not divisible by the number
		}
		
		scan.close( ); // closing the scanner class since we have no further use of it
	}
}
