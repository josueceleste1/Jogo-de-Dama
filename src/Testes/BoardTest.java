package Testes;
import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Test;

import Controller.DamaController;
import Model.Board;


public class BoardTest {
	int eat=0;
	DamaController d = new DamaController(1, eat);
	Board b = new Board();
	public Scanner input = new Scanner(System.in);
	int x=6,y=3;
	
	
	@Test
	public void Andar() {
		System.out.println(" Test Andar");
		
				for(int i=1; i<5; i++) {
					
				int jogada = i;
				//ANDA PARA A ESQUERDA
				if((b.Board[x-1][y-1]==1) && (jogada==1)){
					b.Board[x-1][y-1]=4;
					b.Board[x][y]=1;
					assertEquals(4, b.Board[x-1][y-1]);
					assertEquals(1, b.Board[x][y]);
				}
				//ANDA PARA A DIREITA
				if((b.Board[x-1][y+1]==1) && (jogada==2)){
					b.Board[x-1][y+1]=4;
					b.Board[x][y]=1;
					assertEquals(4, b.Board[x-1][y+1]);
					assertEquals(1, b.Board[x][y]);
				}
				//DAMA ANDA PARA ESQUERDA
				if((b.Board[x+1][y-1]==1) && (jogada==3)){
					b.Board[x+1][y-1]=4;
					b.Board[x][y]=1;
					assertEquals(4, b.Board[x+1][y-1]);
					assertEquals(1, b.Board[x][y]);
				}
				//DAMA ANDA PARA DIREITA
				if((b.Board[x+1][y+1]==1) && (jogada==4)){
					b.Board[x+1][y+1]=4;
					b.Board[x][y]=1;
					assertEquals(4, b.Board[x+1][y+1]);
					assertEquals(1, b.Board[x][y]);
				}
			}	
		
	}
	
	@Test
	public void Comer() {
		System.out.println(" Test Comer uma peca");
		
		for(int i=1; i<4; i++) {
			int jogada = i;
			if((((b.Board[x-1][y-1] == 3)||(b.Board[x-1][y-1] == 5))&&(b.Board[x-2][y-2]==1))&&(jogada==1)){
				b.Board[x][y] = 1;
				b.Board[x-1][y-1] = 1;
				b.Board[x-2][y-2] = 4;
				eat++;
				
				assertEquals(1, b.Board[x][y]);
				assertEquals(1, b.Board[x-1][y-1]);
				assertEquals(4, b.Board[x-2][y-2]);
				assertEquals(1, eat);
				
			}
			if((((b.Board[x-1][y+1] == 3)||(b.Board[x-1][y+1] == 5))&&(b.Board[x-2][y+2]==1))&&(jogada==2)){
				b.Board[x][y] = 1;
				b.Board[x-1][y+1] = 1;
				b.Board[x-2][y+2] = 4;
				eat++;
				
				assertEquals(1, b.Board[x][y]);
				assertEquals(1, b.Board[x-1][y+1]);
				assertEquals(4, b.Board[x-2][y+2]);
				assertEquals(1, eat);
			}
			if((((b.Board[x+1][y-1] == 3)||(b.Board[x+1][y-1] == 5))&&(b.Board[x+2][y-2]==1))&&(jogada==3)){
				b.Board[x][y] = 1;
				b.Board[x+1][y-1] = 1;
				b.Board[x+2][y-2] = 4;
				eat++;
				
				assertEquals(1, b.Board[x][y]);
				assertEquals(1, b.Board[x+1][y-1]);
				assertEquals(4, b.Board[x+2][y-2]);
				assertEquals(1, eat);
			}
			if((((b.Board[x+1][y+1] == 3)||(b.Board[x+1][y+1] == 5))&&(b.Board[x+2][y+2]==1))&&(jogada==4)){
				b.Board[x][y] = 1;
				b.Board[x+1][y+1] = 1;
				b.Board[x+2][y+2] = 4;
				eat++;
				
				assertEquals(1, b.Board[x][y]);
				assertEquals(1, b.Board[x+1][y+1]);
				assertEquals(4, b.Board[x+2][y+2]);
				assertEquals(1, eat);
			}
		}
		
	}
	
	@Test 
	public void TranformaEmDama() {
		
		for(int i=1;i<9;i++){											
			if(b.Board[1][i]==2){
				b.Board[1][i]=4;
			}
		}
		
		for(int i=1;i<9;i++) {
			if(b.Board[1][i]==2){
				assertEquals(4, b.Board[1][i]);
			}
		}
		
	}
	
}




























