// Hieu Ngo
// ASU ID: 1207756000
// basic calculator for CSE 360 class


package cse360assign3;

public class calculator extends AddingMachine {
	
	public calculator()
	{
		
	}
	
	public void mult(int value) {

		if (value == 0)
		{
			total = 0; 
			print1 = print1 + " * "+value;
		}
		else 
		{
			total = total * value;
			print1 = print1 + " * "+value;
		}
		
	}
		
	public void div (int value) {
		
		if (value == 0)
		{
			total = 0; 
			print1 = print1 + " / "+value;
		}
		else 
		{
			total = total / value;
			print1 = print1 + " / "+value;
		}
	}
	public void power (int value) {
		total = (int) Math.pow(total , value);
		print1 = print1 + " ^ " + value;
	}
	
}
