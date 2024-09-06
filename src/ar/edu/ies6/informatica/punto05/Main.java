package ar.edu.ies6.informatica.punto05;

import java.time.LocalDate;

import ar.edu.ies6.informatica.punto05.model.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        // Creación de un objeto utilizando el constructor por defecto 
		
		//Dejamos esto comentado porque sino nos da error
		/*Persona persona1 = new Persona();
        persona1.mostrarDatos();
        System.out.println(); */

       // Creación de un objeto utilizando el constructor parametrizado
        Persona persona2 = new Persona("12345678", "Juan Pérez", LocalDate.of(1990, 5, 15), "Buenos Aires");
        persona2.mostrarDatos();
        System.out.println();

        // Creación de un objeto utilizando el constructor que lleva dni, nombre y fecha de nacimiento
        Persona persona3 = new Persona("87654321", "María García", LocalDate.of(2005, 10, 30));
        persona3.mostrarDatos();
	


	}

}
