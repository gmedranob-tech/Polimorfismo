package Polimorfismo;

//Clase hija que hereda de Transporte
//Sobrescribe el método moverse()

public class Avion extends Transporte {

    @Override
    public void moverse() {
        System.out.println("El avion vuela");
    }
}
	

