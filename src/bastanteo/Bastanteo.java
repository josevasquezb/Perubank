package bastanteo;

public class Bastanteo {

	private String codigoBastanteo;
	private String grupoBastanteo;
	private String codigoCliente;
	private String tipoDocumento;
	private String nroDocumento;
	private String tipoIntervencion;
	private long importe;
	private String fechaVencimiento;
	private String codigoPoder;

	public Bastanteo(String codigoBastanteo, String grupoBastanteo, String codigoCliente,
			String tipoDocumento, String nroDocumento, String tipoIntervencion,
			long importe, String fechaVencimiento, String codigoPoder) {
		super();
		this.codigoBastanteo = codigoBastanteo;
		this.grupoBastanteo = grupoBastanteo;
		this.codigoCliente = codigoCliente;
		this.tipoDocumento = tipoDocumento;
		this.nroDocumento = nroDocumento;
		this.tipoIntervencion = tipoIntervencion;
		this.importe = importe;
		this.fechaVencimiento = fechaVencimiento;
		this.codigoPoder = codigoPoder;
	}

	public String getCodigoBastanteo() {
		return codigoBastanteo;
	}
	
	public String getGrupoBastanteo() {
		return grupoBastanteo;
	}

	public String getCodigoCliente() {
		return codigoCliente;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public String getNroDocumento() {
		return nroDocumento;
	}

	public String getTipoIntervencion() {
		return tipoIntervencion;
	}

	public long getImporte() {
		return importe;
	}

	public String getFechaVencimiento() {
		return fechaVencimiento;
	}
	
	public String getCodigoPoder() {
		return codigoPoder;
	}
}
