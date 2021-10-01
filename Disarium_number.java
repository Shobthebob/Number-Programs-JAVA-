/* If the sum of the digit of a number raised to the power of its position is equal to the number
 * itself the number is said to Disarium number. [Examples - 89, 135, 518]
 */

import java.util.*; // For the scanner class 

public class Disarium_number {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner (System.in); // Creating an object with the name "scan"
		
		System.out.println("Enter a number"); // Telling the user to input a number
		String num = scan.next( ); // Input function
		int sum=0 ,p=0; // Initializing and Declaring 
		int len = num.length( ); // Length of the number entered 
		
		for(int i = 0; i<len; i++) { // Running a for loop till the length of num
			p = i+1; // Value of the power 
			sum+=Math.pow(Integer.parseInt(String.valueOf(num.charAt(i))),p); // Adding each digit with the power of its position
		}
		
		if(sum==Integer.parseInt(num)) {
			System.out.println(num + " is a disarium number"); // If the sum is equal to the number
		}
		else {
			System.out.println(num + " is not a disarium number"); // If the sum is not equal to the number 
		}
		
		scan.close( ); // closing the scanner class since we have no further use of it
	}
}
