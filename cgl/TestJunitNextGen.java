/**
 * This class is part of the cgl package
 */
package cgl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * This is the test class for NextGeneration class
 * 
 * @author Pragya
 *
 * @version 2
 * 
 */

class TestJunitNextGen {

	@Test
    public void NextOne() {
		String result;
		try {
			int l[][] = {{1,2}};
			Board b = new Board(3, l);
			CurrentGeneration c = new CurrentGeneration(b);
			NextGeneration n = new NextGeneration(c);
			n.generateCells();
			result = n.toString();
		}
		catch (Exception ex) {
			result = ex.getMessage();
		}
	    System.out.println("======TEST ONE EXECUTED=======");
	    Assertions.assertEquals("...\n...\n...", result);
	}

	@Test
    public void NextTwo() {
		String result;
		try {
			int l[][] = {{1,2},{2,2},{3,4}};
			Board b = new Board(5, l);
			CurrentGeneration c = new CurrentGeneration(b);
			NextGeneration n = new NextGeneration(c);
			n.generateCells();
			result = n.toString();
		}
		catch (Exception ex) {
			result = ex.getMessage();
		}
	    System.out.println("======TEST TWO EXECUTED=======");
	    Assertions.assertEquals(".....\n.....\n...*.\n.....\n.....", result);
	}

	@Test 
    public void NextThree() {
		String result;
		try {
			int l[][] = {};
			Board b = new Board(5, l);
			CurrentGeneration c = new CurrentGeneration(b);
			NextGeneration n = new NextGeneration(c);
			n.generateCells();
			result = n.toString();
		}
		catch (Exception ex) {
			result = ex.getMessage();
		}
	    System.out.println("======TEST THREE EXECUTED=======");
	    Assertions.assertEquals("All cells died in generation 0.", result);
	}

	@Test 
    public void NextFour() {
		String result;
		try {
			int l[][] = {{0,0},{0,1},{0,2},{0,3},{0,4},{1,0},{1,1},{1,2},{1,3},{1,4},
					{2,0},{2,1},{2,2},{2,3},{2,4},{3,0},{3,1},{3,2},{3,3},{3,4}};
			Board b = new Board(5, l);
			CurrentGeneration c = new CurrentGeneration(b);
			NextGeneration n = new NextGeneration(c);
			n.generateCells();
			result = n.toString();
		    result = n.toString();
		}
		catch (Exception ex) {
			result = ex.getMessage();
		}
	    System.out.println("======TEST FOUR EXECUTED=======");
	    Assertions.assertEquals("*...*\n.....\n.....\n*...*\n.***.", result);
	}

	@Test 
    public void NextFive() {
		String result;
		try {
			int l[][] = {{0,0},{0,1},{0,2},{0,3},{0,4},{1,0},{1,1},{1,2},{1,3},{1,4},
					{2,0},{2,1},{2,2},{2,3},{2,4},{3,0},{3,1},{3,2},{3,3},{3,4}};
			Board b = new Board(5, l);
			CurrentGeneration c = new CurrentGeneration(b);
			NextGeneration n = new NextGeneration(c);
			n.futureGeneration(10);
			result = n.toString();
		}
		catch (Exception ex) {
			result = ex.getMessage();
		}
	    System.out.println("======TEST FIVE EXECUTED=======");
	    Assertions.assertEquals("All cells died in generation 6.", result);
	}
	
	@Test 
    public void NextSix() {
		String result;
		try {
			int l[][] = {{0,0},{0,1},{0,2},{0,3},{0,4},{1,0},{1,1},{1,2},{1,3},{1,4},
					{2,0},{2,1},{2,2},{2,3},{2,4},{3,0},{3,1},{3,2},{3,3},{3,4}};
			Board b = new Board(5, l);
			CurrentGeneration c = new CurrentGeneration(b);
			NextGeneration n = new NextGeneration(c);
			n.futureGeneration(3);
			result = n.toString();
		}
		catch (Exception ex) {
			result = ex.getMessage();
		}
	    System.out.println("======TEST SIX EXECUTED=======");
	    Assertions.assertEquals(".....\n.....\n..*..\n.*.*.\n.*.*.", result);
	}

	@Test 
    public void NextSeven() {
		String result;
		try {
			int l[][] = {{0,0},{0,1},{0,2},{0,3},{0,4},{1,0},{1,1},{1,2},{1,3},{1,4},
					{2,0},{2,1},{2,2},{2,3},{2,4},{3,0},{3,1},{3,2},{3,3},{3,4}};
			Board b = new Board(5, l);
			CurrentGeneration c = new CurrentGeneration(b);
			NextGeneration n = new NextGeneration(c);
			n.futureGeneration();
			result = n.toString();
		}
		catch (Exception ex) {
			result = ex.getMessage();
		}
	    System.out.println("======TEST SEVEN EXECUTED=======");
	    Assertions.assertEquals("All cells died in generation 6.", result);
	}

	@Test 
    public void NextEight() {
		String result;
		try {
			int l[][] = {{2,4},{3,5},{4,3},{4,4},{4,5}};
			Board b = new Board(9, l);
			CurrentGeneration c = new CurrentGeneration(b);
			NextGeneration n = new NextGeneration(c);
			n.futureGeneration();
			result = n.toString();
		}
		catch (Exception ex) {
			result = ex.getMessage();
		}
	    System.out.println("======TEST EIGHT EXECUTED=======");
	    Assertions.assertEquals("Generation 17 and 18 are same.", result);
	}
}
