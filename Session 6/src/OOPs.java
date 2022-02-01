import java.util.*;

class User{
	
	String name;
	String phone;
	String email;
	char gender;
	String addressLine;
	String city;
	String state; 
	int zipCode;
	
}

public class OOPs {

	public static void main(String[] args) {
		
		User user1 = new User();
		User user2 = new User();
		
		User user3 = user1;
		
		System.out.println("user1 is: "+user1);
		System.out.println("user2 is: "+user2);
		System.out.println("user3 is: "+user3);
		
		System.out.println();

		// 1. Add Data
		user1.name = "John";
		user3.phone = "+91 99999 11111";
		user3.addressLine = "Redwood Shores";
		user1.zipCode = 12001;
		user1.email = "john@example.com";
		user1.city = "ABC";
		user1.state =" XYZ";
		user1.gender = 'M';
		
		user2.name = "Fionna";
		user2.phone = "+91 80808 10101"; 
		user2.addressLine = "Country Homes";
		user2.zipCode = 14001;
		user2.email = "fionna@example.com";
		user2.city = "PQR";
		user2.state =" XYZ";
		user2.gender = 'F';
		
		// 2. Update Data
		
		user1.name = "John Watson";
		user3.zipCode = 141001;
		
		// 3. Read Data
		System.out.println("user1 details:");
		System.out.println(user1.name+" lives in "+user1.addressLine+" with zipCode "+user1.zipCode);
		System.out.println();
		
		System.out.println("user2 details:");
		System.out.println(user2.name+" lives in "+user2.addressLine+" with zipCode "+user2.zipCode);
		System.out.println();
		
		System.out.println("user3 details:");
		System.out.println(user3.name+" lives in "+user3.addressLine+" with zipCode "+user3.zipCode);
		System.out.println();		

	}

}
