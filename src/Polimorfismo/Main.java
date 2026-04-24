package Polimorfismo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// EJERCICIO 1
    System.out.println("\n***EJERCICIO 1***");
    
	Animal animal = new Perro();
	animal.hacerSonido();
	
	// EJERCICIO 2
    System.out.println("\n***EJERCICIO 2***");
    
	Figura figura = new Rectangulo(4,5);
	
	System.out.println ("Área: " + figura.area());
	
	// EJERCICIO 3
    System.out.println("\n***EJERCICIO 3***");
    
	Empleado empleado = new Vendedor("Gabriela", 500);
	empleado.resumen();
	
	// EJERCICIO 4
    System.out.println("\n***EJERCICIO 4***");
    
	Cuenta cuenta = new CuentaAhorro(100);
	
	cuenta.depositar(50);
	System.out.println("Saldo:" + cuenta.saldo);
	
	// EJERCICIO 5
    System.out.println("\n***EJERCICIO 5***");
    
	Transporte transporte = new Avion();
	transporte.moverse();
	
	// EJERCICIO 6
    System.out.println("\n***EJERCICIO 6***");
    
	Persona persona = new Estudiante("0905 25 9001", "Ingeniería en Sistemas");
	persona.presentarse();
	
	// EJERCICIO 7
    System.out.println("\n***EJERCICIO 7***");
    
	Vehiculo vehiculo = new Motocicleta();
	vehiculo.encender();
	
	// EJERCICIO 8
    System.out.println("\n***EJERCICIO 8***");
    
	Producto producto = new ProductoDigital("Curso Java", 150.0, "PDF");
	producto.mostrarDescripcion();
	
	// EJERCICIO 9
    System.out.println("\n***EJERCICIO 9***");
	
    Instrumento instrumento = new Guitarra();
	instrumento.tocar();
	
	// EJERCICIO 10 
    System.out.println("\n***EJERCICIO 10***");
	
   Trabajador trabajador = new TrabajadorPorHora(8, 25);
   System.out.println("Pago: " + trabajador.calcularPago());
  
	}	
}
