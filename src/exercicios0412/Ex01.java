package exercicios0412;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// Variaveis
		int num1, num2, contador;
		
		// Leia
		Scanner leia = new Scanner(System.in);
		
		// Entrada de dados
		System.out.println("Digite o primeiro numero: ");
		num1 = leia.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		num2 = leia.nextInt();
		
		// Processamento
		if (num1 > num2) {
			// Saida de dados
			System.out.println("Intervalo inválido!");
		}
		
		// Processamento
		for (contador = num1; contador <= num2; contador = contador + 1) {
			
			if (contador % 5 == 0 && contador % 3 == 0) {
				// Saida de dados
				System.out.println(contador + " É multiplo de 3 e 5");
			}
			
		}

	}

}
