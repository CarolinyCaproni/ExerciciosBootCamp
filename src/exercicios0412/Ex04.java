package exercicios0412;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// Variaveis
		int idade, genero, dev;
		float media = 0;
		int opcao = 1;
		
		Scanner leia = new Scanner(System.in);
		
		while (opcao == 1) {
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			media = idade + media;
			
			System.out.println("Deseja continuar? (1- Sim/2- Não)");
			opcao = leia.nextInt();
			
		}
		
		System.out.println("A media é: " + media);
		
		/*while (opcao.equals("s")) {
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			
			System.out.println("1- Mulher Cis\r2- Homem Cis\r3- Não Binário\r4- Mulher Trans\r5- Homem Trans\r6-Outros\rDigite seu gênero:");
			genero = leia.nextInt();
			
			System.out.println("1- Baackend\r2- FrontendCis\r3- Mobile\r4- FullStack\rDigite seu cargo:");
			dev = leia.nextInt();
			
			System.out.println("Deseja inserir outro colaborador? (S- sim ou N- Não) ");
			opcao = leia.nextLine();
		}

		System.out.println("Encerrado");*/
		
	}

}
