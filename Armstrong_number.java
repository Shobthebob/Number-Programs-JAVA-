/* If the sum of the cube of the digits of a number is equal to the number itself, the number is
 * said to a an Armstrong number. 
 */

import java.util.*;
public class Armstrong_number {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt( );
		int e = num;
		int d=0,s=0,p=1;
		while(num!=0) {
			d = num%10;
			p = d*d*d;
			s+=p;
			num = num/10;		
		}
		if(s==e) {
			System.out.println(e + " is an armstrong number");		
		}
		else {
			System.out.println(e + " is not an armstrong number");
		}
	    scan.close( );
	}

}
