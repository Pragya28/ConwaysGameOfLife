/**
 * This class is part of the cgl package
 */
package cgl;

/**
 * The CurrentGeneration class uses Board class to create the ongoing generation
 * and counts the number of alive neighbours for each cell
 * 
 * @author Pragya
 * 
 * @version 2
 *
 */
public class CurrentGeneration {
	/**
	 * The attribute b of Board class defines the board for the current generation
	 */
	Board b;
	
	/**
	 * The following is the parameterized constructor of the class which creates the current
	 * generation using Board parameter
	 * 
	 * @param b: The board on which the current generation is created
	 */
	public CurrentGeneration(Board b) {
		this.b = b;
	}
	
	/**
	 * This is a helper method which works with liveCounts method.
	 * This method counts the number of alive neighbours of a particular cell
	 * 
	 * @param row: The row of the cell whose neighbours are to be counted.
	 * @param col: The column of the cell whose neighbours are to be counted.
	 * @return cnt: The number of alive neighbours of a cell.
	 */
	public int countAliveNeighbours(int row, int col){
		int cnt = 0;
		int c1 = col - 1;
		int c2 = col + 1;
		int r1 = row - 1;
		int r2 = row + 1;
		int checks[][] = {{r1, c1}, {r1, col}, {r1, c2}, {row, c1}, {row, c2}, {r2, c1}, {r2, col}, {r2, c2}};
		for (int i = 0; i < 8; i++){
			if ((checks[i][0]>=0 && checks[i][0]<this.b.size) && (checks[i][1]>=0 && checks[i][1]<this.b.size)) 
				if (this.b.board[checks[i][0]][checks[i][1]]){
					cnt++;
				}
		}
		return cnt;
	}

	/**
	 * The method creates a 2-d int array containing the number of alive neighhbours
	 * for each corresponding cell
	 * 
	 * @return count: The 2-d int array having alive neighbour counts.
	 */
	public int[][] liveCounts() {
		int count[][] = new int [this.b.size][this.b.size];
		for (int i = 0; i < this.b.size; i++) {
			for (int j = 0; j < this.b.size; j++) {
				count[i][j] = countAliveNeighbours(i, j);
			}
		}		
		return count;
	}
	
	/**
	 * This is a testing method to convert the output of liveCounts()
	 * into string
	 * 
	 * @return out: The string version of output of liveCounts
	 */
	public String getNeighbours() {
		int count[][] = this.liveCounts();
		String out = "";
		for (int i = 0; i < this.b.size; i++) {
			for (int j = 0; j < this.b.size; j++) {
				out += count[i][j];
			}
			if (i != this.b.size-1) {
				out += "\n";
			}
		}
		return out;
	}
	
	/**
	 * This is toString method to print board
	 * It calls the toString method of Board class
	 */
	public String toString() {
		return this.b.toString();
	}

}
