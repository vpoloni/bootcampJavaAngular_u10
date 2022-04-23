package main;

import excepcionCustomizada.ExcepcionCustomizada;

public class MainApp {

	public static void main(String[] args) {
		try {
			// creamos mensaje
			System.out.println("Mensaje mostrado por pantalla");
			// creamos objeto de ExcepcionCustomizada
			ExcepcionCustomizada miExcepcion = new ExcepcionCustomizada(
					// con cadena como parámetro que va a recibir el constructor
					"Excepción capturada con mensaje: Esto es un objeto ExceptionCustomizada");
			// mostramos lo que recibe el constructor y lo guarda en la variable de la clase
			// ExcepcionCustomizada
			System.out.println(miExcepcion.getMensaje());
			// lanzamos otra excepción
			throw new ExcepcionCustomizada("Programa terminado");

		} catch (ExcepcionCustomizada e) {

			System.out.println(e.getMensaje());
		}
	}

}
