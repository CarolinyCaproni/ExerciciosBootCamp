package exercicios0412;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// Variaveis
		int num, contador, pares = 0, impares = 0;
		
		// Leia
		Scanner leia = new Scanner(System.in);
		
		// Entrada e processamento de dados
		for (contador = 1; contador <= 10; contador++ ) {
			System.out.println("Digite o " + contador + "º número: ");
			num = leia.nextInt();
			
			if (num % 2 == 0) {
				pares = pares + 1;
			}
			
			if (num % 2 != 0) {
				impares = impares + 1;
			}
		}
		
		// Saida de dados
		System.out.println("Total de numeros pares: " + pares);
		System.out.println("Total de numeros impares: " + impares);

	}

}
