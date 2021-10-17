// Prime numbers are those numbers that are divisible by 1 and itself only.
// [Examples - 2, 37, 103]

import java.util.*; // For the scanner class 

public class Prime_number {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in); // Creating an object with the name "scan"
		
		System.out.println("Enter a number"); // Telling the user to input a number
		int n = scan.nextInt( ); // Input function
		int count = 0; // Initializing and Declaring count with integer value 0
		
		for(int i=2; i<n; i++) { // running a for loop starting from 2 till 1 value less than n
			if(n%i==0) {
				count++; // counts the number of numbers that are divisible by the number enteres
			}
		}
		if(count==0) {
			System.out.println(n + " is a prime number"); // if there are no divisible numbers
		}
		else {
			System.out.println(n + " is not a prime number"); // if there is/are divisible number(s)
		}
		
		scan.close( ); // closing the scanner class since we have no further use of it
	}
}
