package Clase3;

public class Ejercicio3_2 {

	public static void main(String[] args) {
		
		String cadena1 = "hola que tal xyz";
	    
	    System.out.println(cadena1);
	    
    	System.out.println("Cadena sin espacios: "+sacarEspacio (cadena1));
	  
	    System.out.println("Cadena codificada1 : "+desplazar1(sacarEspacio (cadena1)));	
	    
	    System.out.println("Cadena codificada2 : "+desplazar2(sacarEspacio (cadena1)));	
	    
	    System.out.println(String.valueOf(cadena1));
	}
	
	
	public static String sacarEspacio(String cadena) {
	String[] cadenaNueva = cadena.split(" ");
	String cadenaSinEsp = "";
		for(int i=0; i < cadenaNueva.length; i++)	    	
			      cadenaSinEsp = cadenaSinEsp+cadenaNueva[i];
			return cadenaSinEsp;
		}
		
		public static String desplazar1(String cadena) {
			char alfabeto[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z','a','b'};
		    String cadenaCodif = "";
	 	    for( int i = 0; i < cadena.length(); i++) {
		    	for(int j = 0; j < 27; j++) {
					if(alfabeto[j] == cadena.charAt(i)) {
		//            	System.out.println(alfabeto[j+2]+" "+(j+1));
		            	cadenaCodif = cadenaCodif + alfabeto[j+1];	              
		            }

		    	}
	 	    }	
		    return cadenaCodif;
		}	
		
		public static String desplazar2(String cadenaV) {
			char alfabeto[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z','a','b'};
			String cadenaCodif = "";
	 	    for( int i = 0; i < cadenaV.length(); i++) {
		    	for(int j = 0; j < 27; j++) {
		            if(alfabeto[j] == cadenaV.charAt(i)) {
//		            	System.out.println(alfabeto[j+2]+" "+(j+2));
		            	cadenaCodif = cadenaCodif + alfabeto[j+2];	              
		            }
		    	}
	 	    }	
		    return cadenaCodif;
		}	
		
	}

