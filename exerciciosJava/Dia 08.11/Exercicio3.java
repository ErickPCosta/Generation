package exerciciosJava;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {

		int totalSegundos, horas, minutos, segundos;

		Scanner ler = new Scanner (System.in);

		System.out.println("Informe tempo de duração do evento em segundos: ");
		
		totalSegundos = ler.nextInt();

		horas = totalSegundos/3600;
		minutos = (totalSegundos%3600) /60;
		segundos = (totalSegundos%3600)% 60;

		System.out.println("O evento teve uma duração de: " +horas+ " horas, " +minutos+ " minutos e " +segundos+ " segundos.");
	}

}
