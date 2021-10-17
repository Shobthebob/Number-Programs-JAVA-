/*A number whose square divided into two parts (none of the parts have only 0) and the sum of the 
 * parts is equal to the original number then it is called Capricon number. [Examples - 9, 55, 99]
 */

import java.util.*; // For the scanner class

public class Kaprekar_number {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in); // Creating an object with the name "scan"
		
		System.out.println("Enter a number"); // Telling the user to input a number
		int num = scan.nextInt( ); // Input function
		int square = num*num; // Square of the entered number
		
		String sq = String.valueOf(square); // Converting the square into a String type
		int len = sq.length( ); // Length of the square 
		int sum = 0; // Declaring and initializing... this will store the sum of the two parts 
		
		if(len%2==0) { // Goes inside if the square can be equally split into two parts
			int d = len/2; // Mid value of the length
			
			// Using the mid value to split the square into two values sq1 and sq2
			String sq1 = sq.substring(0,d); 
			String sq2 = sq.substring(d);	
			
			sum = (Integer.parseInt(sq1)) + (Integer.parseInt(sq2)); // Adding the two parts
			if(sum == num) {
				System.out.println(num + " is a Kaprekar number"); // If the sum of the two parts and num is equal
			}
			else {
				System.out.println(num + " is not a Kaprekar number"); // If the sum of the two parts and num is not equal
			}
		}
		else { // If the square cannot be split into two parts
			System.out.println("The square of the number entered does not have equal parts"); 
		}		
        scan.close( ); // closing the scanner class since we have no further use of it
	}

}
