// Ejercicio 1 - c
// A lo anteror, con una variable externa, elija si
// dedeben mostrar lo pares o impares

package Clase1;

public class Ejercicio1c {

	public static void main(String[] args) {

		int numeroInicio = 5; 
		int numeroFin = 14; 
		Boolean Par = true;		
			while (numeroInicio <= numeroFin) {
				
				if(((numeroInicio % 2) == 0) == Par) {
			      System.out.println(numeroInicio);
				} // Fin if(numeroInicio % 2 == 0) 	  
				
			    numeroInicio ++;
			    
			} //  Fin while (numeroInicio < numeroFin)

		} // Fin public static void main(String[] args)

} // Fin public class Ejercicio1c	