package Interfaces;

import java.util.List;

import ClaseNormal.Clientes;

//interface es una plantilla para declarar metodos bacios - abstractos
public interface Metodos {

	// Metodos:
	// 1---Funciones, siempre tiene un valor de retono
	// El valor de retorno---que tipo de dato vas a retornar
	// Si va a tener parametros, cuantos y de que tipo

	// 2---Procedimientos, no tiene valor de retorno
	// Si va a tener parametros, cuantos y de que tipo

	// Guardar---procedimiento
	public void guardar(Clientes cliente);

	// Mostrar---funcion
	public List<Clientes> mostrar();

	public Clientes buscar(int indice);

	public void editar(int indice, Clientes cliente);

	public void eliminar(int indice);

}
