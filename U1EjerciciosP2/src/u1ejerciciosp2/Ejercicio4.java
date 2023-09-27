package u1ejerciciosp2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
	
		// Declaramas la variable "puedeSalirCalle" como "boolean" porque nuestra solución sera "true" or "false".
		boolean puedeSalirCalle;
		
		// Declaramas la variable "lluvia" como "boolean" porque nuestra solución sera "true" or "false".
		boolean lluvia;
		
		// Declaramas la variable "finalizarTareas" como "boolean" porque nuestra solución sera "true" or "false".
		boolean finalizarTareas;

		// Declaramas la variable "irBiblioteca" como "boolean" porque nuestra solución sera "true" or "false".
		boolean irBiblioteca;
		
		// Creamos el Scanner.
		Scanner sc = new Scanner(System.in);
		
		//Pedir al usuario si esta lloviendo, "true" si ha terminado, "false" si no.
		System.out.println("¿Esta lloviendo? Resp: (True) o (False)");
		
		// Leer la solución del teclado.
		lluvia = sc.nextBoolean();
		
		//Pedir al usuario si ha terminado sus tareas, "true" si ha terminado, "false" si no.
		System.out.println("¿Has terminado las tareas? Resp: (True) o (False)");
		
		// Leer la solución del teclado.
		finalizarTareas = sc.nextBoolean();
		
		//Pedir al usuario si necesita ir a la biblioteca, "true" si ha terminado, "false" si no.
		System.out.println("¿Necesitas ir a la biblioteca? Resp: (True) o (False)");
		
		// Leer la solución del teclado.
		irBiblioteca = sc.nextBoolean();
		
		//Utilizamos operadores logicos para saber si podemos o no salir a la calle.
		puedeSalirCalle = (!lluvia && finalizarTareas) || irBiblioteca;
		
		// Mostramos la solución.
		System.out.println("¿Puedo salir a la calle? " + puedeSalirCalle);
		
		//Cierre
		sc.close();
		
	}

}
