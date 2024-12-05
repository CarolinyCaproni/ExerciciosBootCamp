package exercicios0512;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		int num[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int indice, numero;
		boolean encontrado = false;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o número que voce deseja encontrar:");
		numero = leia.nextInt();

		for (indice = 0; indice < 10; indice++) {
			if (numero == num[indice]) {
				System.out.println("O número " + num[indice] + " esta localizado na posição: " + indice);
				encontrado = true;
			}
		}

		if (encontrado == false) {
			System.out.println("O número " + numero + " não foi encontrado!");
		}
	}

}
