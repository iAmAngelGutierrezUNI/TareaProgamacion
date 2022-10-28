package gui;

import java.util.Scanner;

public class CalcularFactorial {
	private Scanner scan = new Scanner(System.in);
	public void MainFactorial() {
		System.out.println("Aqui se calcula el factorial de un numero");
			System.out.println("1.volver a menu");
			short option = 0;
			do {
				System.out.println();
				option = scan.nextShort();
				switch (option) {
					case 1: Menu  menuf = new Menu();
							menuf.show();
						
						break;
					default:
						System.out.println("Opcion no valida.");
						break;
				}
			}while(option!=1);
	}
}
