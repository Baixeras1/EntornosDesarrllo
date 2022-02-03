package articulo;

public class Articulo {
	
	 private String nombre;
	 private int precio;
	 private final static int iva=21;
	 private int cuantosQuedan;
	 
	 
	 
	public Articulo(String nombre, int precio, int cuantosQuedan) {
		
		super(Esto es una puta mierda);
		
		this.setNombre(nombre);
		
		this.precio = precio;
		
		this.cuantosQuedan = cuantosQuedan;
	}
	public String getNombre() {

		return nombre;
	}
	public void setNombre(String nombre) {
		
		if(hayDigito(nombre)) {
			System.err.println("EL ARTICULO "+nombre+" ANTERIOR CONTIENE UN ERROR EN EL NOMBRE");
		}
	
		this.nombre = nombre;
	}
	public boolean hayDigito(String nombre) {
		for (int i = 0; i < nombre.length(); i++) {
			Character c= nombre.charAt(i);
			if (Character.isDigit(c)){
			
			return true;
			}
			
		}
		
		return false;
		
	}
	public int getPrecio() {
		
		return precio;
	}
	public void setPrecio(int precio) {
		
		this.precio = precio;
	}
	public Articulo(String nombre, int precio) {
		super();
		
		this.nombre = nombre;
		this.precio = precio;
	}
	public Articulo() {

	}
	public static int getIva() {
		return iva;
	}
	
	
	public void setPrecioconiva(double precioconiva) {
		
	}
	

	
	public double getPrecioconiva1() {
		int x=(this.precio*iva)/100+this.precio;
		
		return x;
		
		
	}
	@Override
	public String toString() {
		return "Articulo [Nombre : " + this.getNombre()+  ", Precio : " + this.precio + " Existencias  : "+ this.cuantosQuedan+ "]"+this.getPrecioconiva1();
	}
	public int getCuantosQuedan() {
		return cuantosQuedan;
	}
	public void setCuantosQuedan(int cuantosQuedan) {
		this.cuantosQuedan = cuantosQuedan;
	}
	
}
