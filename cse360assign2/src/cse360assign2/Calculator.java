// Author: Markus Valvur
// Class ID: 574
// Description: Calculator class for assignment 2

package cse360assign2;

public class Calculator {
	
	private int total;
	private String history;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		total += value;
		history += " + " + value;
	}
	
	public void subtract (int value) {
		total -= value;
		history += " - " + value;
	}
	
	public void multiply (int value) {
		total *= value;
		history += " * " + value;
	}
	
	public void divide (int value) {
		if (value == 0) total = 0;
		else {
			total = total/value;
		}
		history += " / " + value;
	}
	
	public String getHistory () {
		return history;
	}
}
