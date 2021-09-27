package special_numbers;

import java.util.*;

public class Prime_number {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scan.nextInt( );
		int count = 0;
		for(int i=2; i<n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==0) {
			System.out.println(n + " is a prime number");
		}
		else {
			System.out.println(n + " is not a prime number");
		}
		scan.close( );
	}

}
