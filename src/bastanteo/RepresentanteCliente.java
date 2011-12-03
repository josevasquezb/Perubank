package bastanteo;

public class RepresentanteCliente {

	private String tipoDocumento;
	private String nroDocumento;
	private String codigo;

	public RepresentanteCliente(String tipoDocumento, String nroDocumento,
			String codigo) {
		super();
		this.tipoDocumento = tipoDocumento;
		this.nroDocumento = nroDocumento;
		this.codigo       = codigo;
		
	}

	public String getTipoDocumento() {
		return  tipoDocumento;
	}

	public String getNroDocumento() {
		return nroDocumento;
	}

	public String getCodigo() {
		return codigo;
	}

}
