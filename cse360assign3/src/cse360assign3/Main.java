// Hieu Ngo
// ASU ID: 1207756000
// basic calculator for CSE 360 class


//https://github.com/HTNGO1205/cse360asign2


package cse360assign3;

public class Main {

	public static void main(String[] args) {
		
		calculator cal = new calculator();
		
		// ADDITION
		cal.add(4);
		cal.subtract(2);
		cal.add(5);
		cal.getTotal();
		System.out.print(cal.toString());
		System.out.print("= "+cal.getTotal()+"\n");
		// SUBTRACTION
		cal.clear();
		cal.add(5);
		cal.subtract(2);
		cal.add(3);
		System.out.print(cal.toString());
		System.out.print("= "+cal.getTotal()+"\n");
		// MULTIPLICATION
		cal.clear();
		cal.add(1);
		cal.mult(4);
		cal.mult(5);
		cal.getTotal();
		System.out.print(cal.toString());
		System.out.print("= "+cal.getTotal()+"\n");
		// MULTIPLICATION negative
		cal.clear();
		cal.add(1);
		cal.mult(4);
		cal.mult(-5);
		cal.getTotal();
		System.out.print(cal.toString());
		System.out.print("= "+cal.getTotal()+"\n");
		// DIVISION
		cal.clear();
		cal.add(100);
		cal.div(25);
		cal.div(2);
		System.out.print(cal.toString());
		System.out.print("= "+cal.getTotal()+"\n");
		// DIVISION negative
		cal.clear();
		cal.add(100);
		cal.div(25);
		cal.div(-2);
		System.out.print(cal.toString());
		System.out.print("= "+cal.getTotal()+"\n");
		// POWER 
		cal.clear();
		cal.add(5);
		cal.power(5);
		System.out.print(cal.toString());
		System.out.print("= "+cal.getTotal()+"\n");
		
	}

}
