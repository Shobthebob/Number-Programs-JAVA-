/* In cricket, the number 111 is sometimes called “a Nelson” after Admiral Nelson, who allegedly 
 * only had “One Eye, One Arm, One Leg” near the end of his life. This is, in fact 
 * inaccurate—Nelson never lost a leg. Alternate meanings include “One Eye, One Arm, One Ambition”
 *  and “One Eye, One Arm, One Arsehole”. Its multiples are also considered Nelsons Number
 */

import java.util.*;

public class Nelson_number {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in); // Creating an object with the name "scan"
		
		System.out.println("Enter a number"); // Telling the user to input a number
		int num = scan.nextInt( ); // Input function
		
		if(n%111==0) {
			System.out.println(n + " is a nelson number"); // if the number is a multiple of 111
		}
		else {
			System.out.println(n + " is not a nelson number"); // if the number is not a multiple of 111
		}
		
		scan.close( ); // closing the scanner class since we have no further use of it
	}

}
