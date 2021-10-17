/*In mathematics, a number is called an Automorphic number if the square of the number ends with 
 * the same number. [Examples - 5, 76, 890625] 
 */

import java.util.*; // For the scanner class 
public class Automorphic_number {

	public static void main(String[] args) {
				
		Scanner scan = new Scanner(System.in); // Creating an object with the name "scan"
		
		System.out.println("Enter a number: "); // Telling the user to input a number
		int num = scan.nextInt( ); // Input function
		int square = num*num; // Square of the entered number
		
		// Converting the number and its square to string
		String n = String.valueOf(num); 
		String sq = String.valueOf(square);
		
		if(Integer.parseInt(sq.substring((sq.length( )-1) - (n.length( )-1))) == num){ // Subtracting the lengths of the number and its square to get the number itself
			System.out.println(num + "is an Automorphic number"); // if the substring is equal to the entered number
		}
		else{
			System.out.println(num + "is an Automorphic number"); // if the substring is not equal to the entered number
		}
		
        	scan.close( ); // closing the scanner class since we have no further use of it
	}
}
