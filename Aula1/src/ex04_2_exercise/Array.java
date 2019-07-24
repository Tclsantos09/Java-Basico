package ex04_2_exercise;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String [] nomes = new String[5];
		double[] notas = new double[5];
		
		System.out.println("Digite o nome do aluno 1: ");
		nomes[0] = sc.nextLine();
		System.out.println("Digite o nome do aluno 2: ");
		nomes[1] = sc.nextLine();
		System.out.println("Digite o nome do aluno 3: ");
		nomes[2] = sc.nextLine();
		System.out.println("Digite o nome do aluno 4: ");
		nomes[3] = sc.nextLine();
		System.out.println("Digite o nome do aluno 5: ");
		nomes[4] = sc.nextLine();
		
		System.out.println("Digite a nota do aluno 1: ");
		notas[0] = sc.nextDouble();
		System.out.println("Digite a nota do aluno 2: ");
		notas[1] = sc.nextDouble();
		System.out.println("Digite a nota do aluno 3: ");
		notas[2] = sc.nextDouble();
		System.out.println("Digite a nota do aluno 4: ");
		notas[3] = sc.nextDouble();
		System.out.println("Digite a nota do aluno 5: ");
		notas[4] = sc.nextDouble();
		
		System.out.println("Aluno 1 " + nomes[0] + " tirou a nota " + notas[0] +
				"\nAluno 2 " + nomes[1] + " tirou a nota " + notas[1] +
				"\nAluno 3 " + nomes[2] + " tirou a nota " + notas[2] +
				"\nAluno 4 " + nomes[3] + " tirou a nota " + notas[3] +
				"\nAluno 5 " + nomes[4] + " tirou a nota " + notas[4]);
	}
}
