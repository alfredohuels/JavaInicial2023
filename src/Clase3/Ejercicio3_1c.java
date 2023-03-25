package Clase3;

public class Ejercicio3_1c {

	public static void main(String[] args) {
	
	int[] vector = new int[] {7,9,3,6,11,22,33};  
	System.out.println(sumaParcial(vector, 1));
	
		
	}	
	
	public static int sumaParcial(int[] lista, int numero) {
		int resultado = 0;
		for (int i = 0; i < lista.length; i++) {
			if(lista[i] > numero) {
				resultado = resultado+lista[i];
			}
		}
		
		return resultado;		
	}
	
	
}
