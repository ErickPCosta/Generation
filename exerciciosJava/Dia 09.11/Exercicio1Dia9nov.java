package exerciciosJava;

import java.util.Scanner;

public class Exercicio1Dia9nov {
	
	public static void main (String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("\nDigite o primeiro n�mero: ");
		n1 = ler.nextInt();
		System.out.println("\nDigite o segundo n�mero: ");
		n2 = ler.nextInt();
		System.out.println("\nDigite o terceiro n�mero: ");
		n3 = ler.nextInt();
		
		if (n1>n2 && n1>n3)
		{
			System.out.println("\nO maior valor �: "+n1);
		}
		else if (n2>n1 && n2>n3)
		{
			System.out.println("\nO maior valor �: "+n2);
		}
		else if (n3>n1 && n3>n2)
		{
			System.out.println("\nO maior valor �: "+n3);
		}
		else 
		{
			System.out.println("\nVoc� digitou numeros iguais!!!");
		}
		
		
	}
	

}
