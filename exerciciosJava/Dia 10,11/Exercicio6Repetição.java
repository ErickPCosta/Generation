package exerciciosJava;

import java.util.Scanner;

public class Exercicio6Repetição {
	/*
	 * 6- Escrever um programa que receba vários números inteiros no teclado. E no
	final imprimir a média dos números múltiplos de 3. Para sair digitar
	0(zero).
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		double num=0, soma=0;
		
		do {
			soma = soma + num;
			System.out.println("Digite um numero: ");
			num = ler.nextInt();
			
		}while (! (num == 0) );
		
		System.out.println("A soma é de " + soma);
		
	}

	

}
