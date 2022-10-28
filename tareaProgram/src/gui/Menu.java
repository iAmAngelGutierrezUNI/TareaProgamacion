package gui;

import java.util.Scanner;

public class Menu{
 	Scanner scan = new Scanner(System.in);
	public void displayOptions() {
		System.out.println("Escriba el numero de lo que desee realizar");
		System.out.println("1. Calcular la velocidad de un MRU.");//hecho
		System.out.println("2. Calcular la altura maxima de un proyectil con trayctoria parabolica.");//hecho
		System.out.println("3. Identificar si un numero es primo.");
		System.out.println("4. Calcular factorial de un numero.");
		System.out.println("5. Sumar 2 numeros.");//hecho
		System.out.println("6. Convertir numero decimal a binario.");
		System.out.println("7. Convertir temperaturas.");//hecho
		System.out.println("8. Salir.");
	}
	
		public void show() {
			int opcion = 0;
			do {
				displayOptions();
				System.out.println();
				opcion = scan.nextInt();
				switch (opcion) {
					case 1:
						CalcularMRU mru = new CalcularMRU();
						mru.MainMRU();
						break;
					case 2:
						Trayectoria tra = new Trayectoria();
						tra.MainTrayectoria();
						break;
					case 3:
						CalcularPrimo calp = new CalcularPrimo();
						calp.mainPrimo();
						break;
					case 4:
						CalcularFactorial calf = new CalcularFactorial();
						calf.MainFactorial();
						break;
					case 5:
						Sumador sum = new Sumador();
						sum.MainSumadora();
						break;
					case 6:
						ConvertirDecimal conb = new ConvertirDecimal();
						conb.MainConvertir();
						break;
					case 7:
						ConvertirTemperaturas cont = new ConvertirTemperaturas();
						cont.MainTemperatura();
						break;
					case 8:
						System.exit(0);
						break;
					default:
						System.out.println("Opcion invalida");
						break;
			}
				}while(opcion!=8);		
		}
}
				
				
				
				
				
				
				
				
				
				
				
				
				
				