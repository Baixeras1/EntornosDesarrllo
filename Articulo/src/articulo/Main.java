package articulo;

import java.util.Scanner;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Articulo a= new Articulo();
		System.out.println("Introduzca el nombre : ");
		a.setNombre(sc.nextLine());
		sc.nextLine();
		System.out.println("Introduzca el precio en € : ");
		a.setPrecio(sc.nextInt());
		System.out.println("Introduzca existencias restantes : ");
		a.setCuantosQuedan(sc.nextInt());
	
		System.out.println("El precio con iva de a es: "+ a.getPrecioconiva1()+"€ "+a.toString());
		
				
	
	 Articulo a1= new Articulo("Nara3nja", 17,10);
	 Articulo a2= new Articulo("Manzana",20,25);
	 
	 
	 System.out.println("El precio con de a1  iva es: "+ a1.getPrecioconiva1()+"€ "+a1.toString());
	 System.out.println("El precio con iva de a2  es: "+ a2.getPrecioconiva1()+"€ "+a2.toString());
	
	 
	 
	 

	}

}
