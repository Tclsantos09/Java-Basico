package ex04_2_exercise;

import java.util.Scanner;

public class ArrayForEach {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String [] nomes = new String[5];
		double[] notas = new double[5];
		int x = 0;
		
		for (int i = 0 ; i < nomes.length; i++) {
			System.out.println("Digite o nome do aluno " + (i+1) + ": ");
			nomes[i] = sc.next();
			System.out.println("Digite a nota do aluno " + (i+1) + ": ");
			notas[i] = sc.nextDouble();
		}
		
		for(String nome: nomes) {
			System.out.println("Aluno " + nome + " tirou a nota " + notas[x]);
			x++;
		}

	}

}
