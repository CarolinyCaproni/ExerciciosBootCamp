package exercicios0912;

import java.util.Scanner;
import java.util.Stack;

public class Ex02 {

	public static void main(String[] args) {
		
		int opcao;

		Stack<String> pilha = new Stack<String>();
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("\n***********************************************");
			System.out.println("                    Menu                       ");
			System.out.println(" 1 - Adicionar Livro na Pilha");
			System.out.println(" 2 - Listar todos os Livros");
			System.out.println(" 3 - Retirar Livro da Pilha");
			System.out.println(" 0 - Sair");
			System.out.println("***********************************************");
			System.out.println("\nDigite a opção desejada:");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("\nDigite o nome do livro:");
				leia.skip("\\R?");
				String livro = leia.nextLine();
				pilha.push(livro);
				System.out.println("\nPilha:");
				for (String livros : pilha) {
					System.out.println(livros);
				}
				System.out.println("\nLivro Adicionado!");
				break;
			case 2:
				System.out.println("Lista de Livros na Pilha:\n");
				for (String livros : pilha) {
					System.out.println(livros);
				}
				break;
			case 3:
				if (pilha.isEmpty()) {
					System.out.println("A Pilha está vazia!");
				} else {
					String retirado = pilha.pop();
					System.out.println(retirado + " foi retirado da pilha!");
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
