package Polimorfismo;

//Clase hija que hereda de Trabajador
//Calcula el pago según horas trabajadas

public class TrabajadorPorHora extends Trabajador {

	 int horas;
	 double pagoPorHora;
	  
	 public TrabajadorPorHora(int horas, double pagoPorHora) {
			this.horas = horas;
			this.pagoPorHora = pagoPorHora;
	 }	
	 
	 @Override
	 public double calcularPago() {
	        return horas * pagoPorHora;
	    }
	}


