package Model;


public class Board {
	private static final int jogador1 = 2;//vai marcar no tabuleiros com as posicoes validas para o jogador 1
	private static final int jogador2 = 3;//posicoes validas para o jogador 2

	
	public int[][] Board= new int[10][10];
	
    public Board(){
        ResetBoard();
    }
    
    public void ResetBoard(){
    	int i, j;
    	
    	for(i=1;i<9;i++){
    		for (j=1;j<9;j++){
    			if (((i%2==0)&&(j%2==0)) || ((i%2==1) && j%2==1)){
    				Board[i][j] = 0;
    			}else{
    				Board[i][j] = 1;
    			}
    		}
    	}
    	
    	for (i=1;i<4;i++){
    		for (j=1;j<9;j++){
    			if (((i%2==0) && (j%2==1)) || ((i%2==1)&&(j%2==0))){
    				Board[i][j] = jogador2;
    			}
    		}
    	}
    	
    	for (i=8;i>5;i--){
    		for (j=1;j<9;j++){
    			if (((i%2==0) && (j%2==1)) || ((i%2==1)&&(j%2==0))){
    				Board[i][j] = jogador1;
    			}
    		}
    	}
    	
 
    }
    

    

    
   

}
