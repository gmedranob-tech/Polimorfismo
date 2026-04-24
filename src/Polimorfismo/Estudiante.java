package Polimorfismo;

//Clase hija que hereda de Persona
//Agrega carnet y carrera y sobrescribe presentarse()

public class Estudiante extends Persona {

	String carnet;
	String carrera;
	
	
	public Estudiante(String carnet, String carrera) {
		this.carnet = carnet;
		this.carrera = carrera;
	}

	@Override
	public void presentarse() {
		System.out.println("Soy estudiante, carnet: " + carnet + " carrera: " + carrera);
	}	
}
