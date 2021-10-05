/*Happy Number are positive non-zero integer numbers.
 * If we find the sum of the squares of its every digit and repeat that process until the number 
 * will be equals to 1(one). [Examples - 13, 23, 100]
 */

import java.util.*; // For the scanner class

public class Happy_number {
	
	 public static int HappyNumber(int num) { // This method will reutrn the sum of the 
		 // square of the digits of the number entered
		 int rem = 0, sum = 0;
		 while(num > 0){  
	            rem = num%10; // gets the last digit 
	            sum = sum + (rem*rem); // sum of the square of the digit
	            num = num/10; // rest of the number apart from the last digit 
	        }  
	        return sum; // returns the sum  		 
	 }	        
	 
	 public static void main (String[] args) {  
		 
	        Scanner scan = new Scanner (System.in); // Creating an object with the name "scan"
		
		System.out.println("Enter a number"); // Telling the user to input a number
		int num = scan.nextInt( ); // Input function
	        int result = num; // initializing and declaring result  
	          
	        while(result != 1 && result != 4){  
	            result = HappyNumber(result); // Checks if the number ultimately reaches 1 or not
	        }   
		 
	        if(result == 1) { 
	            System.out.println(num + " is a happy number"); // If sum finally turns out to be 1
	        } 
	        else if(result == 4) {  
	            System.out.println(num + " is not a happy number"); // If sum finally turns out to be 2
	        }
		 
	        scan.close( );
	 } 
}
