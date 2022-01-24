import java.util.Scanner;

public class Assignment_1 {

	public static void main(String[] args) {
		
//    1. Break and Continue:-
		
		Outer:
			for(int i=0; i<6; i++) {
				for(int j=0; j<5; j++) {
					if(i == 5 ) {
						continue Outer;
					}
					System.out.println("The value is [ "+i+","+j+" ]");
				}
			}
		
		
		System.out.println("\n\n\n");
		
			Inner:
				for (int i = 0; i < 4; i++) {
		               for (int j = 0; j< 3; j++){
		                  if(i * j >10 ){
		                     break Inner;
		                  }    
		 
		                System.out.println("The value is [ "+i*j+" ]");
		           }
		      }		
	}

}
