package application;

import entities.CarroEsportivo;

public class main {
	public static void main(String[] args) {

		CarroEsportivo minhaFerrari = new CarroEsportivo("Ferrari", "Vermelha", 2023);

		minhaFerrari.acelerar();

		minhaFerrari.ativarModoEsportivo();

		System.out.println("\nStatus Final:");
		System.out.println(minhaFerrari.toString());
	}
}

