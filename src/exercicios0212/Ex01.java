package exercicios0212;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// Variaveis
		float salario;
		float abono;
		float novoSalario;
		
		// Comando leia		
		Scanner leia = new Scanner(System.in);
		
		// Inserir salario
		System.out.println("Insira o seu salario: ");
		salario = leia.nextFloat();
		
		// Inserir abono
		System.out.println("Insira o seu abono: ");
		abono = leia.nextFloat();
		
		//Processamento
		novoSalario = salario + abono;
				
		//Saida de dados
		System.out.println("Seu novo salario é: R$ " + novoSalario);
		

	}

}
