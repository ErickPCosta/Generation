package exerciciosJava;

import java.util.Scanner;

public class ExArray2 {
	/*
	 * 2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
	� Os n�meros pares digitados;  
	� A soma dos n�meros pares digitados; 
	� Os n�meros �mpares digitados; 
	� A quantidade de n�meros �mpares digitados.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int v [] = new int [6] ;
		int num=0, contPar=0, contImpar=0;
		
		
		for(num = 0; num < v.length ;num ++) {
			System.out.println("\nDigite um n�mero: ");
			v[num]=leia.nextInt();	
		}
		
		System.out.println("\nN�meros pares digitados: ");
		for(num = 0;num < v.length; num++) {
			if(v[num] %2==0){
			System.out.printf("\n%d ",v[num],"\n");
			contPar += v[num];
			}
		else 
		{
			contImpar += v[num];
		}
	}
		
		System.out.println("\nSoma dos n�meros pares: "+contPar);
		
		System.out.println("\nN�meros �mpares digitados: ");
		for(num=0;num<v.length;num++) {
			if(v[num] %2!=0) {
				System.out.printf("\n%s ",v[num],"\n"); 
			}
		
		}
		System.out.println("\nSoma dos n�meros �mpares: "+contImpar);
			
	}

}
