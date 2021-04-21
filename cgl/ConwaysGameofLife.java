/**
 * This class is part of the cgl package
 */
package cgl;

/**
 * The ConwaysGameofLife class calls all other class and generates the required output
 * (nth generation or last possible generation)
 * 
 * @author Pragya
 * 
 * @version 2
 *
 */
public class ConwaysGameofLife {
	/**
	 * The attribute size of the class indicates the dimensions of the square board
	 */
	int size;
	/**
	 * The attribute liveCells of the class is a 2-d array containing the positions of the
	 * live cells on the board
	 */
	int liveCells[][];
	/**
	 * The attribute generation of the class indicates which generation to be produced in the result
	 */
	int generations;
	/**
	 * The attribute result stores the output as a string
	 */
	String result;
	
	/**
	 * The following is the parameterized constructor which takes dimensions of square board, 
	 * location of live cells and the generation to be produced as input and generates nth generation
	 * 
	 * @param size
	 * @param liveCells
	 * @param gen
	 * @throws InvalidInputException
	 * @throws AllDeadException
	 */
	public ConwaysGameofLife(int size, int liveCells[][], int gen){
		this.size = size;
		this.liveCells = liveCells;
		this.generations = gen;
		
		try {
			Board b = new Board(this.size, this.liveCells);
			CurrentGeneration c = new CurrentGeneration(b);
			NextGeneration n = new NextGeneration(c);
			n.futureGeneration(gen);				
			result = n.toString();
		}
		catch (Exception ex) {
			result = ex.getMessage();
		}

	}

	/**
	 * The following is the parameterized constructor which takes dimensions of square board and 
	 * location of live cells and gives the number of last generation
	 * 
	 * @param size
	 * @param liveCells
	 * @throws InvalidInputException
	 * @throws AllDeadException
	 */
	public ConwaysGameofLife(int size, int[][] liveCells){
		this.size = size;
		this.liveCells = liveCells;
		
		try {
			Board b = new Board(this.size, this.liveCells);
			CurrentGeneration c = new CurrentGeneration(b);
			NextGeneration n = new NextGeneration(c);
			n.futureGeneration();				
			result = n.toString();
		}
		catch (Exception ex) {
			result = ex.getMessage();
		}
	}
	
	/**
	 * This is toString method to print game
	 * It calls the toString method of NextGeneration class
	 */
	public String toString() {
		return this.result;
				
	}

}
