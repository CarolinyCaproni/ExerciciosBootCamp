package exercicios0412;

import java.util.Scanner;

public class Ex06Tent2 {

	public static void main(String[] args) {
		// Variaveis
				int num, cont = 0;
				float media, multiplos = 0;
				
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
