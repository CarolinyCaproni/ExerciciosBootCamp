package exercicios0612;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex03 {

	public static void main(String[] args) {
		
		int indice;
		
		// Collection Set
		Set<Integer> numeros = new HashSet<Integer>();
		
		Scanner leia = new Scanner(System.in);
		
		for (indice = 0; indice < 10; indice++) {
			System.out.println("Digite o " + (indice + 1) + "° numero:");
			Integer numero = leia.nextInt();
			numeros.add(numero);
		}
		
		System.out.println("\nLista de numeros: ");
		
		for (Integer numero : numeros) {
			System.out.println(numero);
		}

	}

}
