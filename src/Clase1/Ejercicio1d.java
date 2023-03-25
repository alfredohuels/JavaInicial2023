// Utilizando la sentencia for, hacer lo mismo que en (b)
// pero invirtiendo el orden

package Clase1;

public class Ejercicio1d {
	
	public static void main(String[] args) {

		int numeroInicio = 5; 
		int numeroFin = 14; 
		
		for(int i=numeroFin; i >= numeroInicio; i--) {
				
			if (i % 2 == 0) {
			    System.out.println(i);
			} // Fin if(i % 2 == 0) 	  
				
		} //  Fin for (int i=numeroFin; i >= numeroInicio; i--)

	} // Fin public static void main(String[] args)
	
} // Fin public class Ejercicio1d
