package exercicios0212;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// Variaveis
		float num1;
		float num2;
		float num3;
		float num4;
		float diferenca;
		
		// Comando leia		
		Scanner leia = new Scanner(System.in);
		
		// Inserção de dados
		System.out.println("Insira o numero 1: ");
		num1 = leia.nextFloat();
		
		System.out.println("Insira o numero 2: ");
		num2 = leia.nextFloat();
		
		System.out.println("Insira o numero 3: ");
		num3 = leia.nextFloat();
		
		System.out.println("Insira o numero 4: ");
		num4 = leia.nextFloat();
		
		// Processamento
		diferenca = (num1 * num2) - (num3 * num4);
		
		// Saida de dados
		System.out.println("A diferença do produto dos numeros 1 e 2 e do produto dos numeros 3 e 4 é: " + diferenca);

	}

}
