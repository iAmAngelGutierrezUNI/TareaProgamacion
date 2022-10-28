package gui;

import java.util.Scanner;

import dol.AtTrayectoria;

public class TrayectoriaForm {
	private Scanner scan = new Scanner(System.in);
	public void trayecForm() {
		AtTrayectoria AtTr = new AtTrayectoria();
		Trayectoria trat = new Trayectoria();
		System.out.println("Porfavor ingresa angulo.");
		AtTr.angulo = scan.nextDouble();
		System.out.println("Porfavor ingresa velocidad.");
		AtTr.velocidad=scan.nextDouble();
		System.out.println("Porfavor ingresa gravedad.");
		AtTr.gravedad=scan.nextDouble();
		double resultadorad = Math.toRadians(AtTr.angulo);
		double rusultadoSen = Math.sin(resultadorad);
		double rusultadoSenex= Math.pow(rusultadoSen, 2);
		double rusultadogravedad= AtTr.gravedad * 2;
		double rusultadovelo=Math.pow(AtTr.velocidad,2);
		AtTr.resullTrayectoria = (rusultadovelo * rusultadoSenex)/rusultadogravedad;
	    System.out.println("La altura maxima es: "+ AtTr.resullTrayectoria);
	    trat.MainTrayectoria();
		 
		}

	}	