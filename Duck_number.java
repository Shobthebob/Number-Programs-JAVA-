/*A number that has at least one 0 ( but not at the beginning of the number ) is called a duck
 * number.
 */

package special_numbers;

import java.util.*;
public class Duck_number {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		String num = scan.next( );
		int len = num.length( );
		char ch;
		int c = 0;
		for(int i=0; i<len; i++) {
			ch = num.charAt(i);
			if(num.charAt(0)=='0') {
				for(int j=0; j<(len-1); j++) {
					if((num.substring(1)).charAt(j) == '0') {
						c = 1;
					}
				}				
			}
			else if(ch == '0') {
				c = 1;
			}
		}
		if(c==1) {
			System.out.println(num + " is a duck number");			
		}
		else {
			System.out.println(num + " is not a duck number");
		}
		scan.close( );
	}

}
