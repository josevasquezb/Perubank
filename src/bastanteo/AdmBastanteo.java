package bastanteo;
//clase admBastanteo.java
import java.util.ArrayList;
import java.util.List;

public class AdmBastanteo {
	List<Bastanteo> bastanteos;
	
	public AdmBastanteo(){
		bastanteos = new ArrayList<Bastanteo>();
	}


	
	public void registrarBastanteo(String codigoBastanteo, String grupoBastanteo, String codigoCliente, String tipoDocumento,
			String nroDocumento, String tipoIntervencion, long importe, String fechaVencimiento) throws MensajeException {
		
		//validar datos
		validarDatos(codigoBastanteo, grupoBastanteo, codigoCliente, tipoDocumento,
				nroDocumento,tipoIntervencion,importe,fechaVencimiento);
		
		
		//validar que haya duplicados
		validaDuplicado(grupoBastanteo, codigoCliente, tipoDocumento, nroDocumento);
		
		
		//Creamos un Cliente
		Bastanteo nuevoBastanteo = new Bastanteo(codigoBastanteo, grupoBastanteo, codigoCliente, tipoDocumento,
													nroDocumento,tipoIntervencion,importe,fechaVencimiento);
		//añade a la lista
		bastanteos.add(nuevoBastanteo);
	}



	private void validaDuplicado(String grupoBastanteo, String codigoCliente, String tipoDocumento,
			String nroDocumento) throws MensajeException {
		boolean existe = false;
			
		for(Bastanteo bastanteo : bastanteos)
			if (bastanteo.getGrupoBastanteo().equals(grupoBastanteo) && 
					bastanteo.getCodigoCliente().equals(codigoCliente) &&
					bastanteo.getTipoDocumento().equals(tipoDocumento) &&
					bastanteo.getNroDocumento().equals(nroDocumento))
				existe = true;
		
		if (existe) throw new MensajeException("Combinación de Bastanteo Duplicado");
	}



	private void validarDatos(String codigoBastanteo, String grupoBastanteo, String codigoCliente, String tipoDocumento,
			String nroDocumento, String tipoIntervencion, long importe, String fechaVencimiento) throws MensajeException {
		String mensaje = "";
		
		if(codigoBastanteo.equals(""))
		  mensaje += "Codigo de Bastanteo no puede ser vacio";
		if(grupoBastanteo.equals(""))
			  mensaje += "Grupo no puede ser vacio";
		if(codigoCliente.equals(""))
			  mensaje += "Codigo Cliente no puede ser vacio";
		if(tipoDocumento.equals(""))
			  mensaje += "Tipo de Documento no puede ser vacio";
		if(nroDocumento.equals(""))
			  mensaje += "Nro de Documento no puede ser vacio";
		if(tipoIntervencion.equals(""))
			  mensaje += "Tipo de Intervencion de Grupo no puede ser vacio";
		if(fechaVencimiento.equals(""))
			  mensaje += "/nFecha no puede ser vacio";
		if(! mensaje.equals(""))
			   throw new MensajeException(mensaje);
	}



	public Bastanteo buscarBastanteo(String codigoBastanteo) {
		for(Bastanteo bastanteo : bastanteos)
			if(bastanteo.getCodigoBastanteo().equals(codigoBastanteo))
			   return bastanteo;
		return null; 	}
}
