package Polimorfismo;

//Clase hija que hereda de Empleado
//Agrega comision y sobrescribe resumen

public class Vendedor extends Empleado {
	 
	double comision;

	public Vendedor(String nombre, double comision) {
		super(nombre);
		this.comision = comision;
	}
	
	@Override
	public void resumen() {
		System.out.println("Vendedor:" + nombre  + "- comision " + comision);
		
	}
}
	



