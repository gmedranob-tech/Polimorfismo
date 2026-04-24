package Polimorfismo;

//Clase hija que hereda de Producto
//Agrega formato y sobrescribe mostrarDescripcion()

public class ProductoDigital extends Producto {
	
	String formato;

	public ProductoDigital(String nombre, double precio, String formato) {
		super(nombre, precio);
		this.formato = formato;
	}
	
	@Override 
	public void mostrarDescripcion() {
		System.out.println("Producto digital: " + nombre + "Precio: " + precio + "Formato: " + formato);
	}

}
