package gui;

import java.util.Scanner;

import dol.AtTemperaturas;

public class TemperaturasFC {
	private Scanner scan = new Scanner(System.in);
	public void temperaturasfc() {
		AtTemperaturas fc = new AtTemperaturas();
		ConvertirTemperaturas conck = new ConvertirTemperaturas();
		System.out.println("Ha elegido trasformar °farenheit a °celcius.");
		System.out.println("Por favor ingrese °farenheit");
		fc.FaCel = scan.nextDouble();
		fc.resfacel = (fc.FaCel-32)*5/9;
		System.out.println(fc.FaCel+" °farenheit son: "+fc.resfacel+" °farenheit.");
		conck.MainTemperatura();
		
	}

}
