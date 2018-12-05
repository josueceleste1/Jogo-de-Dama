package Model;


public abstract class Player {
	
	protected int[] attempt = new int[2]; 
	protected int player;
	protected int eat = 0; // vai contar as peças comidas para dizer quem venceu
	
	public Player(int player) {
		this.player = player; 
	}
	 public abstract void Play(Board board);
	    
	 public abstract void Try(Board board);
	 
	public int Winner() {
		return eat;
	}
	
}
