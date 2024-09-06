package ar.edu.ies6.informatica.punto04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Ingrese un número entero entre 1 y 9");
			
			if (scanner.hasNextInt()) {
				int numIngresado = scanner.nextInt();
				
				for (int i = 1; i < 11; i++) {
					int r = numIngresado * i;
					System.out.println(numIngresado+" X "+i+" = "+r);
					
				}
			}
		}
		
	}

}
