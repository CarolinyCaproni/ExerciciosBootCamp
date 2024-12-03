package exercicios0312;

import java.util.Scanner;

public abstract class Ex02 {

	public static void main(String[] args) {
		// Variaveis
		int num;
		
		// Leia
		Scanner leia = new Scanner(System.in);
		
		// Entradas de dados
		System.out.println("Digite um numero imteiro: ");
		num = leia.nextInt();
		
		// Processamento
		if (num % 2 == 0) {
			System.out.print("O numero " + num + " é par e ");
		} else {
			System.out.print("O numero " + num + " é impar e ");
		}
		
		if (num > 0) {
			System.out.print("positivo!");
		} else {
			System.out.print("negativo!");
		}
		
		leia.close();

	}

}
