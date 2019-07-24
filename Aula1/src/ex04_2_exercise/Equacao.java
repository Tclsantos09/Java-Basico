package ex04_2_exercise;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Equacao {

	public static void main(String[] args) {
		
		DecimalFormat formato = new DecimalFormat("#.##");
		
		Scanner sc = new Scanner(System.in);
		
		int delta, t1, t2;
		
		double r2, r1;
		
		System.out.println("Digite o valor de A: ");
		int a = sc.nextInt();

		System.out.println("Digite o valor de B: ");
		int b = sc.nextInt();

		System.out.println("Digite o valor de C: ");
		int c = sc.nextInt();
		
		System.out.println("Resolução de Báskara: b²-4*a*c");
		
		System.out.println("Resolução de Báskara: " + b + "²-4*" + a + "*" + c);
		
		t1 = b * b;
		t2 = - 4 * a * c;
		
		System.out.println("Resolução de Báskara: " + t1 +"+"+ t2 );
		
		delta = t1 + t2;
		
		System.out.println("Resolução de Báskara: " + delta);

		if(delta > 0) {
			r1 = ((b * -1) + (Math.sqrt(delta))) / (2 * a);
			r2 = ((b * -1) - (Math.sqrt(delta))) / (2 * a);
			
			double rf1 = Double.valueOf(formato.format(r1));
			double rf2 = Double.valueOf(formato.format(r2));
			
			System.out.println("\nRaiz 1: " + rf1 + "\nRaiz 2: " + rf2);
		} else if (delta == 0) {
			r1 = ((b * -1) + (Math.sqrt(delta))) / (2 * a);
			
			double rf1 = Double.valueOf(formato.format(r1));
			
			System.out.println("\nRaiz 1: " + r1);
		} else {
			System.out.println("\nNão tem raiz.");
		}
	}

}
