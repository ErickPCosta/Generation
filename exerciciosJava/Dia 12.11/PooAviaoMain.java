package exerciciosJava;

import java.util.Random;
import java.util.Scanner;

public class PooAviaoMain {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Random random = new Random();
		
		int numHangares = 5;
		String lerModelo, lerCor;
		
		PooAviao[] hangar = new PooAviao[numHangares];
			
		for(int i=0;i<hangar.length;i++) {
			int numPassageiros = random.nextInt(300)+100;
			int velocidade  = random.nextInt(1000)+300;
			hangar[i] = new PooAviao();
			System.out.println("Qual o modelo do avião?");
			lerModelo =  leia.nextLine();
			hangar[i].setModelo(lerModelo);
			System.out.println("Qual a cor?");
			lerCor = leia.nextLine();
			hangar[i].setCor(lerCor);
			hangar[i].setVelocidadeMax(velocidade);
			hangar[i].setNumTripulantes(numPassageiros);
		}
			
		for(int i=0;i<hangar.length;i++) {
			hangar[i].dadosAviao();
		}
				
	}

}
