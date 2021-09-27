/* If the reverse of the number is equal to the number itself then the number is said to be a 
 *  Palindrome number
 */

package special_numbers;

import java.util.*;
public class Palindrome_number {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt( );
		String s = "";
		int d = 0;
        int e = num;
        while(num!=0) {
        	d = num%10;
        	s+=d;
        	num = num/10;
        }
        int rev = Integer.parseInt(s);
        if(rev==e) {
        	System.out.println(e + " is a palindrome number");        	
        }        
        else {
        	System.out.println(e + " is not a palindrome number");
        }
        scan.close( );
	}

}
