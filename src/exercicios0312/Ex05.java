package exercicios0312;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// Variaveis
		int codigoProduto;
		int quantidade;
		float valor;
		
		// Leia
		Scanner leia = new Scanner(System.in);
		
		// Entradas de dados
		System.out.println("Digite o código do produto: ");
		codigoProduto = leia.nextInt();
		
		System.out.println("Digite a quantidadde desejada: ");
		quantidade = leia.nextInt();
		
		switch (codigoProduto) {
		
		case 1:
			System.out.println("Cachorro Quente");
			valor = 10 * quantidade;
			System.out.printf("Valor total: R$ %.2f", valor);
			break;
			
		case 2:
			System.out.println("X-Salada");
			valor = 15 * quantidade;
			System.out.printf("Valor total: R$ %.2f", valor);
			break;
			
		case 3:
			System.out.println("X-Bacon");
			valor = 18 * quantidade;
			System.out.printf("Valor total: R$ %.2f", valor);
			break;
			
		case 4:
			System.out.println("Bauru");
			valor = 12 * quantidade;
			System.out.printf("Valor total: R$ %.2f", valor);
			break;
			
		case 5:
			System.out.println("Refrigerante");
			valor = 8 * quantidade;
			System.out.printf("Valor total: R$ %.2f", valor);
			break;
			
		case 6:
			System.out.println("Suco de Laranja");
			valor = 13 * quantidade;
			System.out.printf("Valor total: R$ %.2f", valor);
			break;
		
		}
		
		leia.close();

	}

}
