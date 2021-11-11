package exerciciosJava;

import java.util.Scanner;

public class Exercicio3Repetição {
	/*
	 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
	21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
	idade for =-99.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int idade, cont20=0, cont50=0;
		
			System.out.println("\nDigite sua idade: ");
			idade=ler.nextInt();
		
			while(idade!=-99)
			{
				if(idade<21)
				{
					cont20++;
				}
				if(idade>50)
				{
					cont50++;
				}
				System.out.println("\nEntre com a sua idade: ");
				idade = ler.nextInt();
			}
			System.out.println("\nTemos: "+cont20+" pessoa(s) com menos de 21 anos");
			System.out.println("\nTemos: "+cont50+" pessoa(s) com mais de 50 anos");
		}

	}

