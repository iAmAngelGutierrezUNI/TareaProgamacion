package gui;

import java.util.Scanner;

import dol.AtTemperaturas;

public class TemperaturasCK {	
	private Scanner scan = new Scanner(System.in);
	public void temperaturasck() {
		AtTemperaturas ck = new AtTemperaturas();
		ConvertirTemperaturas conck = new ConvertirTemperaturas();
		System.out.println("Ha elegido trasformar °celcius a °Kelvin.");
		System.out.println("Por favor ingrese °celcius");
		ck.CelKel = scan.nextDouble();
		ck.rescelkel = ck.CelKel + 273.15;
		System.out.println(ck.CelKel+" °celcius son: "+ck.rescelkel+" °Kelvin.");
		conck.MainTemperatura();
	}
	

}
