package exerciciosJava;

import java.util.Scanner;

public class Exercicio6Repeti��o {
	/*
	 * 6- Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
	final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
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
		
		System.out.println("A soma � de " + soma);
		
	}

	

}
