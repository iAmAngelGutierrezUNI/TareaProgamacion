package gui;

import java.util.Scanner;

public class Sumador {
	private Scanner scan = new Scanner(System.in);
	public void MainSumadora() {
		System.out.println("Ha elegido sumar 2 operadores.");
		System.out.println("Escriba el numero de lo que desee realizar");
		System.out.println("1. calcular.");
		System.out.println("2. volver menu principal.");

			short option = 0;
			do {
				System.out.println();
				option = scan.nextShort();
				switch (option) {
					case 1: SumadorForm sum = new SumadorForm ();
						sum.sumadorform();
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
