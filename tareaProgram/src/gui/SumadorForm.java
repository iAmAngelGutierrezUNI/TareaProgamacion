package gui;

import java.util.Scanner;
import dol.AtSumador;

public class SumadorForm {
	private Scanner scan = new Scanner(System.in);
	public void sumadorform() {
		AtSumador suma = new AtSumador();
		Sumador sumap = new Sumador();
		System.out.println("Porfavor ingresa operador 1.");
		suma.operador1 = scan.nextDouble();
		System.out.println("Porfavor ingresa operador 2.");
		suma.operador2 = scan.nextDouble();
		suma.res = suma.operador1 + suma.operador2 ;
		System.out.println("La suma de: "+suma.operador1 +" y "+suma.operador2+" es: "+suma.res);
		sumap.MainSumadora();
		
	}

}
