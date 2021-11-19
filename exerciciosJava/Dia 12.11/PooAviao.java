package exerciciosJava;
/*
 * 2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */

public class PooAviao {
	//declarando atributos da classe Aviao
		private String modelo;
		private String cor;
		private int veloMax;
		private int numTripulantes;
		
		
		
		public void Aviao() { //declarando construtor
			
		}
		
		public void Aviao(String modelo, String cor,int veloMax, int numTripulantes) {
			this.modelo = modelo;
			this.cor = cor;
			this.veloMax = veloMax;
			this.numTripulantes = numTripulantes;
		}
		
		
		
		
		public void dadosAviao() {
			System.out.println("\nModelo: "+modelo+"\nCor: "+cor+"\nA velocidade maxima é de: "+veloMax+"\nNúmero de tripulantes: "+numTripulantes);
		}

		//GET and SET
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		public String getCor() {
			return cor;
		}
		public void setCor(String cor) {
			this.cor = cor;
		}
		public int getVelocidadeMax() {
			return veloMax;
		}
		public void setVelocidadeMax(int veloMax) {
			this.veloMax = veloMax;
		}
		public int getNumTripulantes() {
			return numTripulantes;
		}
		public void setNumTripulantes(int numTripulantes) {
			this.numTripulantes = numTripulantes;
		}

}
