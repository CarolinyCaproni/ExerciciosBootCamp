package exercicios0212;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// Variaveis
		float salarioBruto;
		float adicionalNoturno;
		float horasExtras;
		float descontos;
		float salarioLiquido;
		
		// Comando leia		
		Scanner leia = new Scanner(System.in);
		
		// Inserção de dados
		System.out.println("Insira seu salario bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("Insira seu adicioal noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("Insira suas horas extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.println("Insira seus descontos: ");
		descontos = leia.nextFloat();
		
		// Processamento de dados
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		// Saida de dados
		System.out.printf("Seu salario liquido é: R$ %.2f", salarioLiquido);
	}

}
