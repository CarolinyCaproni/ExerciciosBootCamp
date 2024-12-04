package exercicios0412;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// Variaveis
		int num, soma = 0;
		
		// Leia
		Scanner leia = new Scanner(System.in);
		
		// Entrada e processamentos de dados
		do {
			System.out.println("Digite um numero: ");
			num = leia.nextInt();
			
			if (num > 0) {
				soma = num + soma;
			}
			
		} while (num != 0);
		
		// Saidas de dados
		System.out.println("A soma dos números positivos é: " + soma);

	}

}
