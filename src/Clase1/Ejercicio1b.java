// Ejercicio 1 - b
// A lo anteror, Solo muestre los números pares: 
// 6,8,10,12,14

package Clase1;

public class Ejercicio1b {

	public static void main(String[] args) {

		int numeroInicio = 5; 
		int numeroFin = 14; 
		
			while (numeroInicio <= numeroFin) {
				
				if (numeroInicio % 2 == 0) {
			      System.out.println(numeroInicio);
				} // Fin if(numeroInicio % 2 == 0) 	  
				
			    numeroInicio ++;
			    
			} //  Fin while (numeroInicio <= numeroFin)

		} // Fin public static void main(String[] args)

} // Fin public class Ejercicio1b	
