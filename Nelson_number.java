/* In cricket, the number 111 is sometimes called “a Nelson” after Admiral Nelson, who allegedly 
 * only had “One Eye, One Arm, One Leg” near the end of his life. This is, in fact 
 * inaccurate—Nelson never lost a leg. Alternate meanings include “One Eye, One Arm, One Ambition”
 *  and “One Eye, One Arm, One Arsehole”. Its multiples are also considered Nelsons Number
 */

package special_numbers;

import java.util.*;
public class Nelson_number {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt( );
		if(n%111==0) {
			System.out.println(n + " is a nelson number");
		}
		else {
			System.out.println(n + " is not a nelson number");
		}
		scan.close( );
	}

}
