package exercicios0212;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// Variaveis
		float nota1;
		float nota2;
		float nota3;
		float nota4;
		float media;
		
		// Comando leia		
		Scanner leia = new Scanner(System.in);
				
		// Inserção de dados
		System.out.println("Insira a nota 1: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Insira a nota 2: ");
		nota2 = leia.nextFloat();
		
		System.out.println("Insira a nota 3: ");
		nota3 = leia.nextFloat();
		
		System.out.println("Insira a nota 4: ");
		nota4 = leia.nextFloat();
		
		// Processamento de dados
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		// Saida de dados
		System.out.printf("A media das notas é: %.1f", media);

	}

}
