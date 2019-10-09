package cse360assign2;

public class AddingMachine {

	private int total;
	
	public AddingMachine (){
		System.out.println("Hello world 1");
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		System.out.println("Hello world 2");
		return 0;
	}
	
	public void add (int value) {
		System.out.println("Hello world 3");
		
	}
	
	public void subtract (int value) {
		System.out.println("Hello world 4");
	}
		
	public String toString () {
		System.out.println("Hello world 5");
		return "";
	}

	public void clear() {
		System.out.println("Hello world 6");
	
	}
}
