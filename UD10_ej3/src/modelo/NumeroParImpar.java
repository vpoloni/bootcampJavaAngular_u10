package modelo;

import excepcionCustomizada.ExcepcionCustomizada;

public class NumeroParImpar {

	public void esPar(int numeroAleatorio) {

		try {

			System.out.println("Generando un número aleatorio");
			// evaluamos si es par o impar
			if (numeroAleatorio % 2 == 0) {
				System.out.println(numeroAleatorio);
				// lanzamos la excepción de que es par
				throw new ExcepcionCustomizada("Es par");
			} else {
				System.out.println(numeroAleatorio);
				// lanzamos la excepcion de que es impar
				throw new ExcepcionCustomizada("Es impar");
			}

		} catch (ExcepcionCustomizada e) {
			// recuperamos según el caso mensaje de excepcion personalizada
			System.out.println(e.getMensaje());
		}

	}

}
