/* Nonagonal numbers are the figurate numbers of the form n(7n-5)/2 where n is 
 * the nth term. It counts the number of dots in a pattern of n nested nonagons 
 * that has 9-sides. All share a common corner, where the i-th nonagon in the 
 * pattern has sides made of i dots spaced one unit apart from each other.
 * [Examples - 24, 2125, 6069]
 */

import java.util.*; // For the scanner class 

public class Nonagal_number {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in); // Creating an object with the name "scan"
		
		System.out.println("Enter a number"); // Telling the user to input a number
		int num = scan.nextInt( ); // Input function
		boolean nonagal = false; // Initializing and Declaring nonagal with boolean value false
		int a = 9800, b = 19600; // Initializing and Declaring a and b with integer values 9800 and 19600
		
    // Initializing arrays ar1, ar2, and ar3 of sizes 9800 each 
		int ar1[] = new int[9800];
		int ar2[] = new int[9800];
		int ar3[] = new int[9800];
		
		for(int i=0; i<9800; i++) { // running a for loop till 1 value less than 9800
			ar1[i] = i*(7*i-5)/2; // stroing every nonagal number till 9799th term in ar1
		}
		
		for(int i=0; i<9800; i++) { // running a for loop till 1 value less than 9800
			ar2[i] = a*(7*a-5)/2; // stroing every nonagal number from 9800 till 19599th term in ar2
			a++; 
		} 
		
		for(int i=0; i<9800; i++) { // running a for loop till 1 value less than 9800
			ar3[i] = b*(7*b-5)/2; // stroing every nonagal number from 19600 till 29400th term in ar3
			b++;
		}
				
		if(num<336046906) {				
			for(int j: ar1) { // running a for each loop to traverse ar1
				if(j==num) {
					nonagal = true; // if the number entered is found in ar1
					break;
				}
				else {
					nonagal = false; // if the number entered is not found in ar1
				}
			}
		}
		else if(num>=336115500 && num<1344373806) {
			for(int j: ar2) { // running a for each loop to traverse ar2
				if(j==num) {
					nonagal = true; // if the number entered is found in ar2
					break;
				}
				else {
					nonagal = false; // if the number entered is not found in ar2
				}
			}			
		}
		else if(num>=1344511000 && num<2147483647) {
			for(int j: ar3) { // running a for each loop to traverse ar3
				if(j==num) {
					nonagal = true; // if the number entered is found in ar3
					break;
				}
				else {
					nonagal = false; // if the number entered is not found in ar3
				}
			}
		}
		else {
			System.out.println("Out of Bounds!"); // if the number entered is not in the integer range
		}
		
		if(nonagal==true) {
			System.out.println(num + " is a nonagal number"); // if nonagal is true
		}
		else {
			System.out.println(num + " is not a nonagal number"); // if nonagal is false
		}
		
		scan.close( ); // closing the scanner class since we have no further use of it

	}

}
