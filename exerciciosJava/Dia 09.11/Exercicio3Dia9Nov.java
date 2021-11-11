package exerciciosJava;

import java.util.Scanner;

public class Exercicio3Dia9Nov {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		int idade;
		
		System.out.println("\nEntre com a idade");
		idade = ler.nextInt();
		
		if (idade>=18 && idade<=25 )
		{
			System.out.println("\nVocê está na categoria adulto!!! ");
		}
		else if (idade>=15 && idade<=17)
		{
			System.out.println("\nVocê está na categoria juvenil!!! ");
		}
		else if(idade>=10 && idade<=14)
		{
			System.out.println("\nVocê está na categoria infantil!!!");
		}
		else
		{
			System.out.println("\nDados inválidos!!!");
		}

	}

}
