/* A number is said to be a magic number if the sum of its digits is calculated till a single 
 * digit recursively by adding the sum of the digits after every addition.
 * If the single-digit comes out to be 1, then the number is a magic number.
 * OR IN SIMPLE FUCKING WORDS
 * If the number, when divided by 9, leave a remainder of 1, the number is a magic number
 */

package special_numbers;

import java.util.*;
public class Magic_number {
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt( );	
		if(num%9==1) {
			System.out.println(num + " is a magic number");
		}
		else {
			System.out.println(num + " is not a magic number");
		}
		scan.close( );
	}
	
}
