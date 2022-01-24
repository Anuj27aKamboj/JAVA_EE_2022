import java.util.Scanner;

public class Assignment_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double amount, discount = 0;
		String promoCode;
		
		
		System.out.println("**WELCOME**");
		System.out.println("Enter your order Amount : ");
		amount = scan.nextDouble();
		
		System.out.println();
		
		System.out.println("PROMOCODE AVAILABLE: \n*JUMBO* : FLat 50% Off for order worth \u20b9 200 or more \n*ZOMHELLO* : Flat 60% Off upto \u20b9 120 for orders worth \u20b9 159 or more ");
		System.out.println("Enter a Promo Code : ");
		promoCode = scan.next();
		
		scan.close();
		System.out.println();
		
		System.out.println("Amount is: \u20b9"+amount);
		System.out.println("Promo Code is: "+promoCode);
		
		if(promoCode.equals("JUMBO") || promoCode.equals("ZOMHELLO")){
			if(amount >=159 && (promoCode.equals("JUMBO") || promoCode.equals("ZOMHELLO"))) {
					
			discount = (promoCode.equals("JUMBO") && amount >=200)? amount * 0.5 : ((promoCode.equals("ZOMHELLO")&& amount>=159)? ((amount * 0.6 > 120)? 120 : amount * 0.6) : 0);
			System.out.println("Please pay \u20b9"+(amount-discount));
			
			}
			else{
				
				int deduction_amount = promoCode.equals("JUMBO")?200:159;
				System.out.println("\nAdd amount worth \u20b9"+(deduction_amount-amount)+" more to avail "+promoCode);
				
				}
			
			String message = (promoCode.equals("JUMBO") && amount >= 200 )? "Prome Code JUMBO has Been applied to your Order successfully" : (promoCode.equals("ZOMHELLO") && amount>=159)? "Prome Code ZOMHELLO has Been applied to your Order successfully":"Invalid Request";
			System.out.println(message);
			
			}
		else {
			
			System.out.println("PromoCode is Invalid. \nTry Using JUMBO or ZOMHELLO");
	    }
   }
}
		

