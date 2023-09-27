package u1ejerciciosp2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//Declaro la variable "edad" como "int" porque es un numero entero.
		int edad;
		
		//Declaro la variable "sol" como "boolean" porque nuestra respuesta debe de ser "true" or "false".
		boolean sol;
		
		//Creamos el Scanner.
		Scanner sc = new Scanner(System.in);
		
		//Le pedimos al usuario que introduzca su edad actual.
		System.out.println("Introduce tu edad actual: ");
		
		//Leemos la edad del teclado.
		edad = sc.nextInt();
		
		//Realizamos las intrucciones utilizando operadores para calcular la solución.
		sol = edad>=18 || edad>18;
		
		//Mostramos la solución entre dos opciones "true" or "false".
		System.out.println("¿Es mayor de edad?: " + sol);
		
		//Cierre
		sc.close();
	}

}
