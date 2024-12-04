package exercicios0412;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// Variaveis
		int num, cont = 0, multiplos = 0;
		float media;
		
		// Leia
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			
			if (num % 3 == 0 && num != 0) {
				cont = cont + 1;
				multiplos = num + multiplos;
			}
					
					
		} while (num != 0);
		
		media = multiplos/cont;
		
		System.out.println("A média de todos os números múltiplos de 3 é: " + media);

	}

}
