package Polimorfismo;

//Herencia: Rectangulo hereda de Figura
//Método sobrescrito: area()
//Polimorfismo: Figura figura = new Rectangulo(4,5)

public class Rectangulo extends Figura {
	
	double base;
	double altura;
	
	public Rectangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double area() {
		return base * altura;
		
	}

}


