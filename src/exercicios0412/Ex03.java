package exercicios0412;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// Variaveis
		int idade = 40, menores = 0, maiores = 0;
		
		// Leia
		Scanner leia = new Scanner(System.in);
		
		// Entrada e processamento de dados
		while (idade > 0) {
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
			
			if (idade < 21 && idade > 0) {
				menores = menores + 1;
			}
			
			if (idade > 50) {
				maiores = maiores +1;
			}
		}
		
		// Saida de dados
		System.out.println("Total de pessoas menores de 21 anos: " + menores);
		System.out.println("Total de pessoas maiores de 50 anos: " + maiores);

	}

}
