/*Happy Number are positive non-zero integer numbers.
 * If we find the sum of the squares of its every digit and repeat that process until the number 
 * will be equals to 1(one).
 */

package special_numbers;

import java.util.*;
public class Happy_number {
	
	 public static int HappyNumber(int num) {
		 int rem = 0, sum = 0;
		 while(num > 0){  
	            rem = num%10;  
	            sum = sum + (rem*rem);  
	            num = num/10;  
	        }  
	        return sum; 		 
	 }	        
	 
	 public static void main (String[] args) {  
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter a number");
	        int num = scan.nextInt( );
	        int result = num;  
	          
	        while(result != 1 && result != 4){  
	            result = HappyNumber(result);  
	        }   
	        if(result == 1) { 
	            System.out.println(num + " is a happy number");  
	        } 
	        else if(result == 4) {  
	            System.out.println(num + " is not a happy number"); 
	        }
	        scan.close( );
	 } 
}
