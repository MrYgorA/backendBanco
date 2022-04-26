package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Dados;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Dados dados;
		
		System.out.print("Digite o n�mero da conta: ");
		int conta = sc.nextInt();
		
		System.out.print("Digite o nome do titular da conta: ");
		sc.nextLine();
		String titular = sc.nextLine();
		
		System.out.print("H� um valor para dep�sito inicial (s/n)? ");
		char resposta = sc.next().charAt(0);
		if (resposta == 's') {
			System.out.print("Digite o valor para o dep�sito: ");
			double depositoInicial = sc.nextDouble();
			dados = new Dados(conta, titular, depositoInicial);
		}
		else {
			dados = new Dados(conta, titular);
		}
		
		System.out.println(dados);
		System.out.println();
		
		System.out.print("Digite o valor para dep�sito: ");
		double deposito = sc.nextDouble();
		dados.depositar(deposito);
		
		System.out.println();
		System.out.println("Dados atualizados: ");
		System.out.println(dados);
		
		System.out.println();
		System.out.print("Digite o valor para saque: ");
		double saque = sc.nextDouble();
		dados.saque(saque);
		
		System.out.println();
		System.out.println("Dados atualizados: ");
		System.out.println(dados);

		sc.close();

	}

}
