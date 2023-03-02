package org.iesalandalus.programacion.alquilervehiculos.modelo.dominio;



public class Turismo extends Vehiculo {

	private int cilindrada;
	public Turismo(String marca, String modelo, int cilindrada, String matricula) {
		super();
		setMarca(marca);
		setModelo(modelo);
		setCilindrada(cilindrada);
		setMatricula(matricula);

	}

	public Turismo(Turismo turismo) {
		super();
		if (turismo == null) {
			throw new NullPointerException("ERROR: No es posible copiar un turismo nulo.");
		}
		setMarca(turismo.getMarca());
		setModelo(turismo.getModelo());
		setCilindrada(turismo.getCilindrada());
		setMatricula(turismo.getMatricula());
	}

	public int getCilindrada() {
		return cilindrada;
	}

	private void setCilindrada(int cilindrada) {
		if ((cilindrada <= 0) || (cilindrada > 5000)) {
			throw new IllegalArgumentException("ERROR: La cilindrada no es correcta.");
		}
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return String.format("%s %s (%sCV) - %s", marca, modelo, cilindrada, matricula);
	}

}