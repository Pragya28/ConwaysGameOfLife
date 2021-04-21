/**
 * This class is part of the cgl package
 */
package cgl;

/**
 * The Board class provide the basic structure on which 
 * the Conway's Game of Life is created.
 *  
 * @author Pragya
 *
 * @version 2
 *  
 */
public class Board {
	/**
	 * The attribute size of the class indicates the dimensions of the square board
	 */
	int size;
	/**
	 * The attribute liveCells of the class is a 2-d array containing the positions of the
	 * live cells on the board
	 */
	int liveCells[][] = null;
	/**
	 * The attribute board of the class is a 2-d boolean array which forms the structure of
	 * the board.
	 */
	boolean board[][];
	
	/**
	 * The following is the parameterized constructor of the class which creates a size*size
	 * boolean array for the board and sets live cells as true and others as false
	 * 
	 * @param size: The dimension of the board
	 * @param cells: The array of locations of live cells on the board
	 * @throws InvalidInputException: when size is negative or cells location is outside 
	 * the bounds of the board
	 * 
	 */
	public Board(int size, int cells[][]) throws InvalidInputException{
		this.size = size;
		this.liveCells = cells;
		if (this.size < 0) {
			throw new InvalidInputException("Invalid size of the board.");
		}
		this.board = new boolean[this.size][this.size];
		for (int coordinate[]:this.liveCells) {
			if (coordinate[0] < 0 || coordinate[0] >= this.size || coordinate[1] < 0 || coordinate[1] >= this.size) {
				throw new InvalidInputException("Invalid location of live cells.");
			}
			this.board[coordinate[0]][coordinate[1]] = true;
		}				
	}
	
	/**
	 * This is toString method to print board
	 * It prints * for alive and . for dead cells
	 */
	@Override
	public String toString() {
		String out = "";
		for (int i = 0; i<this.size; i++) {
			for (int j = 0; j<this.size; j++) {
				if (this.board[i][j]) {
					out += "*";
				}
				else {
					out += ".";
				}
			}
			if (i != size-1) {
				out += "\n";
			}
		}
		return out;		
	}	
}
