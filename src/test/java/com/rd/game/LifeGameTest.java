package com.rd.game;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class LifeGameTest  {
	
	private LifeGame lifeGame = new LifeGame();
	
	@Test
    void testGridWithFiveRowsColumns() {
		
		int[][] input = { 	{ 0, 0, 0, 0, 0 },
							        { 0, 1, 0, 1, 1 },
							        { 0, 0, 1, 0, 1 },
							        { 0, 1, 1, 0, 0 },
							        { 0, 0, 0, 1, 0 },
							     };
		
		int[][]nextStateGrid =  lifeGame.nextState(input, 5, 5);
		assertFalse(Arrays.equals(input, nextStateGrid));
    }
	
	@Test
    void testGridWithNextHundredStates() {

	    int[][] input = { 	{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
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
		
	    int[][]nextStateGrid = lifeGame.nextState(input, 10, 10);
		assertFalse(Arrays.equals(input, nextStateGrid));

    }
	
	@Test
    void testGridWithEdgeCaseScenarios() {
		
		int[][] input = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
		int[][]nextStateGrid = lifeGame.nextState(input, 3, 3);
		assertFalse(Arrays.equals(input, nextStateGrid));
	}
	
	// scenario 1  -- input: [[1,1]]
		@Test
	    void testGridWithEdgeScenarios1() {
		    int[][] input = { 	{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
								        { 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
								        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
								        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
								        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
								        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
								        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
								        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
								        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
								        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
								    };
			
		    int[][]nextStateGrid = lifeGame.nextState(input, 10, 10);
			assertFalse(Arrays.equals(input, nextStateGrid));
	    }
	
	// scenario 2  -- input: [[5,5], [6,5],[7,5],[5,6],[6,6],[7,6]]
	
	@Test
    void testGridWithEdgeScenarios2() {
		                        
	    int[][] input = { 	{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
							        { 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
							        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
							        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
							        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
							        { 0, 0, 0, 0, 0, 1, 1, 0, 0, 0 },
							        { 0, 0, 0, 0, 0, 1, 1, 0, 0, 0 },
							        { 0, 0, 0, 0, 0, 1, 1, 0, 0, 0 },
							        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
							        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
							    };
	    
	    int[][]nextStateGrid = lifeGame.nextState(input, 10, 10);
		assertFalse(Arrays.equals(input, nextStateGrid));
	}
}