/* If the sum of the digit of a number raised to the power of its position is equal to the number
 * itself the number is said to Disarium number
 */

package special_numbers;

import java.util.*;
public class Disarium_number {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		String num = scan.next( );
		int s=0;
		int j=0;
		int len = num.length( );
		for(int i = 0; i<len; i++) {
			j = i+1; 
			s+=Math.pow(Integer.parseInt(String.valueOf(num.charAt(i))),j);
		}
		if(s==Integer.parseInt(num)) {
			System.out.println(num + " is a disarium number");
		}
		else {
			System.out.println(num + " is not a disarium number");
		}
		scan.close( );
	}
}
