package gui;

import java.util.Scanner;

public class Trayectoria {	
	private Scanner scan = new Scanner(System.in);
	public void MainTrayectoria() {
	
			System.out.println("Aqui va la trayectoria");
			System.out.println("Ha seleccionado calcular la altura maxima de un proyectil con trayctoria parabolica.");
			System.out.println("Escriba el numero de lo que desee realizar");
			System.out.println("1. calcular.");
			System.out.println("2. volver menu principal");

				short option = 0;
				do {
					System.out.println();
					option = scan.nextShort();
					switch (option) {
						case 1: TrayectoriaForm tform = new TrayectoriaForm();
						tform.trayecForm();
							
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


