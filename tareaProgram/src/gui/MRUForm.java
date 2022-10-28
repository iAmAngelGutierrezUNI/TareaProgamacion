package gui;

import java.util.Scanner;

import dol.AtMRU;

public class MRUForm {
	private Scanner scan = new Scanner(System.in);
	public void mruform() {
		AtMRU mru = new AtMRU();
		CalcularMRU cmru = new CalcularMRU();
		System.out.println("Porfavor ingresa distancia.");
		mru.distancia = scan.nextDouble();
		System.out.println("Porfavor ingresa tiempo.");
		mru.tiempo=scan.nextDouble();
		mru.resullMRU = mru.distancia / mru.tiempo ;
		System.out.println("La velocidad es: "+mru.resullMRU);
	    cmru.MainMRU();
	}
}
