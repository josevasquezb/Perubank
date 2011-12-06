package bastanteo;

public class Rol {

	private String codigoRol;
	private String descripcionRol;
	private boolean accesoMenuClientes;
	private boolean accesoMenuPoderes;
	private boolean accesoMenuBastanteo;
	private boolean accesoMenuUsuarios;

	public Rol(String codigoRol, String descripcionRol, boolean accesoMenuClientes, boolean accesoMenuPoderes, 
			boolean accesoMenuBastanteo, boolean accesoMenuUsuarios) {
		super();
		this.codigoRol = codigoRol;
		this.descripcionRol = descripcionRol;
		this.accesoMenuClientes = accesoMenuClientes;
		this.accesoMenuPoderes = accesoMenuPoderes;
		this.accesoMenuBastanteo = accesoMenuBastanteo;
		this.accesoMenuUsuarios = accesoMenuUsuarios; 
	}

	public String getCodigoRol() {
		return codigoRol;
	}

	public String getDescripcionRol() {
		return descripcionRol;
	}

	public boolean getAccesoMenuClientes() {
		return accesoMenuClientes;
	}

	public boolean getAccesoMenuPoderes() {
		return accesoMenuPoderes;
	}

	public boolean getAccesoMenuBastanteo() {
		return accesoMenuBastanteo;
	}

	public boolean getAccesoMenuUsuarios() {
		return accesoMenuUsuarios;
	}
}
