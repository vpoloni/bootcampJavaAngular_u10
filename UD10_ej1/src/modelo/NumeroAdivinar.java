package modelo;

import java.util.Random;

import javax.swing.JOptionPane;

public class NumeroAdivinar {

	public static void adivinarNumero() {

		// creamos objeto de la clase Random
		Random random = new Random();
		// asignamos el número aleatrio que nos genera el sistema
		int numeroAleatorioSistema = random.nextInt(499) + 1;

		// asignamos a 0 la variable donde se guarda el valor de usuario
		int numeroIntroducidoUsuarioParseado = 0;
		int intentos = 0;

		// despues de evaluar la condición while entramos en do
		do {
			// con try comprobamos que todo esté correcto
			try {
				// evaluamos diferentes casos
				String numeroIntroducidoUsuario = JOptionPane.showInputDialog("Introduce un numero: ");
				numeroIntroducidoUsuarioParseado = Integer.parseInt(numeroIntroducidoUsuario);
				System.out.println(numeroIntroducidoUsuarioParseado);

				if (numeroIntroducidoUsuarioParseado < numeroAleatorioSistema) {
					System.out.println("Ha de ser un número mayor que el anterior");
					intentos++;
				} else if (numeroIntroducidoUsuarioParseado > numeroAleatorioSistema) {
					System.out.println("Ha de ser un número menor que el anterior");
					intentos++;
				} else {
					System.out.println("¡Enhorabuena! Has adivinado el número");
					System.out.println("Numero de intentos: " + intentos);
				}
				// en caso que se produzca un error, lo capturamos
			} catch (Exception e) {
				System.out.println("Has introducido el carácter inválido");
				intentos++;
			}
			// mientras el número introducido por el usuario no sea idual que el número
			// generado por el sistema
		} while (numeroIntroducidoUsuarioParseado != numeroAleatorioSistema);
	}

}
