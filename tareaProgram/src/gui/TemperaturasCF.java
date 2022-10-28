package gui;

import java.util.Scanner;

import dol.AtTemperaturas;

public class TemperaturasCF {
	private Scanner scan = new Scanner(System.in);
	public void tempcf() {
		ConvertirTemperaturas concf = new ConvertirTemperaturas();
		AtTemperaturas cf = new AtTemperaturas();
		System.out.println("Ha elegido trasformar °celcius a °farenheit.");
		System.out.println("Por favor ingrese °celcius");
		cf.CelFa = scan.nextDouble();
		cf.rescelfa = (cf.CelFa * 9/5)+32;
		System.out.println(cf.CelFa+" °celcius son: "+cf.rescelfa+" °farenheit.");
		concf.MainTemperatura();
	}

}
