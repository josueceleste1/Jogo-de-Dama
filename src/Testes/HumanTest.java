package Testes;
import static org.junit.Assert.fail;

import org.junit.Test;

import Controller.DamaController;
import Model.Board;
//import Model.Human;

public class HumanTest {
	
	
	@Test
	public void Try() {
		//Human h = new Human(1);
		
	
	}
	@Test
	public void vencedor() {
		int eat=0;
		DamaController d = new DamaController(1, eat);
		Board b = new Board();
		
		//TEST PARA VER O VENCEDOR
		for(int x=1; x<9; x++) {
			for(int y=1; y<9; y++) {
				if(d.setPosition(b, x, y) > 12){
					fail("Nao havera vencedor");
				}
				
			}
		}
	}
	
	
	

}
