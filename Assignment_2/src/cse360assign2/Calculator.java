/**
 * @author Lauren Gold
 * @version %I%
 *  class id: 383
 *  Assignment2
 *  Description: Assignment 2 is a program that creates a simple calculator. It does integer 
 *  addition, subtraction, division, and multiplication.   
 */

package cse360assign2;

/*
 * the Calculator class does many different calculations 
 */
public class Calculator {

	private int total;
	private String operator;
	private int input;
	private int counter;
	
	/*
	 * the Calculator method is the constructor for this class
	 */
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
		counter = 0;
	}
	
	/* the getTotal method returns the total for this calculation
	 * @return - the total value
	 */
	public int getTotal () {
		return total;
	}
	
	/* 
	 * the add method adds integers @param value to be tested
	 */
	public void add (int value) {
		operator = "+";
		input = value;
		total += value;
	}
	
	/*
	 *  the subtract method subtracts integers @param value to be tested
	 */
	public void subtract (int value) {
		operator = "-";
		input = value;
		total -= value;
	}
	
	/*
	 * the multiply method multiplies integers @param value to be tested
	 */
	public void multiply (int value) {
		operator = "*";
		input = value;
		total = total * value;
	}
	
	/*
	 * the divide method uses integer division to divide integers by @param value to be tested
	 */
	public void divide (int value) {
		operator = "/";
		input = value;
		if (value == 0) {
			total = 0;
		}
		else {
			total = total / value;
		}
		
	}
	
	/*
	 * the getHistory method returns a string containing all of the operations that happened, 
	 * starting from the initial zero
	 */
	public String getHistory () { 
		counter++;
		if (counter <= 1) {
			return "0" + " " + operator + " " + input;	
		}
		else {
			return " " + operator + " " + input;	
		}
		
	}
	
	public static void main(String[] args) {
		Calculator myCalculator = new Calculator ();

		myCalculator.subtract(2);
		System.out.print(myCalculator.getHistory());
		
		myCalculator.add(7);
		System.out.print(myCalculator.getHistory());
		
		myCalculator.multiply(3);
		System.out.print(myCalculator.getHistory());
		
		myCalculator.divide(3/9);
		System.out.print(myCalculator.getHistory());
		
		System.out.println(" ");
		System.out.print("total = "+myCalculator.getTotal());
		
	}
}



