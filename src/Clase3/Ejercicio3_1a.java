package Clase3;

public class Ejercicio3_1a {	
		
	public static void main(String[] args) {		
	   int cantidad = cantidadDeApariciones("banana",'a');			
	   if (cantidad == 1) {
		   System.out.println("Aparece "+cantidad+" vez");
	   }	
	   else {System.out.println("Aparece "+cantidad+" veces");	
	   }
	}

	public static int cantidadDeApariciones(String palabra, char letra) {
		System.out.println("Palabra: "+String.valueOf(palabra)+" y la letra a buscar es: "+letra); 
		int cantidaDeLetras = 0;
		for (int i = 0; i < palabra.length(); i++) {
			if(palabra.charAt(i)==letra) {
				cantidaDeLetras++;
	    	}		
		}
		return cantidaDeLetras;		
	}
}

	


