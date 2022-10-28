package gui;

import java.util.Scanner;

public class CalcularMRU{
	private Scanner scan = new Scanner(System.in);
	public void MainMRU() {
		System.out.println("Ha seleccionado calcular la velociada del MRU.");
		System.out.println("Escriba el numero de lo que desee realizar");
		System.out.println("1. calcular.");
		System.out.println("2. volver menu principal.");

			short option = 0;
			do {
				System.out.println();
				option = scan.nextShort();
				switch (option) {
					case 1: MRUForm mrum = new MRUForm();
							mrum.mruform();
						
						break;
					case 2: Menu menu = new Menu();
							menu.show();
						break;
					default:
						System.out.println("Opcion no valida.");
						break;
				}
			}while(option!=2);
		
		

	}
	}

