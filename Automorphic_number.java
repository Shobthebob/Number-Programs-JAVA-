/*In mathematics, a number is called an Automorphic number if the square of the number ends with 
 * the same number.
 */

package special_numbers;

import java.util.*;
public class Automorphic_number {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt( );
		int e = num;		
		//reverse of number
		int square = num*num;
		String s1 = "";
		int d = 0;
        while(num!=0) {
        	d = num%10;
        	s1+=d;
        	num = num/10;
        }
        String rev = s1; // to store the value of reversed number
        int n1 = Integer.parseInt(rev);
        int len = s1.length( );        
        // reverse of square of number
        String s2 = "";
		int r = 0;
        while(square!=0) {
        	r = square%10;
        	s2+=r;
        	square = square/10;
        }
        String reverse = s2;// to store value of reversed square         
        int n2 = Integer.parseInt(reverse.substring(0,len));
        if(n2==n1) {        
        	System.out.println(e + " is an Automorphic number");
        }
        else {
        	System.out.println(e + " is not an Automorphic number");
        }
        scan.close( );
	}

}
