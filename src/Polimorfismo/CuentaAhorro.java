package Polimorfismo;

public class CuentaAhorro extends Cuenta {

	public CuentaAhorro(double saldo) {
		super(saldo);
	}

	@Override
	public void depositar(double monto) {
		double interes = monto * 0.10;
		saldo += monto + interes;

	}
}
