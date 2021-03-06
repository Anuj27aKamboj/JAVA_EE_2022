import java.util.Scanner;

public class Scanner_Function {

	public static void main(String[] args) {
		// Read data from User using a class called Scanner
		Scanner scanner = new Scanner(System.in); // Scanner Object Construction
		
		System.out.println("Enter an Amount: ");
		double amount = scanner.nextDouble(); // to read a double
		
		System.out.println("Enter Promo Code: ");
		//String promoCode = scanner.nextLine(); // to read a String
		int promoCode = scanner.nextInt();
		
		scanner.close(); // release the memory resources
		
		
		System.out.println("Amount is: "+amount);
		System.out.println("Promo Code is: "+promoCode);
		
		// 2 Promo Codes :)
		
		int JUMBO = 101;   // Flat 50% off for the items worth 200 or more
		int ZOMHELLO = 201; // Flat 60% off for the items worth 159 or more upto 120
		
		// Simple if/else -> replaced with ternary operator :)
//		if(amount >= 159) {
//			System.out.println("You will get Dicsount");
//		}else {
//			System.out.println("No Discount Available");
//		}
		
		String message = (amount > 159) ? "You will get discount " : "No Discount Available ";
		System.out.println(message);

	}

}
