/* The product of two consecutive integers is said to be a Pronic number 
* [Examples - 30, 42, 56]
*/

import java.util.*; // For the scanner class 

public class Pronic_number {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in); // Creating an object with the name "scan"
		
		System.out.println("Enter a number"); // Telling the user to input a number
		int num = scan.nextInt( ); // Input function
		int a=0; // Initializing and Declaring a with an integer value 0 (representing false)
		
		for(int i=0; i<=num; i++) { // Running a for loop till num		
			if((i*(i+1)) == num) {
				a = 1; // a turns 1(representing true) when it finds out that num is a product of two
					// consecutive integers
			}			
		}
		
		if(a==1) {
			System.out.println(num + " is a pronic number"); // if a came out to be 1		 
		}
		else {
			System.out.println(num + " is not a pronic number"); // if a stayed with the number 0
		}
		
		scan.close( ); // closing the scanner class since we have no further use of it
	}

}
