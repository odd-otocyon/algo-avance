package test;

import structures.Fifo;

public class TestFifo {

	public static void main(String[] args) {
		Fifo<String> fifo = new Fifo<>();
		
		System.out.println(fifo.estVide());
		
		fifo.ajouter("1");
		fifo.ajouter("2");
		fifo.ajouter("3");
		fifo.ajouter("4");
		fifo.ajouter("5");
		fifo.ajouter("6");
		
		System.out.println(fifo.estVide());
		
		System.out.println(fifo);
		
//		while (!fifo.estVide()) {
//			System.out.println(fifo.retirer());
//		}
	}

}