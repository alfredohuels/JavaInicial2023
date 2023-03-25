package Clase4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ejercicio4_2a {
	
	public static void main(String[] args) {
		
	//	String archivo = args[0];   // Para operar por terminal
	//	String operacion = args[1];  // Para operar por terminal
	//	String archivo = "numeros.txt";   // Para operar por terminal
		String archivo = "src/numeros.txt";
		String operacion = "producto";

		int acumulador = 0;
		if(operacion.equals("producto")) { acumulador = 1; }
		try {
			for (String linea : Files.readAllLines(Paths.get(archivo))) {
				 if(operacion.equals("suma")) {
					 acumulador = acumulador + Integer.parseInt(linea);
					 }
				 if(operacion.equals("producto")) {
					 acumulador = acumulador * Integer.parseInt(linea);
				 }
				
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(acumulador);
		
		
	}

}
