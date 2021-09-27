/* If the square root of the number + 1 is an integer then the number is said to be a perfect 
 * square number (If you still didnt understand and wanted to search it then search for sunny
 * number.
 */

package special_numbers;

import java.util.*;
public class Perfect_square_number {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt( );
		int sq = num+1;
		if(Math.sqrt(sq)%1 == 0) {
			System.out.println(num + " is a perfect square number");
		}
		else {
			System.out.println(num + " is not a perfect square number");
		}
		scan.close( );
	}

}
