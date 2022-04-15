/* Ejercicio N� 2
 * Crear una clase llamada Cuenta que tendr� los atributos: 
 * 		titular (que es una persona) y 
 * 		cantidad (puede tener decimales). 
 * El titular ser� obligatorio y la cantidad es opcional. Construye los siguientes m�todos para la clase:
 * 	Un constructor;
 * 	mostrar(): Muestra los datos de la cuenta;
 * 	ingresar(cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no se har� nada;
 * 	retirar(cantidad): se retira una cantidad a la cuenta. La cuenta puede estar en n�meros rojos.
 */


package com.milprogramadores.Modulo2TP2;
import com.milprogramadores.Modulo2TP1.Persona;

public class Cuenta {
	private Persona titular;
	private double cantidad;
	
	public Cuenta(String nombre, String apellido, String dni, String domicilio, double cantidad) {
		this.titular= new Persona(nombre,apellido,dni,domicilio);
		this.cantidad = cantidad;
	}
	
	public Cuenta(String nombre, String apellido, String dni, String domicilio) {
		this.titular= new Persona(nombre,apellido,dni,domicilio);
		this.cantidad = 0;
	}
	
	public Cuenta(Persona persona, double cantidad) {
		this.titular=persona;
		this.cantidad=cantidad;
	}
	
	public Cuenta(Persona persona) {
		this.titular=persona;
		this.cantidad = 0;
	}
	
	public void mostrar() {
		System.out.println(titular+"\nCantidad= "+this.cantidad);
	}
	
	public void ingresar(double cantidad) {
		if(cantidad>0)
			this.cantidad+=cantidad;
	}
	
	public void retirar(double cantidad) {
		this.cantidad-=cantidad;
	}

}
