package bastanteo;
//jose vasquez
import java.util.ArrayList;
import java.util.List;

public class AdmBastanteo {
	List<Bastanteo> bastanteos;
	
	public AdmBastanteo(){
		bastanteos = new ArrayList<Bastanteo>();
	}


	
	public void registrarBastanteo(String codigoBastanteo, String grupoBastanteo, String codigoCliente, String tipoDocumento,
			String nroDocumento, String tipoIntervencion, long importe, String fechaVencimiento, String codigoPoder) throws MensajeException {
		
		//validar datos
		validarDatos(codigoBastanteo, grupoBastanteo, codigoCliente, tipoDocumento,
				nroDocumento,tipoIntervencion,importe,fechaVencimiento,codigoPoder);
		
		
		//validar que haya duplicados
		validaDuplicado(grupoBastanteo, codigoCliente, tipoDocumento, nroDocumento, codigoPoder);
		
		
		//Creamos un Cliente
		Bastanteo nuevoBastanteo = new Bastanteo(codigoBastanteo, grupoBastanteo, codigoCliente, tipoDocumento,
													nroDocumento,tipoIntervencion,importe,fechaVencimiento,codigoPoder);
		//añade a la lista
		bastanteos.add(nuevoBastanteo);
	}



	private void validaDuplicado(String grupoBastanteo, String codigoCliente, String tipoDocumento,
			String nroDocumento, String codigoPoder) throws MensajeException {
		boolean existe = false;
			
		for(Bastanteo bastanteo : bastanteos)
			if (bastanteo.getGrupoBastanteo().equals(grupoBastanteo) && 
					bastanteo.getCodigoCliente().equals(codigoCliente) &&
					bastanteo.getTipoDocumento().equals(tipoDocumento) &&
					bastanteo.getNroDocumento().equals(nroDocumento) &&
					bastanteo.getCodigoPoder().equals(codigoPoder))
				existe = true;
		
		if (existe) throw new MensajeException("Combinación de Bastanteo Duplicado");
	}



	private void validarDatos(String codigoBastanteo, String grupoBastanteo, String codigoCliente, String tipoDocumento,
			String nroDocumento, String tipoIntervencion, long importe, String fechaVencimiento, String codigoPoder) throws MensajeException {
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
		if(codigoPoder.equals(""))
			  mensaje += "/nCodigo Poder no puede ser vacio";
		if(! mensaje.equals(""))
			   throw new MensajeException(mensaje);
	}



	public Bastanteo buscarBastanteo(String codigoBastanteo) {
		for(Bastanteo bastanteo : bastanteos)
			if(bastanteo.getCodigoBastanteo().equals(codigoBastanteo))
			   return bastanteo;
		return null; 	
	}


	
	public Bastanteo validaSiTienePoder(String codigoCliente, String tipoDocumento, String nroDocumento, 
			String codigoPoder, long importe) {
		
		boolean existe = false;
		
		for(Bastanteo bastanteo : bastanteos)
			if (bastanteo.getCodigoCliente().equals(codigoCliente) &&
					bastanteo.getTipoDocumento().equals(tipoDocumento) &&
					bastanteo.getNroDocumento().equals(nroDocumento) &&
					bastanteo.getCodigoPoder().equals(codigoPoder))
			{
				existe = true;
				System.out.println("El representante ya tiene el Poder");
				return bastanteo;
			}
		
		System.out.println("El Representante NO tiene el Poder");
		return null; 	
	}



	public Bastanteo validaSiPoderFuePrestadoPeroYaVencio(String codigoCliente,
			String tipoDocumento, String nroDocumento, String codigoPoder) {
		for(Bastanteo bastanteo : bastanteos)
			if (bastanteo.getCodigoCliente().equals(codigoCliente) &&
					bastanteo.getTipoDocumento().equals(tipoDocumento) &&
					bastanteo.getNroDocumento().equals(nroDocumento) &&
					bastanteo.getCodigoPoder().equals(codigoPoder))
			{
				return bastanteo;
			}
		return null; 	
	}
}

