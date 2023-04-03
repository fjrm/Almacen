package almacen;

import java.util.Scanner; 

public class Almacen {

    public static void main(String[] args) {

        //Lee la entrada del usuario y lo almacena en la variable consola
        Scanner consola = new Scanner(System.in); 
        
        double precio, descuentoAplicado, precioFinal;

        //Imprime el mensaje introducido por el usuario
        System.out.println("Introduzca el precio de la compra: ");
        
        precio = consola.nextDouble();
        
        if(precio > 100){
            descuentoAplicado = precio * 0.8;
        }else if (precio == 100){
            descuentoAplicado = precio * 0.25;
        }else{
            descuentoAplicado = precio * 0.05;
        }

        precioFinal = precio - descuentoAplicado;
        
        System.out.println("Precio inicialmente introducido: " + precio + " €");
        System.out.println("Descuento aplicado: " + descuentoAplicado + " €");
        System.out.println("Precio final con el descuento aplicado: " + precioFinal + " €");
        
    }
    
}
