package Polimorfismo;

//Clase hija que hereda de Instrumento
//Sobrescribe el método tocar()

public class Guitarra extends Instrumento {

	@Override
    public void tocar() {
        System.out.println("La Guitarra suena");
	}
}
	
