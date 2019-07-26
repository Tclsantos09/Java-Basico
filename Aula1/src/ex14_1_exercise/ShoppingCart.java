package ex14_1_exercise;

public class ShoppingCart {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int addResult = calc.add(43, 79);
		System.out.println("Add Result: " + addResult);
		
		try {
			double divResult = calc.divide(15, 0);
			System.out.println("Division result: " + divResult);
		} catch(ArithmeticException ae) {
			System.out.println(ae);
		}
		System.out.println("Fim do programa");

	}

}
