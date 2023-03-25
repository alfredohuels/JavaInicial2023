package Clase3;

import java.util.Arrays;

public class Ejercicio3_1b {
	
	public static void main(String[] args) {
		 
		int[] numerosOrdenados = ordenarNumeros(1,9,6,5,2,7, "asc"); // [1,6,9]
		System.out.println("Cadena ordenada ascendentemente:");
		System.out.println(Arrays.toString(numerosOrdenados));
		
		numerosOrdenados = ordenarNumeros(1,9,6,5,2,7, "desc"); // [1,6,9]
		System.out.println("Cadena ordenada descendentemente:");
		System.out.println(Arrays.toString(numerosOrdenados));

	} // Fin public static void main(String[] args) 
	
	public static int[] ordenarNumeros (int n1, int n2, int n3, int n4, int n5, int n6, String orden) {
	   
		int[] vector = new int[] {n1,n2,n3,n4,n5,n6};  // no esta ordenado 
		for(int i = 0; i < vector.length; i++) {
			for(int j = i+1 ; j < vector.length; j++) {
				if(orden.equals("asc")) {
			         if(vector[i] > vector[j]) {
			    	     int temp = vector[i];
			    	     vector[i] = vector[j];
			    	     vector[j] = temp;			    	  
			         }
				} else if(orden.equals("desc")) {
			         if(vector[i] < vector[j]) {
			    	     int temp = vector[i];
			    	     vector[i] = vector[j];
			    	     vector[j] = temp;		
			         }    
				}
			}
		}
		
		return vector;
	}
}