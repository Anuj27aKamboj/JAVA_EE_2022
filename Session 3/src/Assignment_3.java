import java.util.Scanner;

public class Assignment_3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double amount = 0, distance = 0;
		String vehicle, destination;
		
		System.out.println("*Welcome to GoGO*");
		System.out.println("Enter your Destination");
		destination = scan.next();
		
		System.out.println("Enter your distance( in KM ) from Pickup location to Destination ");
		distance = scan.nextDouble();
		
		System.out.println("Current Vehicle Service Availabe :");
		System.out.println("*Bike*  --> Base fare = \u20b9 20 \u00A6  Rate per KM = \u20b9 8 ");
		System.out.println("*Auto*  --> Base fare = \u20b9 30 \u00A6  Rate per KM = \u20b9 10 ");
		System.out.println("*Car*   --> Base fare = \u20b9 50 \u00A6  Rate per KM = \u20b9 16 ");
		System.out.println("*Sedan* --> Base fare = \u20b9 60 \u00A6  Rate per KM = \u20b9 18 ");
		System.out.println("*Van*   --> Base fare = \u20b9 70 \u00A6  Rate per KM = \u20b9 22 ");
		
		System.out.println();
		
		System.out.println("Enter your preferred Service Type : ");
		vehicle = scan.next();
		
		scan.close();
		
		switch(vehicle){
		
		case "Bike":
			amount = distance*8 + 20 ;
			break;
		
		case "Auto":
			amount = distance*10 + 30;
			break;
			
		case "Car":
			amount = distance*16 + 50;
			break;
			
		case "Sedan":
			amount = distance*18 + 60;
			break;
			
		case "Van":
			amount = distance*22 + 70;
			break;
			
		default:
			System.out.println("Sorry \u1F614 , couldn't process your request ");
		
		}
		
		System.out.println("Please pay amount : \u20b9"+amount);
	}

}
