package exerciciosJava;

import java.util.Scanner;

public class Exercicio1Dia9nov {
	
	public static void main (String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("\nDigite o primeiro número: ");
		n1 = ler.nextInt();
		System.out.println("\nDigite o segundo número: ");
		n2 = ler.nextInt();
		System.out.println("\nDigite o terceiro número: ");
		n3 = ler.nextInt();
		
		if (n1>n2 && n1>n3)
		{
			System.out.println("\nO maior valor é: "+n1);
		}
		else if (n2>n1 && n2>n3)
		{
			System.out.println("\nO maior valor é: "+n2);
		}
		else if (n3>n1 && n3>n2)
		{
			System.out.println("\nO maior valor é: "+n3);
		}
		else 
		{
			System.out.println("\nVocê digitou numeros iguais!!!");
		}
		
		
	}
	

}
