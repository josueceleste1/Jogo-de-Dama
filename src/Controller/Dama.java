package Controller;
import java.util.Scanner;
import Model.Board;
import Model.Human;
import Model.Player;
import View.ShowTable;

public class Dama {
	private Board board = new Board();
	private int turn = 1, who = 1;
	private Player player1; 
	private Player player2; 
	private String name1;
	private String name2;
	public Scanner input = new Scanner(System.in);
	private ShowTable show = new ShowTable();
	
	
	
	public Dama() {
		board = new Board();
		startPlayers();
		
		while(Play());
		
	}
	
	

	public void startPlayers() {
		System.out.println("-------JOGO DE DAMAS------- \n");
		
		System.out.println("Digite seu Nome jogador 1:");
		name1 = input.nextLine();
		this.player1 = new Human(1);
		
		System.out.println("Digite seu Nome jogador 2:");
		name2 = input.nextLine();
		this.player2 = new Human(2);
      	
	}
	
	public int choosePlayer() {
		int option = 0;
		
		do {
			System.out.println("1 Human");
			
			//System.out.println("Digite seu Nome para ser o jogador 1");
			System.out.println("Option: ");
			option = input.nextInt();
			
			if(option != 1 && option != 2)
				System.out.println("Escolha errada! tente de novo ");
			
		}while(option != 1 && option != 2);
		
		return option;
	}
	
	
	public boolean Play(){
		 show.ShowBoard(board);
	        if(Won() == 0 ){
	            System.out.println("----------------------");
	            System.out.println("\nTurn "+turn);
	            System.out.println("Vez do jogador: " + who());
	            
	            if(who()==1)
	                player1.Play(board);
	            else
	                player2.Play(board);
	            
	            
	            who++;
	            turn++;
	       
	            return true;
	        } else{
	            if(Won() == -1 )
	                System.out.println(name1 + " venceu!");
	           else
	                System.out.println(name2 +" venceu!");
	            
	            return false;
	        }
	}
	        
	 public int who(){
	        if(who%2 == 1)
	            return 1;
	        else
	            return 2;
	    }
	 
	 public int Won() {
		 System.out.println(name1 + ": capturou " + player1.Winner()+" peca(s)");//DEPOIS MUDAR PARA O NOME DO JOGADOR
		 System.out.println(name2 + ": capturou " + player2.Winner()+" peca(s)");
		 
		 if(player1.Winner() == 12) {
			 return -1;
		 }
		 if(player2.Winner() == 12) {
			 return 1;
		 }
		 return 0;
	 }
	
	
	
    public static void main(String[] args) {
		new Dama();
    }
    
	
}
