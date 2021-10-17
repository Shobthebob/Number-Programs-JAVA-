/* If the sum of the digits of the square of a number is equal to the number itself the number is 
 * said to be a Neon number. [Examples - 0, 1, 9]
 */

import java.util.*;
public class Neon_number {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt( );
		int sq = num*num;		
		int d=0,s=0;
		while(sq!=0) {
			d = sq%10;
			s+=d;
			sq = sq/10;
		}
		if(s==num) {
			System.out.println(num + " is a neon number");
		}
		else {
			System.out.println(num + " is not a neon number");
		}
		scan.close( );

	}

}
