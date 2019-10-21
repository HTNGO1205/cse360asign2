// Hieu Ngo
// ASU ID: 1207756000
// basic calculator for CSE 360 class


import java.lang.Math;

package cse360assign3;

public class calculator extends AddingMachine {

	public calculator() {
		
	}
	
	public void mult(int value) {
		total = total * value;
		print1 = print1 + " * "+value;
	}
		
	public void div (int value) {
		total = total / value;
		print1 = print1 + " / "+value;
		
	}
	public void power (int value) {
		total = (int) Math.pow(total , value);
		print1 = print1 + " ^ " + value;
	}
}
