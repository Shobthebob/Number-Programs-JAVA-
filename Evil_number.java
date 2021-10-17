/*An evil number is a positive whole number that has an even number of 1’s in its binary 
 * equivalent. [Examples - 3, 12, 20]
 */

import java.util.*; // For the scanner class 

public class Evil_number {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in); // Creating an object with the name "scan"
		
		System.out.println("Enter a number"); // Telling the user to input a number
		int n = scan.nextInt( ); // Input function
		String num = Long.toBinaryString(n); // To convert the entered number to binary 
		int count = 0; // It'll store the number of 1s in the binary number
		int len = num.length( ); // Length of the number
		
		for(int i=0; i<len; i++) {
			char ch = num.charAt(i); // To iterate through every digit in the number
			if(ch == '1') {
				count ++; // Counts the number of 1s found
			}
		}
		System.out.println(""); // To make the output neater
		
		if(count%2==0) {
			System.out.println(n + " is an evil number"); // If even number of 1s are present 
		}
		else {
			System.out.println(n + " is not a evil number"); // If even number of 1s are not present 
		}
		
		scan.close( ); // closing the scanner class since we have no further use of it
	}
}
