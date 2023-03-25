package Clase4;

import java.util.Arrays;

public class Ejercicio4_1a {
	
// 1 abrir terminal nueva
	
	
// 2 me voy a la ubicacion de la clase	
//	    C:\Users\VAIO\Desktop\JavaInicial2023\JavaInicial2023\src\Clase4
	
	// 3 me voy a compilar el archivo java
	// 4 voy a ejecutar la clase y el metodo main con los argumentos que yo quiera
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(args));
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		int n3 = Integer.parseInt(args[2]);
		String orden = args[3];
		System.out.println(Arrays.toString(ordenarNumeros(n1,n2,n3,orden)));
	}
	
	public static int[] ordenarNumeros (int n1, int n2, int n3, String orden) {
		   
		int[] vector = new int[] {n1,n2,n3};  // no esta ordenado 
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
