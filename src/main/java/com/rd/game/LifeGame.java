package com.rd.game;

public class LifeGame {

	public int[][] nextState(int[][] table, int rows, int columns) {

		int[][] nextStateGrid = new int[rows][columns];

		System.out.println("***************  PREVIOUS GRID FINISHED  ***************");
		printGrid(table, rows, columns);
		System.out.println("***************  PREVIOUS GRID FINISHED  ***************");

		for (int i = 0; i <= rows -2; i++) {
			for (int x = 0; x <= columns - 2; x++) {

				int liveCount = 0;
				int deadCount = 0;

				// calculate one row above cell
				if (i > 0 ) { 
					if( x > 0) { 
						if (table[i - 1][x - 1] == STATES.DEAD.getStatus()) {
							++deadCount;
						} else {
							++liveCount;
						}
					}

					if (table[i - 1][x] == STATES.DEAD.getStatus()) {
						++deadCount;
					} else {
						++liveCount;
					}

					if (x < (columns - 1)) {
						if (table[i - 1][x + 1] == STATES.DEAD.getStatus()) {
							++deadCount;
						} else {
							++liveCount;
						}
					}
				}

				// calculate - row where cell belongs
				if (x > 0) {
					if (table[i][x - 1] == STATES.DEAD.getStatus()) {
						++deadCount;
					} else {
						++liveCount;
					}
				}

				if (x < (columns - 1)) { 
					if (table[i][x + 1] == STATES.DEAD.getStatus()) {
						++deadCount;
					} else {
						++liveCount;
					}
				}

				// calculate - one row below cell
				if (i < (rows - 1)) {
					if (x > 0) { 
						if (table[i + 1][x - 1] == STATES.DEAD.getStatus()) {
							++deadCount;
						} else {
							++liveCount;
						}
					}

					if (table[i + 1][x] == STATES.DEAD.getStatus()) {
						++deadCount;
					} else {
						++liveCount;
					}

					if (x < (columns - 1)) {
						if (table[i + 1][x + 1] == STATES.DEAD.getStatus()) {
							++deadCount;
						} else {
							++liveCount;
						}
					}
				}

				 System.out.println("Dead cells : " + deadCount + "***** Alive Cells : " +  liveCount);

				if (liveCount < 2 || liveCount > 3) {
					nextStateGrid[i][x] = STATES.DEAD.getStatus();
				} else if (liveCount == 2 || liveCount == 3) {
					nextStateGrid[i][x] = STATES.ALIVE.getStatus();
				}
			}

		}

		System.out.println("***************  NEXT STATES START  *************** ");
		printGrid(nextStateGrid, rows, columns);
		System.out.println("***************  NEXT STATES FINISH  *************** ");

		return nextStateGrid;
	}

	private void printGrid(int[][] table, int rows, int columns) {
		for (int i = 0; i <= rows - 1; i++) {
			for (int j = 0; j <= columns - 1; j++) {
				System.out.print(" " + table[i][j]);
			}
			System.out.println(" ");
		}
	}
}

enum STATES {
	DEAD(0), ALIVE(1);

	private int status;

	STATES(int status) {
		this.status = status;
	}

	public int getStatus() {
		return status;
	}
}