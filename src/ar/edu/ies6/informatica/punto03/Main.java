package ar.edu.ies6.informatica.punto03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int factorial = 1;
		System.out.println("Ingrese un número entero entre 0 y 10");
		
		if (scanner.hasNextInt()) {
			int numIngresado = scanner.nextInt();
			
			 if (numIngresado<0 || numIngresado>10) {
				 System.out.println("Solo calcula números entre 0 al 10!");
				
			} else {
				while (numIngresado!=0) {
					factorial = factorial * numIngresado;
					numIngresado--;
					
				}
				System.out.println("El factorial es: "+factorial);
				scanner.close();
			}
		} else {
			System.out.println("Ingreso un dato incorrecto");
		}
		
	}

}
