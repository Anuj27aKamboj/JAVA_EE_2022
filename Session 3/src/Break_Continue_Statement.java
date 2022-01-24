
public class Break_Continue_Statement {

	public static void main(String[] args) {

		int myFloor = 5;
		
		for(int floor=1;floor<=10;floor++) {
			System.out.println("Lift at Floor #"+floor);
			
			if(floor == myFloor) {
				System.out.println("My Floor Arrived");
				break; // terminate the loop :)
			}
		}
		
		System.out.println();
		
		
		for(int roll=1;roll<=10;roll++) {
			
			if(roll<=5) {
				continue;// skips the statements inside the loop written below it and take the loop into next iteration
					
			}
			
			System.out.println("Lets take viva for student with roll number: "+roll);
			System.out.println("Viva Started");
			System.out.println("Viva Finished");
		}

		
//		Understanding:-
//		first:
//	         for (int i = 0; i < 3; i++) {
//	            for (int j = 0; j< 3; j++){
//	               if(i == 1){
//	                  continue first;
//	               }      
//	               System.out.print(" [i = " + i + ", j = " + j + "] \n");
//	            }
//	         }
//	     
//	         System.out.println();
//	     
//	         second:
//	            for (int i = 0; i < 3; i++) {
//	               for (int j = 0; j< 3; j++){
//	                  if(i == 1){
//	                     break second;
//	                  }    
//	 
//	                  System.out.print(" [i = " + i + ", j = " + j + "] \n");
//	               }
//	            }
	    }
}
