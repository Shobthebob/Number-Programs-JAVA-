/* A number is said to be a magic number if the sum of its digits is calculated till a single 
 * digit recursively by adding the sum of the digits after every addition.
 * If the single-digit comes out to be 1, then the number is a magic number.
 * OR IN SIMPLE FUCKING WORDS
 * If the number, when divided by 9, leave a remainder of 1, the number is a magic number.
 * [Examples - 46, 226, 1234]
 */

import java.util.*; // For the scanner class

public class Magic_number {
	
	public static int Magic(int n) { // Ths function is gonna recursively add the sum of digits of the number until it's a single digit
		int rem=0, sum=0; 
		while(n!=0) { // loop to store the value of the sum of the digits of the number passed through arguments
			rem = n%10; // rem will store the last value of the number 
			sum+=rem; // sum will store the sum of the digits of the number passed through arguments
			n = n/10; // diving n by 10 to remove the last digit and avoid performing any further actions on it
		}
		if(String.valueOf(sum).length( )==1) {
			return sum; // returns the sum only if a single digit remains
		}
		else {
			return Magic(sum); // fucntion calls itself if the sum isnt single digit
		}
	}
		
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in); // Creating an object with the name "scan"
		
		System.out.println("Enter a number"); // Telling the user to input a number
		int num = scan.nextInt( ); // Input function
		
		if(Magic(num)==1) {
			System.out.println(num + " is a Magic number"); // if the sum recursively ended up being 1
		}
		else {
			System.out.println(num + " is not a Magic number"); // if the sum recursively didn't end up being 1
		}
		
		scan.close( ); // closing the scanner class since we have no further use of it
	}
	
}
