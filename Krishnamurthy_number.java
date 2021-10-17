/* If the sum of the factorial of the digits of a number is equal to the number itself the number
 * is said to be a Krishnamurthy number. [Examples - 1, 2, 145]
 */

import java.util.*; // For the scanner class

public class Krishnamurthy_number {
	
	public static int factorial(int n) { // A factorial function that'll return the factorial of each digit of the number 
		int fact = 1; 
		for(int i = 1; i<=n; i++) { // running a for loop till n 
			fact*=i; // fact stores the facotrial of the number passed through the parameter
		}
		return fact; // returning the factorial 
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in); // Creating an object with the name "scan"
		
		System.out.println("Enter a number"); // Telling the user to input a number
		int num = scan.nextInt( ); // Input function
		int e = num; // By storing the value of num in e, we'll be abe to use num later without altering its value
		int rem=0, sum=0;
		
		while(e!=0) { // Running a while loop until e comes down to 0
			rem = e%10; // rem will store the last value of the number
			sum+=factorial(rem); // sum will store the sum of the factorial of each digit of the number
			e=e/10; // diving e by 10 to remove the last digit and avoid performing any further actions on it
		}
		
		if(sum==num) {
			System.out.println(num + " is a krishnamurthy number"); // If the sum of factorial of each digit it equal to the number entered 
		}
		else {
			System.out.println(num + " is not a krishnamurthy number"); // If the sum of factorial of each digit it equal to the number entered
		}
		
		scan.close( ); // closing the scanner class since we have no further use of it
	}

}
