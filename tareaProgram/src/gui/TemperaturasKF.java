package gui;

import java.util.Scanner;

import dol.AtTemperaturas;

public class TemperaturasKF {
	private Scanner scan = new Scanner(System.in);
	public void temperaturaskf() {
		AtTemperaturas kf = new AtTemperaturas();
		ConvertirTemperaturas conck = new ConvertirTemperaturas();
		System.out.println("Ha elegido trasformar °Kelvin a °farenheit.");
		System.out.println("Por favor ingrese °Kelvin");
		kf.KelFa = scan.nextDouble();
		kf.reskelfa = (kf.KelFa-273.15)*9/5 + 32;
		System.out.println(kf.KelFa+" °Kelvin son: "+kf.reskelfa+" °farenheit.");
		conck.MainTemperatura();
		
	}

}
