// Hieu Ngo
// ASU ID: 1207756000
// basic calculator for CSE 360 class


//https://github.com/HTNGO1205/cse360asign2 SAME LINK USED FOR ASSIGNMENT 3 SAME FOLDER BUT DIFFERENT DIRECTORY

package cse360assign3; 
public class AddingMachine {
	protected String print1 = "0 ";
	protected int total;
	
	public AddingMachine (){
		
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		total = total + value;
		print1 = print1 + " + " + value;
	}
	
	public void subtract (int value) {
		total = total - value;
		print1 = print1 +" - "+value;

	}

	public String toString () {

		return print1 + " ";
	}

	public void clear() {
		
		total = 0;
		print1="0";
	
	}
}
