package exercicios0612;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		int contador;
		
		// Collection ArrayList
		ArrayList<String> cores = new ArrayList<String>();
		
		

		// Leia
		Scanner leia = new Scanner(System.in);
		
		for (contador = 0; contador < 5; contador++) {
			System.out.println("Digite a " + (contador + 1) + "° cor:");
			String cor = leia.next();
			cores.add(cor);
		}
		
		System.out.println("\nCores inseridas:");
		
		for (String cor : cores) {
			System.out.println(cor);
		}
		
		Collections.sort(cores);
		
		System.out.println("\nCores inseridas em ordem alfabetica:");
		
		for (String cor : cores) {
			System.out.println(cor);
		}

	}

}
