package Ejercicio;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		int a,b,c;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero entero");
		a = sc.nextInt();
		System.out.println("Introduce el siguiente numero entero");
		b = sc.nextInt();
		System.out.println("Introduce el tercer numero entero");
		c = sc.nextInt();
		
		System.out.println("Los valores leidos son: " + a + "" + b + "" + c + "");
		
		if ((a > b) && (a > c)) {System.out.println("a es el mayor de los 3");}
		else if ((b > a ) && (b > c)) {
		System.out.println("b es el mayor de los 3");}
		else {System.out.println("c es el mayor de los 3");}
	}
}
