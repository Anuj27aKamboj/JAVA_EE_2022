import java.util.Scanner;

public class Practise_Coupon_Code {

  public static void main(String[] args) {
		// Conditional Constructs:-		
//        Scanner scanner = new Scanner(System.in); 
//		
//		System.out.println("Enter an Amount: ");
//		double amount = scanner.nextDouble();
//		
//		System.out.println("Enter Promo Code: ");
//		double promoCode = scanner.nextInt();
//		
//		scanner.close();
//		
//		
//		System.out.println("Amount is: "+amount);
//		System.out.println("Promo Code is: "+promoCode);
//		
//		
//		int JUMBO = 101; 
//		int ZOMHELLO = 201;
//		
//		double discount = 0;
//		
//		String message = (promoCode == JUMBO && amount >= 200)? "Prome Code JUMBO has Been applied to your Order successfully" : (promoCode == ZOMHELLO && amount>=159)? "Prome Code ZOMHELLO has Been applied to your Order successfully":"PromoCode is Invalid. \nTry Using JUMBO or ZOMHELLO";
//		System.out.println(message);
	
		
//		if(amount >= 159 && ((promoCode == JUMBO) || (promoCode == ZOMHELLO)) ) {
//			
//			discount = (promoCode == JUMBO && amount >=200)? amount * 0.5 : (promoCode == ZOMHELLO && amount>=159)? ((amount * 0.6 > 120)? 120 : amount * 0.6) : 0;
//			System.out.println("Please pay \u20b9"+(amount-discount));	
//			
//		    String message = (promoCode == JUMBO && amount >= 200 )? "Prome Code JUMBO has Been applied to your Order successfully" : (promoCode == ZOMHELLO && amount>=159)? "Prome Code ZOMHELLO has Been applied to your Order successfully":"PromoCode is Invalid. \nTry Using JUMBO or ZOMHELLO";
//		    System.out.println(message);
//		}
//		else {
//			
//		System.out.println("Add amount worth \u20b9"+(159-amount)+"more to avail Promo Code");
//		}
//   }
//}
		
//		
//		
//		Scanner scan = new Scanner(System.in);
//		double amount, discount = 0;
//		String promoCode;
//		
//		System.out.println("Enter an amount: ");
//		amount = scan.nextDouble();
//		
//		System.out.println();
//		
//		System.out.println("PROMOCODE AVAILABLE: \n *JUMBO* : FLat 50% Off for order worth \u20b9 200 or more \n *ZOMHELLO* : Flat 60% Off upto \u20b9 120 for orders worth \u20b9 159 or more ");
//		System.out.println("Enter a Promo Code");
//		promoCode = scan.next();
//		
//		System.out.println(promoCode);
//		
//		scan.close();
//		System.out.println();
//		
//		switch(promoCode){
//		 
//		case "JUMBO":
//			
//			String message = (amount >= 200)? amount*0.5 : "Amount is Lesser."
//			
//		
//		}
//		
//		
//
//
//	}
//
//}

////package package1;
//import java.util.*;
//
////public class Work1 
//public class Practise_Coupon_Code 
//{
//
//	public static void main(String[] args) 
//	{
////		Scanner sc = new Scanner(System.in);
////		double amount, discount = 0;
////		String couponCode;
////		
////		System.out.print("Enter an Amount: ");
////		amount = sc.nextDouble();
////		
////		System.out.println();
////		
////		System.out.println("JUMBO : Flat 50% Off for orders value worth equal or more than 200");
////		System.out.println("ZOMHELLO : Flat 40% Off upto Rs80 order value worth equal or more than 159\n");
////		System.out.print("Enter a Coupon Code: ");
////		couponCode = sc.next();
////		
////		System.out.println();
////		
////		System.out.println("Your Entered amount: "+amount+" | Your Entered Coupon Code :"+couponCode);
////		
////		sc.close(); // release the stream and make the memory clear :)
////		System.out.println();
////		
////		switch(couponCode) 
////		{
////		
////			case "JUMBO":
////				
////				if(amount >= 200) 
////				{
////					discount = 0.5 * amount;
////					System.out.println("JUMBO Applied Successfully");
////					System.out.println("Discount is: \u20b9"+discount);
////				}
////				else 
////				{
////					System.out.println("Amount is Lesser. Please add items worth "+(200-amount)+" more\n");
////					System.out.println("Otherwise");
////				}
////				
////				break;
////				
////			case "ZOMHELLO":
////				
////				if(amount >= 159) 
////				{
////					discount = 0.4 * amount;
////					discount = discount > 80 ? 80:discount ; 
////					System.out.println("ZOMHELLO Applied Successfully");
////					System.out.println("Discount is: \u20b9"+discount);
////				}
////				else 
////				{
////					System.out.println("Amount is Lesser. Please add items worth "+(159-amount)+" more\n");
////					System.out.println("Otherwise");
////				}
////				
////				break;
////				
////			default:
////				
////				System.out.println("Invalid Promo Code. Try any of them :");
////				System.out.println("JUMBO : Flat 50% Off for orders value worth equal or more than 200");
////				System.out.println("ZOMHELLO : Flat 40% Off upto Rs80 order value worth equal or more than 159\n");
////				System.out.println("Otherwise");
////		}
////		
////		amount -= discount;
////		System.out.println();
////		System.out.println("Please pay final amount: \u20b9"+amount);
////		
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
		
		double discount = 0;
		
		if(amount >= 159 && (promoCode == JUMBO || promoCode == ZOMHELLO)) {
			System.out.println("You will get Discount");
			
			discount = (promoCode ==  JUMBO && amount >= 200) ? 
					amount * 0.5 : 
						(promoCode == ZOMHELLO) ? 
								((amount * 0.6 > 120) ? 
										120 :
										amount * 0.6):
											0;
			
			String str = (promoCode ==  JUMBO && amount >= 200) ? 
					"Promo code JUMBO applied successfully \n Discount is " + discount : 
				(promoCode == ZOMHELLO) ?
						"promo code ZOMHELLO applied successfully \n Discount is " + discount :
							"Invalid promo code try using JUMBO or ZOMHELLo";
			System.out.print(str);
		}
		else {
			
			System.out.println("Invalid promoCode or \nAmount is Lesser. Please add items worth "+(159-amount)+" more");
		}		
	
	


	}

}
