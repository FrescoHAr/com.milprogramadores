/*Ejercicio N� 3
 * Usando la clase persona del ejercicio 1 crear una clase empleado que deber� tener el atributo 
 * 		sueldo b�sico. 
 * Implementar los m�todos:
 * 		calculoSueldo(): este se calcula como la cantidad de horas trabajadas por el sueldo b�sico
 * 		verEmpleado(): visualiza los datos del empleado.
 */

package com.milprogramadores.Modulo2TP2;
import com.milprogramadores.Modulo2TP1.Persona;

public class Empleado extends Persona{
	private double sueldoBasico;
	
	public Empleado(String nombre, String apellido, String dni, String domicilio, double sueldoBasico) {
		super(nombre, apellido, dni, domicilio);
		this.sueldoBasico=sueldoBasico;
	}
	
	public double calculoSueldo(int horas) {
		return this.sueldoBasico*horas;
	}
	
	public void verEmpleado() {
		System.out.println(super.toString());
		System.out.println("Sueldo Basico= "+sueldoBasico);
	}

}
