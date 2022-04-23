package excepcionCustomizada;

public class ExcepcionCustomizada extends Exception {

	private static final long serialVersionUID = 1L;

	// donde guardamos el mensaje pasado de main a constructor como parámetro
	private String mensaje = "";

	// constructor por defecto
	public ExcepcionCustomizada() {
		this.mensaje = "";
	}

	// constructor con el parámetro
	public ExcepcionCustomizada(String mensaje) {
		this.mensaje = mensaje;
	}

	// getters y setters
	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

}
