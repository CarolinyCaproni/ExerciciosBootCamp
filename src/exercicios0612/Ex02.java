package exercicios0612;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		int indice;
		int numero;

		// Collection ArrayList
		ArrayList<Integer> numeros = new ArrayList<Integer>();

		Scanner leia = new Scanner(System.in);
		
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		System.out.println("Digite o número que voce deseja encontrar:");
		numero = leia.nextInt();
		
		indice = numeros.indexOf(numero);
		
		if (indice != -1) {
            System.out.println("O número " + numero + " está localizado na posição: " + indice);
        } else {
            System.out.println("O número " + numero + " não foi encontrado!");
        }
	}

}
