package Model;

import java.util.Scanner;
import Controller.DamaController;

public class Human extends Player{
	public Scanner input = new Scanner(System.in);
	public int x, y;
	
	 public Human(int player){
	        super(player);
	        this.player = player;
	    }
	
	@Override
	public void Play(Board board) {
		Try(board);
		
	}
	
	@Override
	public void Try(Board b) {
		int sair = 0;
		
		
		DamaController d = new DamaController(player, eat);
		
		while(sair!=1){
			
			System.out.println("Player "+ player +" escolha a peca que deseja movimentar:");
			
			
			do {
				x = input.nextInt();
				if(x<1 ||x>8) {
					System.out.println("escolha errada tente novamente!");
				}
					
			}while(x<1||x>8);
			
			do {
				y = input.nextInt();
				
				if(y<1 ||y>8) {
					System.out.println("escolha errada tente novamente!");
				}
					
			}while(y<1 || y>8);
			
			
				if((player == 1) && ((b.Board[x][y] == 2) || (b.Board[x][y] == 4))) {
					
					eat = d.setPosition(b, x, y);
					sair = 1;
					break;
				}
			
				if(player == 2 && ((b.Board[x][y] == 3) || (b.Board[x][y] == 5))) {
					
					eat = d.setPosition(b, x, y);
					sair = 1;
					break;
				}
				
				
					System.out.println("Peca invalida!");
			
					
		}
			
	}
	
}
