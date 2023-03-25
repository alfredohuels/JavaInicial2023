package Clase1;

public class Ejercicio2d {

	public static void main(String[] args) {
				
		double Ingresos = 489082.999;  //  Variable para Ingresos mensuales
		int CantVehiculos = 2;  //  Variable para Cantidad de Vehiculos mayor a 5 años
		int CantInmuebles = 2;  //  Variable para Cantidad de Inmuebles
		boolean Embarcacion = true;  //  Variable por si posee Embarcacion
		boolean Aeronave = true;  //  Variable por si posee Aeronave
		boolean PActSoc = true;  //  Variable por si posee Activos Societarios
		
		if((Ingresos >= 489083)||(CantVehiculos >= 3)||(CantInmuebles >= 3)||(Ingresos >= 489083)||(Embarcacion == Aeronave == PActSoc)) {
			System.out.println("Ud. pertenece al segmento de ingresos altos");
		}  // Fin if True
		else {
			System.out.println("Ud. NO pertenece al segmento de ingresos altos");
		     }	//  Fin else	
		
	}  // Fin public static void main(String[] args)

}  // Fin public static void main(String[] args) 
