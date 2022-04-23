package modelo;

import javax.swing.JOptionPane;

import excepcionCustomizada.ExcepcionCustomizada;

public class Calculadora {

	public static int pedirOperacion() { // mirar lo de static

		String operacion = JOptionPane
				.showInputDialog("Introduce la operación mátematica que deseas realizar: +"
						+ "\n1. Suma"
						+ "\n2. Resta"
						+ "\n3. Multiplicación"
						+ "\n4. Potencia" 
						+ "\n5. Raíz cudrada" 
						+ "\n6. Raíz cúbica" 
						+ "\n7. División");
		int operacionParseada = Integer.parseInt(operacion);
		return operacionParseada;
	}

	public static void hacerCalculos(int operacionParseada) {

		try {
		switch (operacionParseada) {
		// encerramos cada caso con las llaves para poder repetir los nombres de variables
		case 1: { 

			String numero1 = JOptionPane.showInputDialog("Introduce el primer operando");
			String numero2 = JOptionPane.showInputDialog("Introduce el segundo operando");

			int numero1Parseado = Integer.parseInt(numero1);
			int numero2Parseado = Integer.parseInt(numero2);

			int suma = numero1Parseado + numero2Parseado;

			System.out.println("La suma de " + numero1Parseado + " y " + numero2Parseado + " es: " + suma);
			break;
		}
		case 2: {

			String numero1 = JOptionPane.showInputDialog("Introduce el primer operando");
			String numero2 = JOptionPane.showInputDialog("Introduce el segundo operando");

			int numero1Parseado = Integer.parseInt(numero1);
			int numero2Parseado = Integer.parseInt(numero2);

			int resta = numero1Parseado - numero2Parseado;

			System.out.println("La resta de " + numero1Parseado + " y " + numero2Parseado + " es: " + resta);
			break;
		}
		
		case 3: {
			
			String numero1 = JOptionPane.showInputDialog("Introduce el primer operando");
			String numero2 = JOptionPane.showInputDialog("Introduce el segundo operando");

			int numero1Parseado = Integer.parseInt(numero1);
			int numero2Parseado = Integer.parseInt(numero2);

			int multiplicacion = numero1Parseado * numero2Parseado;

			System.out.println("La multiplicación de " + numero1Parseado + " y " + numero2Parseado + " es: " + multiplicacion);
			break;
			
		}
		
		case 4: {
			
			String numero1 = JOptionPane.showInputDialog("Introduce el primer operando");
			String numero2 = JOptionPane.showInputDialog("Introduce el segundo operando");

			int numero1Parseado = Integer.parseInt(numero1);
			int numero2Parseado = Integer.parseInt(numero2);

			int potencia = (int) Math.pow(numero1Parseado, numero2Parseado);

			System.out.println("La potencia de " + numero1Parseado + " y " + numero2Parseado + " es:" + potencia);
			break;
			
		}
		
		case 5: {
		
			String numero = JOptionPane.showInputDialog("Introduce un número: ");
			int numeroParseado = Integer.parseInt(numero);
			// lanzamos la excepcion ya que no se puede obtener la raiz cuadrada de un número negativo
			if (numeroParseado < 0) {
				throw new ExcepcionCustomizada ("No se puede obtener la raíz cuadrada de un número negativo");
			}

			double raizCuadrada = Math.sqrt(numeroParseado);
			
			System.out.println("La raíz cuadrada de " + numeroParseado + " es:" + raizCuadrada);
			break;
		}
		
		case 6: {
			
			String numero = JOptionPane.showInputDialog("Introduce un número: ");
			int numeroParseado = Integer.parseInt(numero);

			double raizCubica = Math.cbrt(numeroParseado);

			System.out.println("La raíz cúbica de " + numeroParseado +
					" es: " + String.format("%.2f", raizCubica)); 
			break;
		}
		
		case 7: {
			
			String numero1 = JOptionPane.showInputDialog("Introduce el primer operando");
			String numero2 = JOptionPane.showInputDialog("Introduce el segundo operando");

			int numero1Parseado = Integer.parseInt(numero1);
			int numero2Parseado = Integer.parseInt(numero2);

		
			
			if (numero2Parseado == 0) {
				throw new ExcepcionCustomizada ("No se puede dividir entre 0");
			}
			
			int division = numero1Parseado / numero2Parseado;

			System.out.println("La division de " + numero1Parseado + " y " + numero2Parseado + 
					"es :" +  String.format("%.2f", division));
			break;
			
		}
		
		}
		
		} catch (ExcepcionCustomizada e) {
			System.out.println(e.getMensaje());
		}

	}

}
