package exerciciosJava;

import java.util.Scanner;

public class ExArray3 {
	/*
	 * 3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int vet [][] = new int [3][3];
		int linha, coluna , maiorValor=10;
		
		Scanner leia = new Scanner(System.in);
		
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				System.out.println("\nDigite os números: ");
				vet[linha][coluna]=leia.nextInt();
				
			}
				if(vet[linha][coluna]>10) {
					vet[linha][coluna]++;
				}
				
				}
			}
		}
	



