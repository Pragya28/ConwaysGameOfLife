/**
 * This exception class is part of cgl package
 */
package cgl;

/**
 * The InvalidInputException is thrown when given inputs are not valid
 *  
 * @author Pragya
 *
 * @version 2
 */

public class InvalidInputException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public InvalidInputException(String msg) {
		super(msg);
	}

}
