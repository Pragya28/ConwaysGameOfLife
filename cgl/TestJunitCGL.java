/**
 * This class is part of the cgl package
 */
package cgl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * This is the test class for ConwaysGameofLife class
 * 
 * @author Pragya
 * 
 * @version 2
 *
 */
public class TestJunitCGL {
	
	@Test
	public void CGLOne() {
		int l[][] = {{0,0},{0,1},{0,2},{0,3},{0,4},{1,0},{1,1},{1,2},{1,3},{1,4},
				{2,0},{2,1},{2,2},{2,3},{2,4},{3,0},{3,1},{3,2},{3,3},{3,4}};
		ConwaysGameofLife cgl = new ConwaysGameofLife(5,l,5);
	    System.out.println("======TEST ONE EXECUTED=======");
	    Assertions.assertEquals(".....\n.....\n..*..\n..*..\n.....", cgl.toString());
		
	}
	
	@Test
	public void CGLTwo() {
		int l[][] = {{0,0},{0,1},{0,2},{0,3},{0,4},{1,0},{1,1},{1,2},{1,3},{1,4},
				{2,0},{2,1},{2,2},{2,3},{2,4},{3,0},{3,1},{3,2},{3,3},{3,4}};
		ConwaysGameofLife cgl = new ConwaysGameofLife(5,l,10);
	    System.out.println("======TEST TWO EXECUTED=======");
	    Assertions.assertEquals("All cells died in generation 6.", cgl.toString());
		
	}

	@Test
	public void CGLThree() {
		int l[][] = {{2,4},{3,5},{4,3},{4,4},{4,5}};
		ConwaysGameofLife cgl = new ConwaysGameofLife(9,l);
	    System.out.println("======TEST THREE EXECUTED=======");
	    Assertions.assertEquals("Generation 17 and 18 are same.", cgl.toString());		
	}
	
	@Test
    public void CGLFour() {
		int l[][] = {{1,2}};
		ConwaysGameofLife cgl = new ConwaysGameofLife(-3,l);
	    System.out.println("======TEST FOUR EXECUTED=======");
	    Assertions.assertEquals("Invalid size of the board.", cgl.toString());
	}

	@Test
    public void CGLFive() {
		int l[][] = {{1,3},{-1,1},{3,-2}};
		ConwaysGameofLife cgl = new ConwaysGameofLife(3,l);
	    System.out.println("======TEST FIVE EXECUTED=======");
	    Assertions.assertEquals("Invalid location of live cells.", cgl.toString());
	}

}
