package exercicios0312;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// Variaveis
		int numA;
		int numB;
		int numC;
		
		// Leia
		Scanner leia = new Scanner(System.in);
		
		// Entrada de dados
		System.out.println("Digite o numero A: ");
		numA = leia.nextInt();
		
		System.out.println("Digite o numero B: ");
		numB = leia.nextInt();
		
		System.out.println("Digite o numero C: ");
		numC = leia.nextInt();
		
		// Processamento
		if (numA + numB > numC) {
			System.out.println("A soma de A + B é maior do que C");
		} else if (numA + numB < numC) {
			System.out.println("A soma de A + B é menor do que C");
		} else {
			System.out.println("A soma de A + B é igual a C");
		}
		
		leia.close();
		
	}

}
