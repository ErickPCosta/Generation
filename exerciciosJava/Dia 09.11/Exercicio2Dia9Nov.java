package exerciciosJava;

import java.util.Scanner;

public class Exercicio2Dia9Nov {
	
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.print("\nEntre com o primeiro valor: ");
		n1 = ler.nextInt();
		System.out.print("\nEntre com o segundo valor: ");
		n2 = ler.nextInt();
		System.out.print("\nEntre com o terceiro valor: ");
		n3 = ler.nextInt();
		
		if (n1<=n2 && n1<=n3)
		
		{
			System.out.print("\nA ordem crescente é: "+n1+" , "+n2+" , "+n3);
		}
		 
		 else if (n1<=n3 && n3<=n2)
		 {
			 System.out.print("\nA ordem crescente é: "+n1+" , "+n3+" , "+n2);
		 }
		 else if(n2<=n1 && n1<=n2)
			{
				System.out.print("\nA ordem crescente: "+n1+" , "+n2+" , "+n3);
			}
			else if(n2<=n3 && n3<=n1)
			{
				System.out.print("\nOrdem crescente: "+n2+" , "+n3+" , "+n1);
			}
			else if(n3<=n1 && n1<=n2)
			{
				System.out.print("\nOrdem crescente: "+n3+" , "+n1+" , "+n2);
			}
			else
			{
				System.out.print("\nOrdem crescente: "+n3+" , "+n2+" , "+n1);
			}

		 
		
			
		
		
	}

}
