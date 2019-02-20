/**
 * @author Lauren Gold
 * @version %I%
 *  class id: 383
 *  Assignment2
 *  Description:   
 */

package cse360assign2;

//the <Calculator> class does many different calculations
public class Calculator {

	private int total;
	
	//the Calculator method is the constructor for this class
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	// the getTotal method returns the total for this calculation
	public int getTotal () {
		return total;
	}
	
	// the add method adds integers @param value to be tested
	public void add (int value) {
		total += value;
	}
	
	// the subtract method subtracts integers @param value to be tested
	public void subtract (int value) {
		total -= value;
	}
	
	//the multiply method multiplies integers @param value to be tested
	public void multiply (int value) {
		total = total * value;
	}
	
	//the divide method divides integers @value to be tested
	public void divide (int value) {
		if (value == 0) {
			total = 0;
		}
		else {
			total = total / value;
		}
		
	}
	
	/*
	 * the getHistory method returns a string @return value to display this calculator's history
	 */
	public String getHistory () {
		return "";
	}
}
