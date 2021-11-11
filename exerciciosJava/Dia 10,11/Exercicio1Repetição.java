package exerciciosJava;

public class Exercicio1Repetição {
	/*
	 * Informar todos os números de 1000 a 1999 que quando divididos por 11
		obtemos resto = 5.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\nDe 1000 a 1999 dividor por 11, obtem-se o resto 5: ");
		
			for (int x = 1000; x<= 1999; x++) {
			
			if (x % 11 == 5) {
				
				System.out.print("\n"+x);
			}
		}
		
		
		
		

	}

}
