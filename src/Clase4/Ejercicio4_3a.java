package Clase4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ejercicio4_3a {
	public static void main(String[] args) {
		
		String operacion ="decodificar";
		int desplazamiento = 2;
/*		String archivoEntrada = "src/PalabrasOk.txt";
		String archivoSalida = "src/PalabrasCodificadas.txt";*/
		String archivoSalida = "src/PalabrasOk.txt";
		String archivoEntrada = "src/PalabrasCodificadas.txt";

		String resultado = "";
		String resultadoOperacion = "La operacion fue exitosa";
		
		try {
			for(String linea : Files.readAllLines(Paths.get(archivoEntrada))) {
				if(operacion.equals("codificar")) {
 					resultado = resultado + codificar(linea, desplazamiento);
				}
				else if(operacion.equals("decodificar")) {
					resultado = resultado + decodificar(linea, -desplazamiento);
				}
			}
			Files.writeString(Paths.get(archivoSalida), resultado);	
		}
		catch (IOException e) {
			 resultadoOperacion = "hubo un error en la operacion";			
		}
		
		
		System.out.println(resultadoOperacion);
		
	}
	
	
	public static String codificar (String cadena, int nroDesplazamiento) {
		String nueva = "";
		for (int i = 0; i < cadena.length(); i++) {
			nueva = nueva + siguienteCaracter (cadena.charAt(i), nroDesplazamiento);			
		}
		return nueva;
	}
	
	public static String decodificar (String cadena, int nroDesplazamiento) {
		String nueva = "";
		for (int i = 0; i < cadena.length(); i++) {
			nueva = nueva + siguienteCaracter (cadena.charAt(i), nroDesplazamiento);			
		}
		return nueva;
	}
	
	public static char siguienteCaracter(char letra, int nroDesplazamiento) {
		String abc = "abcdefghijklmnñopqrstuvwxyz -";
		char letraSiguiente = '-';
		for (int i = 0; i < abc.length(); i++) {
			if(abc.charAt(i)==letra) {
				int pos = i + nroDesplazamiento;
				if(pos >= abc.length()) {
					pos = pos - abc.length();
				}
				else if(pos < 0) {
					pos = abc.length() + pos;
				}
				letraSiguiente = abc.charAt(pos);
			}			
		}
		return letraSiguiente;
	}
	
	

}
