/*An evil number is a positive whole  number that has an even number of 1’s in its binary 
 * equivalent. 
 */

package special_numbers;

import java.util.*;
public class Evil_number {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
	    int n = scan.nextInt( );
		String num = Long.toBinaryString(n);
		char ch;
		int count = 0;
		int len = num.length( );
		for(int i=0; i<len; i++) {
			ch = num.charAt(i);
			if(ch == '1') {
				count ++;
			}
		}
		System.out.println("The binary value of " + n + " is " + num);
		System.out.println("");
		if(count%2==0) {
			System.out.println(n + " is an evil number");
		}
		else {
			System.out.println(n + " is not a evil number");
		}
		scan.close( );
	}

}
