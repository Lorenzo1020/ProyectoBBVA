package ClaseMain;

import ClaseNormal.Clientes;
import Implementacion.LogicaMetodos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		// Coleccion de objetos
		Clientes cliente = new Clientes(2, "Javier", 2361142647l, "javier@gmail.com");
		Clientes cliente2 = new Clientes(3, "Francisco", 54646757575l, "francisco@gmail.com");

		// Realizar la instancia de clase --- ya atenemos aaceso a todo lo que contenga
		// esa clase
		LogicaMetodos imp = new LogicaMetodos();

		// metodo de Guardar
		imp.guardar(cliente);
		imp.guardar(cliente2);

		// Mostrar
		System.out.println(imp.mostrar());

		// Buscar
		Clientes clienteEnonc = null;
		clienteEnonc = imp.buscar(1);

		System.out.println("Se encontro " + clienteEnonc);

		// Editar---´para editar primero hay que buscar
		clienteEnonc = imp.buscar(0);
		clienteEnonc.setNombre("Espinosa");
		imp.editar(0, clienteEnonc);

		// Mostrar
		System.out.println(imp.mostrar());

		// Eliminar
		imp.eliminar(1);

		// Mostrar
		System.out.println(imp.mostrar());

	}

}
