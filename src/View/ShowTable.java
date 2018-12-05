package View;

import Model.Board;

public class ShowTable {
	
	public void ShowBoard(Board b){
		int line, column;
		System.out.println();
		System.out.println("     1   2   3   4   5   6   7   8 ");
		System.out.println("    ===============================");
		for(line=1; line<9; line++) {
			System.out.print(line+"  | ");
			for(column=1; column<9 ; column++) {
				
				
				if(b.Board[line][column] == 0 || b.Board[line][column] == 1) {
					System.out.print(" ");
				}
				if(b.Board[line][column] == 2) {
					System.out.print("X");
				}
				if(b.Board[line][column] == 3) {
					System.out.print("O");
				}
				if(b.Board[line][column] == 4) {
					System.out.print("#");
				}
				if(b.Board[line][column] == 5) {
					System.out.print("@");
				}
				
				System.out.print(" | ");
				
			}
			System.out.println();
		}
		System.out.print("    ===============================\n");
	}
	
	
	
	
}
