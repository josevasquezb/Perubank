package bastanteo;

public class Usuario {

	private String codigoUsuario;
	private String nombre;
	private String apellido;
	private String clave;
	private String codigoRol;

	public Usuario(String codigoUsuario, String nombre, String apellido, String clave,
			String codigoRol) {
		super();
		this.codigoUsuario = codigoUsuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.clave = clave;
		this.codigoRol = codigoRol;
	}

	public String getCodigoUsuario() {
		return codigoUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getClave() {
		return clave;
	}

	public String getCodigoRol() {
		return codigoRol;
	}

}
