package gui;

import java.util.Scanner;

public class ConvertirDecimal {
	private Scanner scan = new Scanner(System.in);
	public void MainConvertir() {
		System.out.println("Aqui se convierte a decimal a binario");
		System.out.println("1.volver a menu");
		short option = 0;
		do {
			System.out.println();
			option = scan.nextShort();
			switch (option) {
				case 1: Menu  menub = new Menu();
						menub.show();
					
					break;
				default:
					System.out.println("Opcion no valida.");
					break;
			}
		}while(option!=1);
}
	}
