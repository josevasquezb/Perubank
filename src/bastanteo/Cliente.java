package bastanteo;

public class Cliente {

	private String codigoCliente;  //Codigo Autogenerado
	private String ruc;
	private String razonSocial;
	private String fechaInicio;
	private String tipoEmpresa;
	private int empleados;

	public Cliente(String codigoCliente, String ruc, String razonSocial,
			String fechaInicio, String tipoEmpresa, int empleados) {
		// TODO Auto-generated constructor stub
		super();
		this.codigoCliente = codigoCliente;
		this.ruc = ruc;
		this.razonSocial = razonSocial;
		this.fechaInicio = fechaInicio;
	    this.tipoEmpresa = tipoEmpresa;
	    this.empleados = empleados;
	}

	public String getCodigoCliente() {
		// TODO Auto-generated method stub
		return codigoCliente;
	}

	public String getRuc() {
		// TODO Auto-generated method stub
		return ruc;
	}

	public String getRazonSocial() {
		// TODO Auto-generated method stub
		return razonSocial;
	}

	public String getFechaInicio() {
		// TODO Auto-generated method stub
		return fechaInicio;
	}

	public String getTipoEmpresa() {
		// TODO Auto-generated method stub
		return tipoEmpresa;
	}

	public int getEmpleados() {
		// TODO Auto-generated method stub
		return empleados;
	}

}
