package main;

import javax.swing.JOptionPane;

import password.Password;

public class MainApp {

	public static void main(String[] args) {
		
		// pedimos el tama�o del array
		String longitudArray = JOptionPane.showInputDialog("Introduce el tama�o de un array: ");
		// parseamos el valor de entrada de String a int
		int longitudArrayParseada = Integer.parseInt(longitudArray);
		
		// creamos array de contrase�as de tipo Password con el tama�o obtenido por el usuario
		Password arrayPassword[] = new Password[longitudArrayParseada];
		
		// pedimos la longitud para cada contrase�a de array de contrase�as
		String longitudPassword = JOptionPane.showInputDialog("Introduce la longitud de una contrase�a: ");
		// parseamos la longitus de String a int
		int longitudPasswordParseada = Integer.parseInt(longitudPassword);
		
		// creamos array de booleanos para guardar contrase�as averiguadas
		boolean esFuerte [] = new boolean [arrayPassword.length];
		
		// creamos un bucle que crea objeto para cada posici�n de array
		for (int i = 0; i <arrayPassword.length; i++)
		{
			// el flujo entra en el constructor 2 de la clase  Password 
			// y genera la contrase�a aleatoria con la longitud pasada como par�metro
			arrayPassword[i] = new Password(longitudPasswordParseada);
			
			// invocamos el m�todo esFuerte para cada posici�n de array de contrase�as
			esFuerte[i] = arrayPassword[i].esFuerte();
			
			// mostramos el resultado
			System.out.println(arrayPassword[i].getPassword() + " " + esFuerte[i]);

		}

	}

}
