package exerciciosJava;

import java.util.Scanner;

public class Exercicio4Dia9Nov {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int valor;
		double resultado;
		
		System.out.println("\nDigite o número: ");
		valor=ler.nextInt();
		
		if(valor % 2 == 0)
		{
			resultado=Math.sqrt(valor);
		}
		else
		{
			resultado=Math.pow(valor, 2);
		}
		
		System.out.println("\nO resultado é: "+resultado);
	}

}
