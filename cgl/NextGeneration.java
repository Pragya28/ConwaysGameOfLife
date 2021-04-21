/**
 * This class is part of the cgl package
 */
package cgl;

import java.util.ArrayList;

/**
 * The NextGeneration class uses CurrentGeneration class to generate the next generation
 * according to the rules of Conway's Game of Life
 * 
 * @author Pragya
 * 
 * @version 2
 *
 */

public class NextGeneration {
	/**
	 * The attribute c of CurrentGeneration class defines the generation for which
	 * we have to generate next generation
	 */
	CurrentGeneration c;
	
	int generationCount = 0;
	
	/**
	 * The following is the parameterized constructor of the class which creates the next
	 * generation based on current generation
	 * 
	 * @param c: The current generation on which next generation is based
	 */
	public NextGeneration(CurrentGeneration c) {
		this.c = c;
	}

	/**
	 * The following method creates the next generation of cgl based on its rules
	 * 
	 * @throws AllDeadException: When all cells of given current generation are dead
	 * @throws InvalidInputException: When parameters for board constructor are invalid
	 *  
	 */
	public void generateCells() throws AllDeadException, InvalidInputException{
		int neighbours[][] = this.c.liveCounts();
		int sum = 0;
		ArrayList <int[]> coordinates = new ArrayList<>();
		for (int i = 0; i<neighbours.length; i++) {
			for (int j = 0; j<neighbours.length; j++) {
				sum += neighbours[i][j];
				if ((neighbours[i][j]==3) || ((neighbours[i][j]==2) && (this.c.b.board[i][j]))) {
					int c[] = {i,j};
					coordinates.add(c);					
				}
			}
		}
		if (sum == 0) {
			throw new AllDeadException("All cells died in generation " + generationCount +".");
		}
		int aliveCells[][] = new int[coordinates.size()][2];
		int k = 0;
		for (int[] c: coordinates) {
			aliveCells[k][0] = c[0];
			aliveCells[k++][1] = c[1];
		}
		Board b = new Board(this.c.b.size,aliveCells);
		boolean match = true;
		for (int i = 0; i<this.c.b.size; i++) {
			for (int j = 0; j<this.c.b.size; j++) {
				if (this.c.b.board[i][j] == b.board[i][j]) {
					continue;
				}
				else {
					match = false;
				}
			}
		}
		this.c.b = b;
		generationCount++;
		if (match) {
			throw new AllDeadException("Generation "+(generationCount-1)+" and "+generationCount+" are same.");
		}
	}
	
	/**
	 * The following method generates nth generation by calling generateCells() method n times
	 * 
	 * @param n: The generation to be produced
	 * @throws AllDeadException: When all cells in previous generation are dead
	 * @throws InvalidInputException: When parameters of board constructor are invalid
	 * 
	 */
	public void futureGeneration(int n) throws AllDeadException, InvalidInputException {
		for (int i = 0; i<n; i++) {
			this.generateCells();
		}		
	}
	
	/**
	 * The following method generates infiniteth generation by calling generateCells() method till all cells are dead or
	 * two consecutive generations are same
	 * 
	 * @throws AllDeadException
	 * @throws InvalidInputException
	 */
	public void futureGeneration() throws AllDeadException, InvalidInputException {
		while (true) {
			this.generateCells();
		}
	}

	/**
	 * This is toString method to print board
	 * It calls the toString method of Board class
	 */
	public String toString() {
		return this.c.b.toString();
	}

}
