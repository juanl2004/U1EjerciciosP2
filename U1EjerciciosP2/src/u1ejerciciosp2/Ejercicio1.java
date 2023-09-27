package u1ejerciciosp2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//Declaramos la constante precio de manzana.
		 final float PRECIO_MANZANA = 2.35f;
		 
		//Declaramos la constante precio de PERAS.
		 final float PRECIO_PERA = 1.95f;
		
		//Declaramos la variable kg de manzanas.
		 float kgManzanas;
		 
		//Declaramos la variable kg de peras.
		 float kgPeras;
		 
		 //Declaramos la variable del total de la suma.
		 float total;
		 
		 //Creamos el Scanner.
		 Scanner sc = new Scanner(System.in);
		 
		 //Le pedimos al usuario que intruzca el numero de kg de manzanas.
		 System.out.println("Introduzca los kg de manzanas: ");
		 
		 //Leemos los kg de manzanas del teclado.
		 kgManzanas = sc.nextFloat();
		 
		//Le pedimos al usuario que intruzca el numero de kg de peras.
		 System.out.println("Introduzca los kg de peras: ");
		 
		 //Leemos los kg de peras del teclado.
		 kgPeras = sc.nextFloat();
		 
		 //Realizamos las operaciones para calcualar el total.
		 total = PRECIO_MANZANA * kgManzanas + PRECIO_PERA * kgPeras;
		 
		 //Damos la solución (suma total de manzanas y peras).
		 System.out.println("El importe total es de: " + total);
		 
		 //Cierre
		 sc.close();
		 

	}

}
