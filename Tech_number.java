/*A number which has an even number of digits, and when the number of digits split into two halves
 * then the square of the sum of those halves is equal to the same number, is called Tech number.
 * [Examples - 10, 2025, 3025
 */

import java.util.*; // For the scanner class 

public class Tech_number {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in); // Creating an object with the name "scan"
		
		System.out.println("Enter a number"); // Telling the user to input a number
		int num = scan.nextInt( ); // Input function
		String n = String.valueOf(num); // String.valueOf( ) is used to convert any other datatype to a string
		int len = n.length( ); // len will store the length of the number
		
		if(len%2==0) { // goes in if the number 
			
			int d = len/2; // finding out the mid value to seperate the number from
			// seperating the number into two halves
			String n1 = n.substring(0,d); 
			String n2 = n.substring(d);
			
			int sum_of_n = (Integer.parseInt(n1)) + (Integer.parseInt(n2)); // sum of the two halves 
			int square = sum_of_n * sum_of_n; // square of the sum of the two halves
			
			if(square == num) {
				System.out.println(num + " is a tech number"); // if the square is equal to the number itself
			}
			else {
				System.out.println(num + " is not a tech number"); // if the square is not equal to the number
			}
		}
		else { 
			System.out.println("Sorry " + num + " does not have even amount of numbers"); // if the number has an odd number of digits
		}
		
		scan.close( ); // closing the scanner class since we have no further use of it
	}
}
