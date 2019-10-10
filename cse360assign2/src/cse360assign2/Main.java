// Hieu Ngo
// ASU ID: 1207756000
// basic calculator for CSE 360 class


//https://github.com/HTNGO1205/cse360asign2


package cse360assign2;

public class Main {

	public static void main(String[] args) {
		
		AddingMachine cal = new AddingMachine();
		
		cal.add(4);
		cal.subtract(2);
		cal.add(5);
		cal.getTotal();
		System.out.print(cal.toString());
		System.out.print("= "+cal.getTotal()+"\n");

		
		cal.clear();
		cal.add(5);
		cal.subtract(2);
		cal.add(3);
		System.out.print(cal.toString());
		System.out.print("= "+cal.getTotal()+"\n");

		
		
	}

}
