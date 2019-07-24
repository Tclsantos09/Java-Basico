package ex04_2_exercise;

import java.text.DecimalFormat;

public class ShoppingCart {

	public static void main(String[] args) {
	
		String custName = "Mary Smith", itemDesc = "Shirt", message = "";
		
		double price = 29.99, tax = 1.04, total;
		
		int quantity = 2;

		message = custName + " quer comprar " + quantity + " unidades do produto " + itemDesc;
		
		total = price * quantity * tax;
		
		DecimalFormat formato = new DecimalFormat("#.##");
		double numero = Double.valueOf(formato.format(total));
		
		System.out.println(message + "\n" + numero);
		
		
		
	}

}
