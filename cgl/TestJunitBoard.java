/**
 * This class is part of the cgl package
 */
package cgl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * This is the test class for Board class
 * 
 * @author Pragya
 *
 * @version 2
 * 
 */

class TestJunitBoard {

	@Test
    public void BoardOne() {
		String result;
		try {
			int live[][] = {{1,2}}; 
			Board b = new Board(3,live);	
			result = b.toString();
		}
		catch (Exception ex) {
			result = ex.getMessage();
		}
	    System.out.println("======TEST ONE EXECUTED=======");
	    Assertions.assertEquals("...\n..*\n...",result);
	}

	@Test
    public void BoardTwo() {
		String result;
		try {
			int live[][] = {{1,2}}; 
			Board b = new Board(-3,live);
			result = b.toString();
		}
		catch (Exception ex) {
			result = ex.getMessage();
		}
	    System.out.println("======TEST TWO EXECUTED=======");
	    Assertions.assertEquals("Invalid size of the board.",result);
	}
	
	@Test
    public void BoardThree() {
		String result;
		try {
			int live[][] = {{5,-2}}; 
			Board b = new Board(3,live);
			result = b.toString();
		}
		catch (Exception ex) {
			result = ex.getMessage();
		}
	    System.out.println("======TEST THREE EXECUTED=======");
	    Assertions.assertEquals("Invalid location of live cells.",result);
	}

	@Test
    public void BoardFour() {
		String result;
		try {
			int live[][] = {{-1,3}}; 
			Board b = new Board(3,live);
			result = b.toString();
		}
		catch (Exception ex) {
			result = ex.getMessage();
		}
	    System.out.println("======TEST FOUR EXECUTED=======");
	    Assertions.assertEquals("Invalid location of live cells.",result);
	}

}
