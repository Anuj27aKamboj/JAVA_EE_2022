import java.util.*;

public class Assignment_4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		char blackSquare = '\u25A1';	// 1
		char whiteSquare = '\u25A0';	// 0
		char queen = '\u2655';
		int queenNumber = 0;
		
		System.out.println("Original Chess Board : ");
		
		char square[][] = new char[8][8];
		
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				if(i%2==0) {
					square[i][j] = ( (j+1) % 2 == 0 )? blackSquare : whiteSquare;
					System.out.print(square[i][j]+" ");
				}
				else {
					square[i][j] = (j % 2) == 0 ? blackSquare : whiteSquare;
					System.out.print(square[i][j]+" ");
				}
				
			}System.out.println();
			
		}
		
		System.out.println("Enter the number of queens you would like to place on ChessBoard (maximum limit is 4");
		queenNumber = scan.nextInt();
		
		int count = 0;
		int row = 0;
		int col = 0;
		while (count < queenNumber) {
			System.out.print("Enter new row: ");
			int newRow = scan.nextInt();
			while (newRow == row) {
				System.out.print("Sorry, This row is already assigned \nEnter another row: ");
				newRow = scan.nextInt();
			}
			row = newRow;

			System.out.print("Enter new column: ");
			int newCol = scan.nextInt();
			while (newCol == col) {
				System.out.print("Sorry, This column is already assigned \nEnter another column: ");
				newCol = scan.nextInt();
			}
			col = newCol;

			for (int i = 0; i <= 8; i++) {
				for (int j = 0; j <= 8; j++) {
					if (i == newRow && j == newCol) {
						square[i-1][j-1] = queen;
					}
				}
			}
			count++;
		}
		
		scan.close();
		
		System.out.println("\nChessboard after placing "+queenNumber+" Queens\n");
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				
				System.out.print(square[i][j] + " ");
				
			}System.out.println();	
		}
		
		System.out.println();
		
	}
	
}


