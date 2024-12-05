package exercicios0412;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// Variaveis
		int idade, genero, dev;
		int tDevBack = 0, tMCisTrans = 0, tHCisTrans = 0, tNBFS = 0, tPessoas = 0;
		float media = 0, somaIdade = 0;
		String opcao = "S";
		
		Scanner leia = new Scanner(System.in);
		
		while (!opcao.equalsIgnoreCase("n")) {
			System.out.println("Digite a idade: ");
			idade = leia.nextInt();
			
			System.out.println("1- Mulher Cis"
					+ "\n2- Homem Cis"
					+ "\n3- Não Binário"
					+ "\n4- Mulher Trans"
					+ "\n5- Homem Trans"
					+ "\n6- Outros"
					+ "\nDigite o numero correspondente: ");
			
			genero = leia.nextInt();
			
			
			System.out.println("1- Backend"
					+ "\n2- Frontend"
					+ "\n3- Mobile"
					+ "\n4- FullStack"
					+ "\nDigite o numero correspondente: ");
			dev = leia.nextInt();
			
			
			System.out.println("Deseja continuar? (S/N) ");
			opcao = leia.next();
			
			tPessoas = tPessoas + 1;
			
			if (dev == 1) {
				tDevBack = tDevBack + 1;
			}
			
			if (genero == 1 || genero == 4 && dev == 2) {
				tMCisTrans++;
			}
			
			if (genero == 2 || genero == 5 && dev == 3 && idade >= 40) {
				tHCisTrans++;
			}
			
			if (genero == 3 && dev == 4 && idade <= 30) {
				tNBFS++;
			}
			
			if (idade > 0) {
				somaIdade = somaIdade + idade;
				media = somaIdade/tPessoas;
			}
			
		}
		
		System.out.println("Total de pessoas desenvolvedoras Backend: " + tDevBack);
		System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + tMCisTrans);
		System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + tHCisTrans);
		System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menore de 30 anos: " + tNBFS);
		System.out.println("Total de pessoas que responderam a pesquisa: " + tPessoas);
		System.out.println("A média de idade das pessoas que responderam a pesquisa: " + media);
		
	}

}
