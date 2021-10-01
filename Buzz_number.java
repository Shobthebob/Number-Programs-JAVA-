/* If the number ends with a 7 or is divisible by 7 then the number is a buzz number. [Examples - 7, 17, 42] */

import java.util.*; // For the scanner class 

public class Buzz_number {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in); // Creating an object with the name "scan"
		
		System.out.println("Enter a number"); // Telling the user to input a number
		int num = scan.nextInt( ); // Input function
		
		if(num%7==0 || num%10==7) { 
			System.out.println(num + " is a buzz number"); // If num is dvisible by 7 or if it ends with 7
		}
		else {
			System.out.println(num + " is not a buzz number"); // If num is not dvisible by 7 or if it doesnt ends with 7
		}
		
		scan.close( ); // closing the scanner class since we have no further use of it
	}
}
