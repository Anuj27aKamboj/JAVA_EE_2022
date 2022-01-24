
public class Nested_Loops {

	public static void main(String[] args) {
		
//			for(int i=1;i<=3;i++) {
//				
//				System.out.println(">> i is: "+i);
//				
//				for(int j=1;j<=5;j++) {
//					System.out.print(j+" ");
//				}
//				
//				System.out.println();
//			}
//			
//			System.out.println();
			
			char blackSquare = '\u25A1';	// 1
			char whiteSquare = '\u25A0';	// 0
			char queen = '\u2655';
			
			/*
			 	
			 	1 0 1 0 1 0 1 0 
				0 1 0 1 0 1 0 1 
				1 0 1 0 1 0 1 0 
				0 1 0 1 0 1 0 1 
				1 0 1 0 1 0 1 0 
				0 1 0 1 0 1 0 1 
				1 0 1 0 1 0 1 0 
				0 1 0 1 0 1 0 1 
			 	
			 */
			
			/*for(int i=0;i<8;i++) {
				for(int j=0;j<8;j++) {
					if(i%2==0) {
						System.out.print( (j+1) % 2+" ");
					}else {
						System.out.print( j % 2+" ");
					}
					
				}
				System.out.println();
			}*/
			
			for(int i=0;i<8;i++) {
				for(int j=0;j<8;j++) {
					if(i%2==0) {
						char square = ( (j+1) % 2 == 0 )? blackSquare : whiteSquare;
						System.out.print(square+" ");
					}else {
						char square = (j % 2) == 0 ? blackSquare : whiteSquare;
						System.out.print(square+" ");
					}
					
				}
				System.out.println();
			}
	}

}
