package Clase3;

public class Ejercicio3_2_New {

public static void main(String[] args) {
	
	String cadena = "hola a todos";
	String cadenaCodif = codificar(cadena, 2);
	String cadenaDecodif = decodificar (cadenaCodif,-2);
			
	System.out.println("Frase original------: "+cadena);
	System.out.println("Frase codificada----: "+cadenaCodif);
	System.out.println("Frase decodificada--: "+cadenaDecodif);	
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
