package bastanteo;

public class ClienteRepresentante {

	private String tipoDocumento;
	private String nroDocumento;
	private String codigoCliente;

	public ClienteRepresentante(String tipoDocumento, String nroDocumento,
			String codigoCliente) {
		super();
		this.tipoDocumento = tipoDocumento;
		this.nroDocumento = nroDocumento;
		this.codigoCliente = codigoCliente;
		
	}

	public String getTipoDocumento() {
		return  tipoDocumento;
	}

	public String getNroDocumento() {
		return nroDocumento;
	}

	public String getCodigoCliente() {
		return codigoCliente;
	}

}
