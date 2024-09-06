package ar.edu.ies6.informatica.punto02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Ingrese un núnmero entero");
			
			int numIngresado = scanner.nextInt();
			
				if (numIngresado % 2 == 0) {
					int numTriple = numIngresado * 3;
					System.out.println("El número ingresado es par y su triple es "+numTriple);
					
				} else if (numIngresado % 2 == 1) {
					int numDoble = numIngresado * 2;
					System.out.println("El número ingresado es impar y su doble es "+numDoble);
				}
		}
		
		
		
		
		}

		
}

