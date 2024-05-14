import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LifeGameTest  {
	
	private LifeGame lifeGame = new LifeGame();
	
	@Test
    void testGridWithFiveRowsColumns() {
		
		int rows = 5;
		int columns = 5;		
		int[][] table = { 	{ 0, 0, 0, 0, 0 },
							        { 0, 1, 0, 1, 1 },
							        { 0, 0, 1, 0, 1 },
							        { 0, 1, 1, 0, 0 },
							        { 0, 0, 0, 1, 0 },
							     };
		
		int[][]nextStateGrid =  lifeGame.nextState(table, rows, columns);
    }
	
	@Test
    void testGridWithNextHundredStates() {
		
		int rows = 10;
		int columns = 10;
		
	    int[][] table = { 	{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
							        { 0, 0, 0, 1, 1, 0, 0, 0, 0, 0 },
							        { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
							        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
							        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
							        { 0, 0, 0, 1, 1, 0, 0, 0, 0, 0 },
							        { 0, 0, 1, 1, 0, 0, 0, 0, 0, 0 },
							        { 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 },
							        { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
							        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
							    };
		
	    int[][]nextStateGrid = lifeGame.nextState(table, rows, columns);
	    
    }
	
	@Test
    void testGridWithEdgeCaseScenarios() {
		
		int rows = 3;
		int columns = 3;
		
		int[][] table = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
		int[][]nextStateGrid = lifeGame.nextState(table, rows, columns);
		
	}
}