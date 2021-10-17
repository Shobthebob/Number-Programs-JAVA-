/* If the sum of the cube of the digits of a number is equal to the number itself, the number is
 * said to a an Armstrong number. [Examples - 1, 153, 371] 
 */

import java.util.*; // For the scanner class 

public class Armstrong_number {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in); // Creating an object with the name "scan"
		
		System.out.println("Enter a number"); // Telling the user to input a number
		int num = scan.nextInt( ); // Input function
		int n = num; // By storing the value of num in n, we'll be abe to use num later without altering its value
		int rem=0,sum=0,prod=1; 
		
		while(n!=0) { // Running a while loop until n comes down to 0
			rem = n%10; // rem will store the last value of the number
			prod = rem*rem*rem; // prod will store the cube of the last number
			sum+=prod; // sum will hold the sum of the cubes 
			n = n/10; // diving n by 10 to remove the last digit and avoid performing any further actions on it		
		}
		
		if(sum==num) {
			System.out.println(num + " is an armstrong number"); // If number and the sum of the cubes of the digits of the number are equal		
		}
		else {
			System.out.println(num + " is not an armstrong number"); // // If number and the sum of the cubes of the digits of the number aren't equal
		}
		
		scan.close( ); // closing the scanner class since we have no further use of it
	}

}
