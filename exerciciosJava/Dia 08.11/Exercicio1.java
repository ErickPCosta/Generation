package exerciciosJava;

import java.util.Scanner;

public class Exercicio1 {
	
	
	public static void main(String[] args) {

		int anos, meses, dias, totalDias;

		Scanner ler = new Scanner(System.in);

		System.out.println("\nFavor entre com sua idade em anos");
		anos= ler.nextInt();

		System.out.println("\nFavor entre com sua idade em meses");
		meses= ler.nextInt();

		System.out.println("\nFavor entre com sua idade em dias");
		dias= ler.nextInt();

		totalDias = anos*365 + meses*30 + dias;

		System.out.println("Sua idade em dias é de: " + totalDias);
		
	}

}
