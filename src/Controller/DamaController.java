package Controller;

import java.util.Scanner;

import Model.Board;

public class DamaController{
	
	int player;
	int eat;
	public Scanner input = new Scanner(System.in);
	
	
	
	public DamaController(int player1, int eat) {
		this.player = player1;
		this.eat = eat;
	}

	public int setPosition(Board b,int  x,int y) {

	
	int jogada;
	// first player 1 ( Down side)
	if((player == 1) && (b.Board[x][y]==2)){
		
		if(b.Board[x-1][y-1] == 1){
			System.out.println("Digite 1 para se mover a Esquerda\n");
		}
		if(b.Board[x-1][y+1] == 1){
			System.out.println("Digite 2 para se mover a Direita\n");
		}
		if(((b.Board[x-1][y-1] == 3) || (b.Board[x-1][y-1] == 5))&&(b.Board[x-2][y-2]==1)){
			System.out.println("Digite 1 para comer a peca a Esquerda\n");
		}
		if(((b.Board[x-1][y+1] == 3) || (b.Board[x-1][y+1] == 5))&&(b.Board[x-2][y+2]==1)){
			System.out.println("Digite 2 para comer a peca a Direita\n");
		}
		
		jogada = input.nextInt();
		
		if((b.Board[x-1][y-1] == 1)&&(jogada==1)){
			b.Board[x][y] = 1;
			b.Board[x-1][y-1] = 2;
		}
		if((b.Board[x-1][y+1] == 1)&&(jogada==2)){
			b.Board[x][y] = 1;
			b.Board[x-1][y+1] = 2;
			
		}
		if((((b.Board[x-1][y-1] == 3) ||( b.Board[x-1][y-1] == 5))&&(b.Board[x-2][y-2]==1))&&(jogada==1)){
			 b.Board[x][y] = 1;
			 b.Board[x-1][y-1] = 1;
			 b.Board[x-2][y-2] = 2;
			 eat++;
		}
		if((((b.Board[x-1][y+1] == 3) || (b.Board[x-1][y+1] == 5))&&(b.Board[x-2][y+2]==1))&&(jogada==2)){
			 b.Board[x][y] = 1;
			 b.Board[x-1][y+1] = 1;
			 b.Board[x-2][y+2] = 2;
			 eat++;
		}
		
		//transformar peça normal em dama 
		for(int i=1;i<9;i++){											
			if(b.Board[1][i]==2){
				b.Board[1][i]=4;
			}
			if(b.Board[8][i]==3){
				b.Board[8][i]=5;
			}
		}
	}
		///começa a logica para Dama Branca
		///exibe os movimentos possíveis para a dama branca
	
		if((player == 1)&&(b.Board[x][y]==4)){
			
			if(b.Board[x-1][y-1]==1){
				System.out.println("Digite 1 para se mover para a esquerda cima\n");
			}
			if(b.Board[x-1][y+1]==1){
				System.out.println("Digite 2 para se mover para a direita cima\n");
			}
			if(b.Board[x+1][y-1]==1){
				System.out.println("Digite 3 para se mover para a esquerda baixo\n");
			}
			if(b.Board[x+1][y+1]==1){
				System.out.println("Digite 4 para se mover para a direita baixo\n");
			}
			//EXIBE TELA PARA A DAMA COMER
			if(((b.Board[x-1][y-1]==3)||(b.Board[x-1][y-1]==5))&&(b.Board[x-2][y-2]==1)){
				System.out.println("Digite 1 para comer a peca na Esquerda Superior\n");
			}
			if(((b.Board[x-1][y+1]==3)||(b.Board[x-1][y+1]==5))&&(b.Board[x-2][y+2]==1)){
				System.out.println("Digite 2 para comer a peca na Direita Superior\n");
			}
			if(((b.Board[x+1][y-1]==3)||(b.Board[x+1][y-1]==5))&&(b.Board[x+2][y-2]==1)){
				System.out.println("Digite 3 para comer a peca a Esquerda Inferior\n");
			}
			if(((b.Board[x+1][y+1]==3)||(b.Board[x+1][y+1]==5))&&(b.Board[x+2][y+2]==1)){
				System.out.println("Digite 4 para comer a peca a Direita Inferior\n");
			}
			//FIM DO EXIBE TELA
			
			jogada = input.nextInt();
		
			if((b.Board[x-1][y-1]==1)&& (jogada==1)){
				b.Board[x-1][y-1]=4;
				b.Board[x][y]=1;
			}
			if((b.Board[x-1][y+1]==1)&& (jogada==2)){
				b.Board[x-1][y+1]=4;
				b.Board[x][y]=1;
			}
			if((b.Board[x+1][y-1]==1)&& (jogada==3)){
				b.Board[x+1][y-1]=4;
				b.Board[x][y]=1;
			}
			if((b.Board[x+1][y+1]==1)&& (jogada==4)){
				b.Board[x+1][y+1]=4;
				b.Board[x][y]=1;
			}
			
			//LOGICA PARA A DAMA BRANCA COMER UMA PEÇA
			if((((b.Board[x-1][y-1] == 3)||(b.Board[x-1][y-1] == 5))&&(b.Board[x-2][y-2]==1))&&(jogada==1)){
				b.Board[x][y] = 1;
				b.Board[x-1][y-1] = 1;
				b.Board[x-2][y-2] = 4;
				eat++;
			}
			if((((b.Board[x-1][y+1] == 3)||(b.Board[x-1][y+1] == 5))&&(b.Board[x-2][y+2]==1))&&(jogada==2)){
				b.Board[x][y] = 1;
				b.Board[x-1][y+1] = 1;
				b.Board[x-2][y+2] = 4;
				eat++;
			}
			if((((b.Board[x+1][y-1] == 3)||(b.Board[x+1][y-1] == 5))&&(b.Board[x+2][y-2]==1))&&(jogada==3)){
				b.Board[x][y] = 1;
				b.Board[x+1][y-1] = 1;
				b.Board[x+2][y-2] = 4;
				eat++;
			}
			if((((b.Board[x+1][y+1] == 3)||(b.Board[x+1][y+1] == 5))&&(b.Board[x+2][y+2]==1))&&(jogada==4)){
				b.Board[x][y] = 1;
				b.Board[x+1][y+1] = 1;
				b.Board[x+2][y+2] = 4;
				eat++;
			}
		

			//FIM DA LOGICA PARA COMER A DAMA

		}				
		///termina a logica para Dama
		
	
	
	// second, player 2 (up side)
	
	if((player == 2) && (b.Board[x][y]==3)){
		
		
		if(b.Board[x+1][y-1] == 1){
			System.out.println("Digite 1 para se mover a Esquerda\n");
		}
		if(b.Board[x+1][y+1] == 1){
			System.out.println("Digite 2 para se mover a Direita\n");
		}
		if(((b.Board[x+1][y-1] == 2) || (b.Board[x+1][y-1] == 4))&&(b.Board[x+2][y-2]==1)){
			System.out.println("Digite 1 para comer a peca a Esquerda\n");
		}
		if(((b.Board[x+1][y+1] == 2) || (b.Board[x+1][y+1] == 4))&&(b.Board[x+2][y+2]==1)){
			System.out.println("Digite 2 para comer a peca a Esquerda\n");
		}
		

		 jogada = input.nextInt();
		
		
		if((b.Board[x+1][y-1] == 1)&&(jogada==1)){
			b.Board[x][y] = 1;
			b.Board[x+1][y-1] = 3;
		}
		if((b.Board[x+1][y+1] == 1)&&(jogada==2)){
			b.Board[x][y] = 1;
			b.Board[x+1][y+1] = 3;
		}
		if((((b.Board[x+1][y-1] == 2) || (b.Board[x+1][y-1] == 4))&&(b.Board[x+2][y-2]==1))&&(jogada==1)){
			 b.Board[x][y] = 1;
			 b.Board[x+1][y-1] = 1;
			 b.Board[x+2][y-2] = 3;
			 eat++;
		}
		if((((b.Board[x+1][y+1] == 2) || (b.Board[x+1][y+1] == 4))&&(b.Board[x+2][y+2]==1))&&(jogada==2)){
			 b.Board[x][y] = 1;
			 b.Board[x+1][y+1] = 1;
			 b.Board[x+2][y+2] = 3;
			 eat++;
		}	
	
		for(int i=1;i<8;i++){											
			if(b.Board[1][i]==2){
				b.Board[1][i]=4;
			}
			if(b.Board[8][i]==3){
				b.Board[8][i]=5;
			}
		}
				
	}
	
	///Começa a logica para a Dama preta
	//exibe os movimentos possiveis para a dama preta
	if((player == 2)&&(b.Board[x][y]==5)){
		
		if(b.Board[x-1][y-1]==1){
			System.out.println("Digite 1 para se mover para a esquerda cima\n");
		}
		if(b.Board[x-1][y+1]==1){
			System.out.println("Digite 2 para se mover para a direita cima\n");
		}
		if(b.Board[x+1][y-1]==1){
			System.out.println("Digite 3 para se mover para a esquerda baixo\n");
		}
		if(b.Board[x+1][y+1]==1){
			System.out.println("Digite 4 para se mover para a direita baixo\n");
		}
		
		//EXIBE TELA PARA A DAMA COMER
		if(((b.Board[x-1][y-1]==2)||(b.Board[x-1][y-1]==4))&&(b.Board[x-2][y-2]==1)){
			System.out.println("Digite 1 para comer a peca na Esquerda Superior\n");
		}
		if(((b.Board[x-1][y+1]==2)||(b.Board[x-1][y+1]==4))&&(b.Board[x-2][y+2]==1)){
			System.out.println("Digite 2 para comer a peca na Direita Superior\n");
		}
		if(((b.Board[x+1][y-1]==2)||(b.Board[x+1][y-1]==4))&&(b.Board[x+2][y-2]==1)){
			System.out.println("Digite 3 para comer a peca a Esquerda Inferior\n");
		}
		if(((b.Board[x+1][y+1]==2)||(b.Board[x+1][y+1]==4))&&(b.Board[x+2][y+2]==1)){
			System.out.println("Digite 4 para comer a peca a Direita Inferior\n");
		}
		//FIM DO EXIBE TELA
		
		jogada = input.nextInt();
	
		if((b.Board[x-1][y-1]==1) && (jogada==1)){
			b.Board[x-1][y-1]=5;
			b.Board[x][y]=1;
		}
		if((b.Board[x-1][y+1]==1) && (jogada==2)){
			b.Board[x-1][y+1]=5;
			b.Board[x][y]=1;
		}
		if((b.Board[x+1][y-1]==1) && (jogada==3)){
			b.Board[x+1][y-1]=5;
			b.Board[x][y]=1;
		}
		if((b.Board[x+1][y+1]==1) && (jogada==4)){
			b.Board[x+1][y+1]=5;
			b.Board[x][y]=1;
		}
		
		
		//LOGICA PARA A DAMA PRETA COMER UMA PEÇA
		if((((b.Board[x-1][y-1] == 2)||(b.Board[x-1][y-1] == 4))&&(b.Board[x-2][y-2]==1))&&(jogada==1)){
			b.Board[x][y] = 1;
			b.Board[x-1][y-1] = 1;
			b.Board[x-2][y-2] = 5;
			eat++;
		}
		if((((b.Board[x-1][y+1] == 2)||(b.Board[x-1][y+1] == 4))&&(b.Board[x-2][y+2]==1))&&(jogada==2)){
			b.Board[x][y] = 1;
			b.Board[x-1][y+1] = 1;
			b.Board[x-2][y+2] = 5;
			eat++;
		}
		if((((b.Board[x+1][y-1] == 2)||(b.Board[x+1][y-1] == 4))&&(b.Board[x+2][y-2]==1))&&(jogada==3)){
			b.Board[x][y] = 1;
			b.Board[x+1][y-1] = 1;
			b.Board[x+2][y-2] = 5;
			eat++;
		}
		if((((b.Board[x+1][y+1] == 2)||(b.Board[x+1][y+1] == 4))&&(b.Board[x+2][y+2]==1))&&(jogada==4)){
			b.Board[x][y] = 1;
			b.Board[x+1][y+1] = 1;
			b.Board[x+2][y+2] = 5;
			eat++;
		}
	

		//FIM DA LOGICA PARA COMER A DAMA
		
	}
	///Termina a logica para a dama preta
	
	return  eat;
}
}
