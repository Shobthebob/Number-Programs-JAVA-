/* If the sum of the digits of a number is divisible by the number itself the number is said to be 
 * a Niven number
 */

package special_numbers;

import java.util.*;
public class Niven_number {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int s=0, d=0;		
		System.out.println("Enter a number:");
		int num = scan.nextInt( );
		int n = num;
		while (n>0) {
			d = n%10;
			s = s+d;
			n = n/10;
		}
		if(num%s==0) {
			System.out.println(num + " is a niven number");
		}
		else {
			System.out.println(num + " is not a niven number");
		}
		scan.close();
	}
}
