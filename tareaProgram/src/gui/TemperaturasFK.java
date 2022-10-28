package gui;

import java.util.Scanner;

import dol.AtTemperaturas;

public class TemperaturasFK {
	private Scanner scan = new Scanner(System.in);
	public void temperaturasfk() {
		AtTemperaturas fk = new AtTemperaturas();
		ConvertirTemperaturas conck = new ConvertirTemperaturas();
		System.out.println("Ha elegido trasformar °farenheit a °Kelvin.");
		System.out.println("Por favor ingrese °farenheit");
		fk.FaKel = scan.nextDouble();
		fk.resfakel = (fk.FaKel-32)*5/9 + 273.15;
		System.out.println(fk.FaKel+" °farenheit son: "+fk.resfakel+" °Kelvin.");
		conck.MainTemperatura();
		
	}

}
