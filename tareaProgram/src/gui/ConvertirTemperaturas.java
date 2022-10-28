package gui;

import java.util.Scanner;

public class ConvertirTemperaturas {
	private Scanner scan = new Scanner(System.in);
	public void MainTemperatura() {
		System.out.println("Ha seleccionado transforar temperaturas.");
		System.out.println("Escriba el numero de lo que desee realizar.");
		System.out.println("1. Convertir de celcius a farenheit.");
		System.out.println("2. Convertir de farenheit a celsius.");
		System.out.println("3. Convertir de celsius a kelvin.");
		System.out.println("4. Convertir de kelvin a celsius.");
		System.out.println("5. Convertir de farenheit a kelvin.");
		System.out.println("6. Convertir de kelvin a fareheit.");
		System.out.println("7. volver menu principal.");
		
		short option = 0;
		do {
			System.out.println();
			option = scan.nextShort();
			switch (option) {
				case 1: TemperaturasCF tempCF = new TemperaturasCF();
						tempCF.tempcf();
					break;
				case 2: TemperaturasFC tempFC = new TemperaturasFC();
						tempFC.temperaturasfc();
					break;
				case 3: TemperaturasCK tempCK = new TemperaturasCK();
						tempCK.temperaturasck();
					break;
				case 4: TemperaturasKC tempKC = new TemperaturasKC();
						tempKC.temperaturaskc();
					break;
				case 5: TemperaturasFK tempFK = new TemperaturasFK();
						tempFK.temperaturasfk();
					break;
				case 6: TemperaturasKF tempKf = new TemperaturasKF();
						tempKf.temperaturaskf();;
					break;
				case 7: Menu menut= new Menu();
						menut.show();
					break;
			
			default:
				System.out.println("Opcion no valida.");
			}
		}while(option!=7);
	
	

}
	}
