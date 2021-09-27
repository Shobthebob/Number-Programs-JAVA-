/* If the sum of the factors of the number is equal to the number itself then the number is said
 * to be a Perfecr number
 */

package special_numbers;

import java.util.*;
public class Perfect_number {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt( );
		int e = 0;
		for(int i = 1; i<=num; i++) {
			if(num%i==0) {
				i+=i;				
			}
			e = i;
		}
		if(num == e) {
			System.out.println(num + " is a perfect number");
		}
		else {
			System.out.println(num + " is not a perfect number");
		}
		scan.close( );

	}

}
