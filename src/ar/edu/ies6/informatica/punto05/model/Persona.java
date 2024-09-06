package ar.edu.ies6.informatica.punto05.model;

import java.time.LocalDate;
import java.time.Period;

public class Persona {

	//atributos con modificador de acceso privado
		private String dni;
		private String nombre;
		private LocalDate fechaNacimiento;
		private String provincia;
		
		//constructor por defecto 
		public Persona() {
		}
		
		//constructor parametrizado
		public Persona(String dni, String nombre, LocalDate fechaNacimiento, String provincia) {
	        this.dni = dni;
	        this.nombre = nombre;
	        this.fechaNacimiento = fechaNacimiento;
	        this.provincia = provincia;
	    }
		
		//constructor inicia Jujuy
		public Persona(String dni, String nombre, LocalDate fechaNacimiento) {
	        this.dni = dni;
	        this.nombre = nombre;
	        this.fechaNacimiento = fechaNacimiento;
	        this.provincia = "Jujuy";	
		}
		
		//métodos accesores (get y set)
	    public String getDni() {
	        return dni;
	    }

	    public void setDni(String dni) {
	        this.dni = dni;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public LocalDate getFechaNacimiento() {
	        return fechaNacimiento;
	    }

	    public void setFechaNacimiento(LocalDate fechaNacimiento) {
	        this.fechaNacimiento = fechaNacimiento;
	    }

	    public String getProvincia() {
	        return provincia;
	    }

	    public void setProvincia(String provincia) {
	        this.provincia = provincia;
	    }
		
		
	    //métodos de acciones 
	    //calcular la edad 
	    public int calcEdad() {
	    	return Period.between(this.fechaNacimiento, LocalDate.now()).getYears(); 
	    }
	    
	    //si es mayor de edad
	    public boolean mayorEdad() {
	    	return this.calcEdad() >=18; 
	    }
	    
	    //método para mostrar los datos de la persona
	    public void mostrarDatos() {
	        System.out.println("DNI: " + this.dni);
	        System.out.println("Nombre: " + this.nombre);
	        System.out.println("Fecha de Nacimiento: " + this.fechaNacimiento);
	        System.out.println("Provincia: " + this.provincia);
	        System.out.println("Edad: " + this.calcEdad());
	        if (this.mayorEdad()) {
	            System.out.println("La persona es mayor de edad.");
	        } else {
	            System.out.println("La persona no es mayor de edad.");
	        }
	    }
	    
	}
