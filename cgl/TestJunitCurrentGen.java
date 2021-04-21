/**
 * This class is part of the cgl package
 */
package cgl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * This is the test class for CurrentGeneration class
 * 
 * @author Pragya
 *
 * @version 2
 * 
 */

class TestJunitCurrentGen {

	@Test
    public void CurrentOne() {
		String result;
		try {
			int l[][] = {{1,2}};
			Board b = new Board(3, l);
			CurrentGeneration c = new CurrentGeneration(b);
			result = c.toString();
		}
		catch (Exception ex) {
			result = ex.getMessage();
		}
	    System.out.println("======TEST ONE EXECUTED=======");
	    Assertions.assertEquals("...\n..*\n...",result);
	}

	@Test
    public void CurrentTwo() {
		String result;
		try {
			int l[][] = {{1,2}};
			Board b = new Board(3, l);
			CurrentGeneration c = new CurrentGeneration(b);
			result = c.getNeighbours();
		}
		catch (Exception ex) {
			result = ex.getMessage();
		}
	    System.out.println("======TEST TWO EXECUTED=======");
	    Assertions.assertEquals("011\n010\n011",result);
	}
	
	@Test 
    public void CurrentThree() {
		String result;
		try {
			int l[][] = {{2,4},{3,5},{4,3},{4,4},{4,5}};
			Board b = new Board(9, l);
			CurrentGeneration c = new CurrentGeneration(b);
			result = c.toString();
		}
		catch (Exception ex) {
			result = ex.getMessage();
		}
	    System.out.println("======TEST THREE EXECUTED=======");
	    Assertions.assertEquals(".........\n.........\n....*....\n.....*...\n...***...\n.........\n.........\n.........\n.........", result);
	}

}
