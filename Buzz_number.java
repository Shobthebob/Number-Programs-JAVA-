/* If the number ends with a 7 or is divisible by 7 then the number is a buzz number */

package special_numbers;

import java.util.*;
public class Buzz_number {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt( );
		if(num%7==0 || num%10==7) {
			System.out.println(num + " is a buzz number");
		}
		else {
			System.out.println(num + " is not a buzz number");
		}
		scan.close( );
	}

}
