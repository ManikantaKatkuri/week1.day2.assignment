package week1.day2.assignment;

public class MyCalculator {

	public static void main(String[] args) {
	Calculator cal = new Calculator();
	System.out.println("Addition of 3 Numbers "+cal.add(10, 20, 30));
	System.out.println("Subtraction of 2 Numbers "+cal.sub(10,20));
	System.out.println("Multiplication of 2 Numbers "+cal.mul(15,4));
	System.out.println("Division of 2 Numbers "+cal.divide(60,2));
	} 

}
