/* If the sum of the factorial of the digits of a number is equal to the number itself the number
 * is said to be a Krishnamurthy number
 */

package special_numbers;

import java.util.*;
public class Krishnamurthy_number {
	
	public static int factorial(int n) {
		int fact = 1;
		for(int i = 1; i<=n; i++) {
			fact*=i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt( );
		int d=0,s=0;
		int e = num;
		while(num!=0) {
			d = num%10;
			s+=factorial(d);
			num=num/10;
		}
		if(s==e) {
			System.out.println(e + " is a krishnamurthy number");
		}
		else {
			System.out.println(e + " is not a krishnamurthy number");
		}
		scan.close( );
	}

}
