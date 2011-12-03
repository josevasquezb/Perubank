package bastanteo;

public class Representante {
 
	private String tipoDocumento;
	private String nroDocumento;
	private String nombre;
	private String apellido;
	private String cargoEnlaEmpresa;
	private String grupoBastanteo; //A,B,C

	public Representante(String tipoDocumento, String nroDocumento, String nombre,
			                    String apellido, String cargoEnLaEmpresa, String grupoBastanteo) {
		 super();
		 this.tipoDocumento = tipoDocumento;
		 this.nroDocumento = nroDocumento;
		 this.nombre =nombre;
		 this.apellido = apellido;
		 this.cargoEnlaEmpresa = cargoEnLaEmpresa;
		 this.grupoBastanteo = grupoBastanteo;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public String getNroDocumento() {
		return nroDocumento;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getCargoEnLaEmpresa() {
		return cargoEnlaEmpresa;
	}

	public String getGrupoBastanteo() {
		return grupoBastanteo;
	}
	
}
