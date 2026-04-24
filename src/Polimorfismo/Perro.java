package Polimorfismo;

public class Perro extends Animal {
	
@Override
public void hacerSonido() {
	System.out.println ("El perro ladra"); 
 	}
}

//Herencia: Perro hereda de Animal usando extends
//Método sobrescrito: hacerSonido() en la clase Perro
//Polimorfismo: usamos Animal miAnimal = new Perro();
//Caso de prueba: al ejecutar debe imprimir "El perro ladra"