package org.iesalandalus.programacion.alquilervehiculos.modelo.negocio;

import java.time.LocalDate;
import java.util.List;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Alquiler;
import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Cliente;
import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Vehiculo;

public interface IAlquileres {

	public List<Alquiler> get();

	public List<Alquiler> get(Cliente cliente);

	public List<Alquiler> get(Vehiculo vehiculo); // ERROR DEL DIAGRAMA DE CLASES, en el parametro pasado

	public int getCantidad();

	public void insertar(Alquiler alquiler) throws OperationNotSupportedException; // Si queremos que salte una
																					// excepcion obligatoria en el
																					// metodo que heradara una clase
																					// hija, hay que definirlo en la
																					// interfaz

	public void devolver(Cliente cliente, LocalDate fechaDevolucion) throws OperationNotSupportedException;

	public void devolver(Vehiculo vehiculo, LocalDate fechaDevolucion) throws OperationNotSupportedException;

	public Alquiler buscar(Alquiler alquiler);

	public void borrar(Alquiler alquiler) throws OperationNotSupportedException;
}
