package Polimorfismo;

//Clase base que representa un producto
//Tiene nombre, precio y un método para mostrar descripción

public class Producto {

	protected String nombre;
	protected double precio;
	
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public void mostrarDescripcion() {
		System.out.println("Producto: " + nombre + " Precio: " + precio);
	}
}
