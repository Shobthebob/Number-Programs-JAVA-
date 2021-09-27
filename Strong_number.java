/* If the sum of the factorial of individual digits of a number is equal to the same number then 
 * the number is called a strong number.
 */

package special_numbers;

import java.util.*;
public class Strong_number {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		String n = scan.next( );
		int num = Integer.parseInt(n);
		int len = n.length( );
		int fact = 1;
		int s = 0;
		char ch;
		for(int i=0; i<len; i++) {
			ch = n.charAt(i);
			int n1 = ch - '0';
			for(int j=1; j<=n1; j++) {
				fact*=j;
			}
			s+=fact;
			fact = 1;
		}
		if(s==num) {
			System.out.println(num + " is a strong number");			
		}
		else {
			System.out.println(num + " is not a strong number");
		}
		scan.close( );
	}

}
