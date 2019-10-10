package cse360assign2;

public class AddingMachine {

	private int total;
	
	public AddingMachine (){
		
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		
		System.out.print(" = "+total);
		
		return 0;
	}
	
	public void add (int value) {
		
		total= total + value;
		System.out.print(" + "+value);
		total = total;
	}
	
	public void subtract (int value) {
		total = total - value;
		System.out.print(" - "+value);
	}
		
	public String toString () {
		System.out.print("0");
		System.out.print(total);
		System.out.print(add());
		return "";
	}

	public void clear() {
		
		total = 0;
		System.out.println("\nNew Total: "+total);
	
	}
}
