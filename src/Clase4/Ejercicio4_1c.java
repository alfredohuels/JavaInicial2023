package Clase4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4_1c { 
	
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
				} 
				else if(orden.equals("desc")) {
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

	
	
	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 0;
        int n3 = 0;
        String orden = "";
		
		if(args.length < 4) {
            Scanner scn = new Scanner(System.in);
			
			System.out.println("Ingrese el primer numero");
            n1 = Integer.parseInt(scn.nextLine());
			
            System.out.println("Ingrese el segundo numero");
            n2 = Integer.parseInt(scn.nextLine());
            
            System.out.println("Ingrese el tercer numero");
            n3 = Integer.parseInt(scn.nextLine());
            
            System.out.println("Ingrese el orden");
            orden = scn.nextLine();			

		}
		else {
			n1 = Integer.parseInt(args[0]);
			n2 = Integer.parseInt(args[1]);
			n3 = Integer.parseInt(args[2]);
			orden = args[3];
			
		}
		
        System.out.println(Arrays.toString(ordenarNumeros(n1,n2,n3,orden)));
        
	}

}
