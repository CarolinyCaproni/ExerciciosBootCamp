package exercicios0912;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		int opcao;

		Queue<String> fila = new LinkedList<String>();

		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("\n***********************************************");
			System.out.println("                    Menu                       ");
			System.out.println(" 1 - Adicionar Cliente na Fila");
			System.out.println(" 2 - Listar todos os Clientes");
			System.out.println(" 3 - Retirar Cliente da Fila");
			System.out.println(" 0 - Sair");
			System.out.println("***********************************************");
			System.out.println("\nDigite a opção desejada:");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("\nEscreva o nome do cliente:");
				leia.skip("\\R?");
				String nome = leia.nextLine();
				fila.add(nome);
				System.out.println("\nFila:");
				for (String cliente : fila) {
					System.out.println(cliente);
				}
				System.out.println("\nCliente Adicionado!");
				break;
			case 2:
				System.out.println("\nLista de Clientes na fila:");
				for (String cliente : fila) {
					System.out.println(cliente);
				}
				break;
			case 3:
				if (fila.isEmpty()) {
					System.out.println("A Fila está vazia!");
				} else {
					String proximo = fila.poll();
					System.out.println(proximo + " foi chamado!");
				}
				break;
			case 0:
				System.out.println("Programa finalizado");
				break;

			}

		} while (opcao != 0);

		leia.close();

	}

}
