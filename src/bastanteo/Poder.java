package bastanteo;

public class Poder {

	private String codigoPoder; //CHCO, EFRE, OTRO
	private String nombrePoder; //Cobro de Cheques, Retiro en Efectivo
	private String tipoPoder; //Activo, Pasivo

	
	public Poder(String codigoPoder, String nombrePoder, String tipoPoder) {
		super();
		this.codigoPoder = codigoPoder;
		this.nombrePoder = nombrePoder;
		this.tipoPoder = tipoPoder;
	}

	
	public String getCodigoPoder() {
		return codigoPoder;
	}

	public String getNombrePoder() {
		return nombrePoder;
	}

	public String getTipoPoder() {
		return tipoPoder;
	}

}
