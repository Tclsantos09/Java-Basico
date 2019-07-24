package ex04_2_exercise;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner entradaDados = new Scanner(System.in);
		
		double soma, subtracao, divisao, multiplicacao;
		
		System.out.println("Digite o 1º número");
		double numero1 = entradaDados.nextDouble();
		
		System.out.println("Digite o 2º número");
		double numero2 = entradaDados.nextDouble();
		
		soma = numero1 + numero2;
		subtracao = numero1 - numero2;
		multiplicacao = numero1 * numero2;
		divisao = numero1 / numero2;
		
		System.out.println("Soma: " + soma + " \nSubtração: " + subtracao +
				" \nDivisão: " + divisao + " \nMultiplicação: " + multiplicacao);
		
	}

}
