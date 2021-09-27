/*A number whose square divided into two parts (none of the parts have only 0) and the sum of the 
 * parts is equal to the original number then it is called Capricon number.
 */

package special_numbers;

import java.util.*;
public class Capricon_number {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt( );
		int square = num*num;
		String sq = String.valueOf(square);
		int len = sq.length( );
		String sq1,sq2;
		int sum = 0;
		if(len%2==0) {
			int d = len/2;
			sq1 = sq.substring(0,d);
			sq2 = sq.substring(d);	
			sum = (Integer.parseInt(sq1)) + (Integer.parseInt(sq2));
			if(sum == num) {
				System.out.println(num + " is a capricon number");
			}
			else {
				System.out.println(num + " is not a capricon number");
			}
		}
		else {
			System.out.println("The square of the number entered does not have equal parts");
		}		
        scan.close( );
	}

}
