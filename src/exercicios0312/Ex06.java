package exercicios0312;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// Variaveis
		int codigoCargo;
		String nome;
		float salario;
		float novoSalario;
		
		// leia
		Scanner leia = new Scanner(System.in);
		
		// Entrada de dados
		System.out.println("Digite o nome do colaborador: ");
		nome = leia.nextLine();
		
		System.out.println("Digite o código do cargo: ");
		codigoCargo = leia.nextInt();
		
		System.out.println("Digite o salario do colaborador: ");
		salario = leia.nextFloat();
		
		// Processamento
		switch (codigoCargo) {
		case 1: 
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Gerente");
			novoSalario = salario + ( 0.1f * salario);
			System.out.printf("Sálario: %.2f", novoSalario);
			break;
			
		case 2: 
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Vendedor");
			novoSalario = salario + ( 0.07f * salario);
			System.out.printf("Sálario: %.2f", novoSalario);
			break;
			
		case 3: 
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Supervisor");
			novoSalario = salario + ( 0.09f * salario);
			System.out.printf("Sálario: %.2f", novoSalario);
			break;
			
		case 4: 
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Motorista");
			novoSalario = salario + ( 0.06f * salario);
			System.out.printf("Sálario: %.2f", novoSalario);
			break;
			
		case 5: 
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Estoquista");
			novoSalario = salario + ( 0.05f * salario);
			System.out.printf("Sálario: %.2f", novoSalario);
			break;
			
		case 6: 
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Técnico de TI");
			novoSalario = salario + ( 0.08f * salario);
			System.out.printf("Sálario: %.2f", novoSalario);
			break;
			
		}
		
		leia.close();

	}

}
