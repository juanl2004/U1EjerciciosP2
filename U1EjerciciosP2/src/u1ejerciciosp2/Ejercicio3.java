package u1ejerciciosp2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
	
	//	Declaramos la variable "num" como "int" ya que siempre sera un numero entero.
	int num;
	
	// Declaramas la variable "sol" como "boolean" porque nuestra solución sera "true" or "false".
	boolean sol;
	
	//Creamos el Scanner.
	Scanner sc = new Scanner(System.in);
	
	//Le pedimos al usuario que escriba un numero.
	System.out.println("Escribe un numero: ");
	
	//Leemos el numero del teclado.
	num = sc.nextInt();
	
	//Intrucciones para calcular si el numero introducido es par.
	sol = num % 2 == 0;
	
	//Mostramos la solución.
	System.out.println("¿El numero es par?: " + sol);
	
	//Cierre
	sc.close();
	
	}

}
