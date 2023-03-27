package Clase5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

public class Inicio {

	public static void main(String[] args) {

		String archivoEntrada = "src/compras.txt";
		try {
			List<String> lista = Files.readAllLines(Paths.get(archivoEntrada));
            System.out.println(lista.get(1));
            String[] datosProducto1 = lista.get(1).split(" "); // 40 jabon 123f, con split (" ") == (40, jabon, 123f)
            String[] datosProducto2 = lista.get(2).split(" ");
            String[] datosProducto3 = lista.get(3).split(" ");
            
            System.out.println(lista.get(1));
             
            Producto producto1 = new Producto(datosProducto1[1], datosProducto1[2], Float.parseFloat(datosProducto1[0]));
            Producto producto2 = new Producto(datosProducto2[1], datosProducto2[2], Float.parseFloat(datosProducto2[0]));
            Producto producto3 = new Producto(datosProducto3[1], datosProducto3[2], Float.parseFloat(datosProducto3[0]));
            
            Carrito carrito = new Carrito(producto1, producto2, producto3, LocalDateTime.parse("2023-01-13T11:22:00"));

            Persona persona1 = new Persona("Alfredo", "Huels", LocalDateTime.parse("1971-02-01T12:00:00"), carrito);
            Persona persona2 = new Persona("Fer", "Rios", LocalDateTime.parse("1978-03-13T08:20:00"), carrito);
            Persona persona3 = new Persona("Mauro", "Huels", LocalDateTime.parse("2005-05-18T22:20:00"), carrito);
 
            Carrito miCarrito = persona1.getCarrito();
            float resultado = miCarrito.costoFinal();
            System.out.println(resultado);
            System.out.println(persona1.getNombre()+" "+persona1.getApellido()+" tiene "+persona1.edad()+" años");
            System.out.println(persona2.getNombre()+" "+persona2.getApellido()+" tiene "+persona2.edad()+" años");
            System.out.println(persona3.getNombre()+" "+persona3.getApellido()+" tiene "+persona3.edad()+" años");
            		
		}catch(IOException e) {
			System.out.println("hubo un error en la operacion "+e);
		}
        
	}

}
