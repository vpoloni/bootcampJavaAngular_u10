package password;

import java.util.Random;

public class Password {

	// constante
	private final int LONGITUD = 8;

	// atributos
	private String password;
	private int longitud;

	// constructor por defecto
	public Password() {
		this.password = "";
		this.longitud = LONGITUD;
	}

	// constructor con longitud
	public Password(int longitud) {
		this.longitud = longitud;
		this.password = generarPasswordAleatorio();

	}

	// método que genera el password aleatorio
	public String generarPasswordAleatorio() {

		Random random = new Random();
		// variable para guardar contraseña de valores generados aleatoriamente
		String password = "";

		do {

			// generamos numero aleatorio usando tabla ascii
			int numeroAleatorio = random.nextInt(9) + 48;
			// generamos letra mayúscula aleatoria usando tabla ascii
			int mayusculaAleatoria = random.nextInt(25) + 65;
			// generamos letra minúscula aleatoria usando tabla ascii
			int minusculaAleatoria = random.nextInt(25) + 97;

			// creamos array de caracteres generados aleatoriamente
			int arrayNumerosAleatorios[] = { numeroAleatorio, mayusculaAleatoria, minusculaAleatoria };

			// generamos index de array aleatoriamente
			int indexArrayAleatorio = random.nextInt(3);

			// asignamos valor de la posición aleatoria
			int caracterAleatorio = arrayNumerosAleatorios[indexArrayAleatorio];

			// convertimos el valor de cada posición de int a char y luego de char a String
			String caracterAleatorioString = String.valueOf((char) caracterAleatorio);

			// asignamos el valor convertido a String
			password += caracterAleatorioString;

			// creamos valores aleatorios hasta que longitud de password sea longitud pasada como parámetro
		} while (password.length() != longitud);

		return password;

	}

	public boolean esFuerte() {

		// varibles locales para guardar cantidad de cada tipo de valor
		int contadorNumeros = 0;
		int contadorMayusculas = 0;
		int contadorMinusculas = 0;

		boolean esFuerte = false;

		// convertimos password de String a array de carácteres
		char arrayCaracteresPassword[] = this.password.toCharArray();
		// recorremos array de carácteres
		for (char caracter : arrayCaracteresPassword) {
			// hacemos uso de la tabla ascii donde el rango de números es 48-57
			if (caracter >= 48 && caracter <= 57) {
				contadorNumeros++;
				// hacemos uso de la tabla ascii donde el rango de letras mayúsculas es 65-90
			} else if (caracter >= 65 && caracter <= 90) {
				contadorMayusculas++;
				// hacemos uso de la tabla ascii donde el rango de letras minúsculas es 65-90
			} else if (caracter >= 97 && caracter <= 122) {
				contadorMinusculas++;
			}
			// evaluamos la contraseña
			if (contadorNumeros > 5 && contadorMayusculas > 2 && contadorMinusculas > 1) {
				esFuerte = true;

			}

		}
		return esFuerte;

	}

	// getters y setters
	public String getPassword() {
		return password;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

}
