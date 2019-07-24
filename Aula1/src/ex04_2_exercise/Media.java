package ex04_2_exercise;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a 1º nota: ");
		double numero1 = sc.nextDouble();
		
		System.out.println("Digite a 2º nota: ");
		double numero2 = sc.nextDouble();
		
		System.out.println("Digite a 3º nota: ");
		double numero3 = sc.nextDouble();
		
		System.out.println("Digite a 4º nota: ");
		double numero4 = sc.nextDouble();
		
		System.out.println("Digite a 5º nota: ");
		double numero5 = sc.nextDouble();
		
		double media = (numero1 + numero2 + numero3 + numero4 + numero5) / 5;
		
		DecimalFormat formato = new DecimalFormat("#.##");
		double mediaTotal = Double.valueOf(formato.format(media));
		
		System.out.println("Media: " + mediaTotal);
	}

}
