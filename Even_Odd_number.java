import java.util.*; // For the scanner class

public class Even_Odd_number {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in); // Creating an object with the name "scan"
		
		System.out.println("Enter a number"); // Telling the user to input a number
		int num = scan.nextInt( ); // Input function
		
		if(num%2==0) { // If num is divisible by 2
			System.out.println(num + " is an even number");
		}
		else { // If num is not divisible by 2
			System.out.println(num + " is an odd number");
		}
		
		scan.close( );	// Closing the scanner class because we have no further use of it 

	}

}
