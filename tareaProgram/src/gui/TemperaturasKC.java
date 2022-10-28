package gui;

import java.util.Scanner;

import dol.AtTemperaturas;

public class TemperaturasKC {
	private Scanner scan = new Scanner(System.in);
	public void temperaturaskc() {
		AtTemperaturas kc = new AtTemperaturas();
		ConvertirTemperaturas conkc = new ConvertirTemperaturas();
		System.out.println("Ha elegido trasformar °Kelvin a °celcius.");
		System.out.println("Por favor ingrese °Kelvin");
		kc.KelCel = scan.nextDouble();
		kc.reskelcel = kc.KelCel - 273.15;
		System.out.println(kc.KelCel+" °Kelvin son: "+kc.reskelcel+" °celcius.");
		conkc.MainTemperatura();
	}

}
