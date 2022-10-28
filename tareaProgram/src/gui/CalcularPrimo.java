package gui;

import java.util.Scanner;

public class CalcularPrimo {
	private Scanner scan = new Scanner(System.in);
	public void mainPrimo() {
		System.out.println("Aqui se identifica si el numero es primo o no");
		System.out.println("1.volver a menu");
		short option = 0;
		do {
			System.out.println();
			option = scan.nextShort();
			switch (option) {
				case 1: Menu  menup = new Menu();
						menup.show();
					
					break;
				default:
					System.out.println("Opcion no valida.");
					break;
			}
		}while(option!=1);
		
		
		
		
		
		
		
		
		
		/*System.out.println("Ha elegido determinar si un numero es primo o no.");
		System.out.println("Escriba el numero de lo que desee realizar");
		System.out.println("1. calcular.");
		System.out.println("2. volver menu principal.");

			short option = 0;
			do {
				System.out.println();
				option = scan.nextShort();
				switch (option) {
					case 1: PrimoForm  prifo = new PrimoForm ();
					prifo.Primoform();
						
						break;
					case 2: Menu menu = new Menu();
							menu.show();
						break;
					default:
						System.out.println("Opcion no valida.");
						break;
				}
			}while(option!=2);*/
	}

}
