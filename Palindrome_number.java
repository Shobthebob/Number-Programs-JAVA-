/* If the reverse of the number is equal to the number itself then the number is said to be a 
 *  Palindrome number. [Examples - 101, 23432, 32409832423890423]
 */

import java.util.*; // For the scanner class 

public class Palindrome_number {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in); // Creating an object with the name "scan"
		
		System.out.println("Enter a number"); // Telling the user to input a number
		int num = scan.nextInt( ); // Input function
		String rev = "";
		int rem = 0;
        	int e = num; // By storing the value of num in e, we'll be abe to use num later without altering its value
		
        	while(e!=0) {
        		rem = e%10; // rem will store the last value of the number
        		rev+=rem; // rev will store the string value of the last digit being the first digit and so on (in short the reverse)
        		e = e/10; // diving e by 10 to remove the last digit and avoid performing any further actions on it
        	}
		
        	if(Integer.parseInt(rev)==num) { // Integer.parseInt( ) converts the string value to an integer type
        		System.out.println(num + " is a palindrome number"); // if the reverse of the number is equal to the original number         	
        	}        
        	else {
        		System.out.println(num + " is not a palindrome number"); // if the reverse of the number is not equal to the original number  
        	}
		
        	scan.close( ); // closing the scanner class since we have no further use of it
	}

}
