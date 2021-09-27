/* If the sum of the digits of a number is equal to the product of the digits of the number then 
 * the number is said to be a spy number
 */

package special_numbers;

import java.util.*;
public class Spy_number {

	public static void main(String[] args) {	
		Scanner scan = new Scanner (System.in);
		int product=1,sum=0;
        int ld;        
        System.out.println("Enter a number:");
        int n = scan.nextInt( );
        while(n>0)
        {
            ld=n%10;
            sum=sum+ld;
            product=product*ld;
            n=n/10;
        }        
        if(sum==product)
            System.out.println("Given number is spy number");
        else
            System.out.println("Given number is not spy number");
        scan.close( );
	}

}
