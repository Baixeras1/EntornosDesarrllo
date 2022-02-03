package ejercicio3;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {

		int va = 3;
		int vb = 2;
		int vc = 15;
		
		double resultado = (Math.pow((va + vb),2) - vc) / vb * 5;
		
		System.out.println(resultado);
		
		System.out.println((5 - 2 > 4) && !(0.5 == 1/2));
		
		int x = 1;
		int y = 4;
		int z = 10;
		final float pi = (float) 3.14;
		float e = (float) 2.71;
		
		double resultado2 = 2 * x + 0.5 + y - 1.0/5.0 * z;
		
		System.out.println(resultado2);
		
		boolean resultado3 = pi * Math.pow(x, 2) > y || 2 * pi * x <= z;
		
		System.out.println(resultado3);
		
		int a = 20;
		int b = 4;
		
		int suma = a + b;
		int resta = a - b;
		int multiplicacion = a * b;
		int division = a / b;
		int modulo = a % b;
		
		System.out.println("La suma es: " + suma);
		System.out.println("La resta es: " + resta);
		System.out.println("La multiplicacion es: " + multiplicacion);
		System.out.println("La division es: " + division);
		System.out.println("El resto es: " + modulo);
		
		if (a > b) {
			System.out.println("El mayor es: " + a);
		}else {
			System.out.println("El mayor es: " + b);
		}
		
		int lado = 5;
		
		double area = Math.pow(lado, 2);
		
		System.out.println("El area del cuadrado es: " + area);
		
		
		int dia = 24;
		
		System.out.println("En 10 años hay: " + ((dia * 365) * 10) + " horas");
		
		int A = 4;
		int B = 2;
		int C = 3;
		
		A = B;
		C = A;
		B = (A + B + C) / 2;
		A = A + C;
		C = B - A;
		C = C - A;
		A = A * B;
		A = A + 3;
		A = A % B;
		C = C + A;
		
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		

		
		Scanner sc = new Scanner(System.in);
		double Lado;
		
		System.out.println("Ingrese el lado del cuadrado: ");
		Lado = sc.nextDouble();
		System.out.println("El area del cuadrado es: " + Math.pow(Lado, 2));
		
		sc.close();
		
		
		
	}
	
	

}
