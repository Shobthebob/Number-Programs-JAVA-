/*A number that has at least one 0 ( but not at the beginning of the number ) is called a duck
 * number. [Examples - 102, 23230, 230982098231]
 */

import java.util.*; // For the scanner class 

public class Duck_number {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in); // Creating an object with the name "scan"
		
		System.out.println("Enter a number"); // Telling the user to input a number
		String num = scan.next( ); // Input function
		int len = num.length( ); // Length of the number entered     
		int count = 0; // Will count the number of '0' in the number entered
    		String n = String.valueOf(num); // Converts the number entred to a string type

   		if(n.charAt(0)=='0'){ // charAt(x) is used to fetch the character at index x
      			System.out.println(num + " is not a duck number"); // if the 1st digit of the number entered is a '0'
      			System.exit(0); // To terminate the entire program
		}
   	 	else{
      			for(int i=0; i<len; i++){ // running the for loop till 1 value less than len
        			if(n.charAt(i)=='0'){ // To count the number of '0'
          				count++; // increments by 1 is a 0 is found
        			}
     			}
    		}
    
		if(count>=1) {
			System.out.println(num + " is a duck number"); // If 1 or more '0' is found			
		}
		else {
			System.out.println(num + " is not a duck number"); // if there is no '0' in the number
		}
		scan.close( ); // closing the scanner class since we have no further use of it
	}
}
