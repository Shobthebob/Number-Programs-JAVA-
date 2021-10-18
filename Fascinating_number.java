/* When the product of the numbers with 2 and 3 separately are concatenated together
 * (with the number itself being included) and that number doesnt contain any repeating
 *  digits, then its called a Fascinating number. [Examples - 192, 327, 2019]
 */

import java.util.*; // For the scanner class

public class Fascinating_number {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in); // Creating an object with the name "scan"
		
		System.out.println("Enter a number"); // Telling the user to input a number
		int num = scan.nextInt( ); // Input function
		int num2 = num*2; // multiplying the entered number with 2
		int num3 = num*3; // multiplying the entered number with 3 
		String nums = String.valueOf(num) + String.valueOf(num2) + String.valueOf(num3); // Concatinating the products of the number with 2 & 3
		int a=0, count=0; //Initializing and Declaring a and count with integer value 0
		
		for(int i=0; i<nums.length( ); i++) { // running a loop till 1 value less than the length of nums
			for(int j=0; j<nums.length( ); j++) { // running a loop till 1 value less than the length of nums
				char ch = nums.charAt(i); // charAt(x) returns the character at position x
				if(nums.charAt(j)==ch) {
					a++; // Increments if a digit is repeating 
				}				
			}
			if(a>1) {
				count++; // Increments if a digit is found repeating 
			}
			a = 0; // giving a an integer value 0 so that it refreshes its value after every iteration
		}
		
		if(count==0) {
			System.out.println(num + " is a Fascinating number"); // If no repeating numbers are found 
		}
		else {
			System.out.println(num + " is not a Fascinating number"); // If repeating numbers are found 
		}
		
		scan.close( ); // closing the scanner class since we have no further use of it

	}
}
