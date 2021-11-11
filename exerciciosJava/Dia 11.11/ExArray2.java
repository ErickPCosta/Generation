package exerciciosJava;

import java.util.Scanner;

public class ExArray2 {
	/*
	 * 2- Faça um programa que receba 6 números inteiros e mostre: 
	• Os números pares digitados;  
	• A soma dos números pares digitados; 
	• Os números ímpares digitados; 
	• A quantidade de números ímpares digitados.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int v [] = new int [6] ;
		int num=0, contPar=0, contImpar=0;
		
		
		for(num = 0; num < v.length ;num ++) {
			System.out.println("\nDigite um número: ");
			v[num]=leia.nextInt();	
		}
		
		System.out.println("\nNúmeros pares digitados: ");
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
		
		System.out.println("\nSoma dos números pares: "+contPar);
		
		System.out.println("\nNúmeros ímpares digitados: ");
		for(num=0;num<v.length;num++) {
			if(v[num] %2!=0) {
				System.out.printf("\n%s ",v[num],"\n"); 
			}
		
		}
		System.out.println("\nSoma dos números ímpares: "+contImpar);
			
	}

}
