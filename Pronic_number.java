/* The product of two consecutive integers is said to be a Pronic number */

package special_numbers;

import java.util.*;
public class Pronic_number {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt( );	
		int a=0;
		for(int i = 0; i<=num; i++) {		
			if((i*(i+1)) == num) {
				a = 1; 
			}			
		}
		if(a==1) {
			System.out.println(num + " is a pronic number");		 
		}
		else {
			System.out.println(num + " is not a pronic number");
		}
		scan.close( );
	}

}
