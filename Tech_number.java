/*A number which has an even number of digits, and when the number of digits split into two halves
 * then the square of the sum of those halves is equal to the same number, is called Tech number.
 */

package special_numbers;

import java.util.*;
public class Tech_number {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt( );
		String n = String.valueOf(num);
		int len = n.length( );
		if(len%2==0) {
			int d = len/2;
			String n1 = n.substring(0,d);
			String n2 = n.substring(d);
			int sum_of_n = (Integer.parseInt(n1)) + (Integer.parseInt(n2));
			int square = sum_of_n * sum_of_n;
			if(square == num) {
				System.out.println(num + " is a tech number");
			}
			else {
				System.out.println(num + " is not a tech number");
			}
		}
		else {
			System.out.println("Sorry " + num + " does not have even amount of numbers");
		}
		scan.close( );
	}

}
