/* If the sum of the digits of a number is equal to the product of the digits of the number then 
 * the number is said to be a spy number. [Examples - 1, 123, 1124]
 */

import java.util.*; // For the scanner class 

public class Spy_number {

	public static void main(String[] args) {	
		
		Scanner scan = new Scanner (System.in); // Creating an object with the name "scan"
		
		System.out.println("Enter a number"); // Telling the user to input a number
		int n = scan.nextInt( ); // Input function
		int product=1,sum=0; // Initializing and Declaring product and sum with integer values 1 and 0
        	int ld; // Initializing ld  
		
        	while(n>0) { // runnning a while loop until n ends up being 0
            		ld=n%10; // ld will store the last digit of the number
            		sum=sum+ld; // sum adds every digit (ld)
            		product=product*ld; // product multiplies every digit (ld)
            		n=n/10; // diving n by 10 to remove the last digit and avoid performing any further actions on it
        	}        
		
        	if(sum==product){
            		System.out.println("Given number is spy number"); // if the sum and the product of each digit are equal
		}
        	else{
            		System.out.println("Given number is not spy number"); // if the sum and the product of each digit are not equal
		}
		
        	scan.close( ); // closing the scanner class since we have no further use of it
	}
}
