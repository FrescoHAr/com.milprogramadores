/*Ejercicio N� 4
 * Crea una clase llamada Contador que contenga un �nico atributo entero llamado
 * cont. La clase tendr� los siguientes constructores: Constructor por defecto
 * Constructor con par�metros para inicializar el contador con un valor no negativo. Si
 * el valor inicial que se recibe es negativo el contador tomar� el valor cero como valor
 * inicial. Constructor copia. Adem�s de los m�todos getter y setter, la clase contendr�
 * los m�todos: incrementar: incrementa el contador en una unidad. decrementar:
 * decrementa el contador en una unidad. El contador nunca podr� tener un valor
 * negativo. Si al decrementar se alcanza un valor negativo el contador toma el valor cero.

 */
package com.milprogramadores.clase1y2;

public class Contador {
	private  int cont;
	public Contador(int cont) {
		if(cont>0)
			this.cont = cont;
		else 
			this.cont =0;
	}
	
	public Contador() {
		this.cont=0;
	}
	
	public int getCont() {
		return cont;
	}
	public void setCont(int cont) {
		this.cont = cont;
	}
	
	public void incrementar()
	{
		this.cont++;
	}
	
	public void decrementar() {
		if(this.cont !=0)
			this.cont--;
	}
}
