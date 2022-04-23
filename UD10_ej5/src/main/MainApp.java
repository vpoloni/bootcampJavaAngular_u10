package main;

import javax.swing.JOptionPane;

import password.Password;

public class MainApp {

	public static void main(String[] args) {
		
		// pedimos el tamaño del array
		String longitudArray = JOptionPane.showInputDialog("Introduce el tamaño de un array: ");
		// parseamos el valor de entrada de String a int
		int longitudArrayParseada = Integer.parseInt(longitudArray);
		
		// creamos array de contraseñas de tipo Password con el tamaño obtenido por el usuario
		Password arrayPassword[] = new Password[longitudArrayParseada];
		
		// pedimos la longitud para cada contraseña de array de contraseñas
		String longitudPassword = JOptionPane.showInputDialog("Introduce la longitud de una contraseña: ");
		// parseamos la longitus de String a int
		int longitudPasswordParseada = Integer.parseInt(longitudPassword);
		
		// creamos array de booleanos para guardar contraseñas averiguadas
		boolean esFuerte [] = new boolean [arrayPassword.length];
		
		// creamos un bucle que crea objeto para cada posición de array
		for (int i = 0; i <arrayPassword.length; i++)
		{
			// el flujo entra en el constructor 2 de la clase  Password 
			// y genera la contraseña aleatoria con la longitud pasada como parámetro
			arrayPassword[i] = new Password(longitudPasswordParseada);
			
			// invocamos el método esFuerte para cada posición de array de contraseñas
			esFuerte[i] = arrayPassword[i].esFuerte();
			
			// mostramos el resultado
			System.out.println(arrayPassword[i].getPassword() + " " + esFuerte[i]);

		}

	}

}
