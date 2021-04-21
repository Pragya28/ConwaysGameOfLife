/**
 * This exception class is part of cgl package
 */
package cgl;

/**
 * The AllDeadException is thrown when next generation is not possible
 *  
 * @author Pragya
 *
 * @version 2
 */

public class AllDeadException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public AllDeadException(String msg) {
		super(msg);
	}

}
