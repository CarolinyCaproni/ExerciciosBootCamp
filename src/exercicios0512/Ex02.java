package exercicios0512;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		int num[] = new int[10];		
		float soma = 0, media;
		int indice;
		
		Scanner leia = new Scanner(System.in);
		
		for (indice = 0; indice < 10; indice++) {
			System.out.println("Digite o " + (indice + 1) + "º Número:");
			num[indice] = leia.nextInt();
			soma = soma + num[indice];
		}
		
		System.out.println("Elementos pares:");
		
		for (indice = 0; indice < 10; indice++) {
			if (num[indice] % 2 == 0) {
				System.out.print(num[indice] + " ");
			} 
		}
		
		System.out.println("\nElementos impares:");
		
		for (indice = 0; indice < 10; indice++) {
			if (num[indice] % 2 != 0) {
				System.out.print(num[indice] + " ");
			} 
		}
		
		media = soma/10;
		
		System.out.println("\nSoma: " + soma);
		System.out.println("Média: " + media);

	}

}
