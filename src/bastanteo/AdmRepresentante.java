package bastanteo;

import java.util.ArrayList;
import java.util.List;

public class AdmRepresentante {

	//1ero definino mi lista de un tipo de dato	
	List<Representante> representantes;
	
	public AdmRepresentante() {
		representantes = new ArrayList<Representante>();
	}
	public void registrarRepresentante(String tipoDocumento,
		                               String nroDocumento, String nombre, String apellido,
			                           String cargoEnLaEmpresa, String grupoBastanteo)  throws  MensajeException {
		
	 //Validamos Datos
	 validarDatos(tipoDocumento,nroDocumento,nombre,apellido,cargoEnLaEmpresa,grupoBastanteo);
    
	 //Validamos que no se repitan
	 if (validaSiExiste(tipoDocumento,nroDocumento)) throw new  MensajeException("Representante Duplicado");

     //Creamos un representante
	  Representante nuevoRepresentante = new  Representante(tipoDocumento,nroDocumento,nombre,apellido,
			  												cargoEnLaEmpresa,grupoBastanteo);	
     //añadimos a la lista
	 representantes.add(nuevoRepresentante);	
	
	}

	private boolean validaSiExiste(String tipoDocumento, String nroDocumento) {
		boolean existe = false;
		for(Representante representante : representantes)
			if(representante.getTipoDocumento().equals(tipoDocumento) && representante.getNroDocumento().equals(nroDocumento) )
			  existe = true;
		return existe;	
		}
	private void validarDatos(String tipoDocumento, String nroDocumento, String nombre,
			                  String apellido, String cargoEnLaEmpresa, String grupoBastanteo) throws  MensajeException {
		String mensaje = "";
		if(tipoDocumento.equals(""))
		  mensaje += "Tipo Documento no puede ser vacio";
		if(nroDocumento.equals(""))
			  mensaje += "/nNroDocumento no puede ser vacio";
		if(nombre.equals(""))
			  mensaje += "/nNombre no puede ser vacio";
		if(apellido.equals(""))
			  mensaje += "/nApellido inicio no puede ser vacio";
		if(cargoEnLaEmpresa.equals(""))
			  mensaje += "/nCargo en la empresa no puede ser vacio";
		if(grupoBastanteo.equals(""))
			  mensaje += "/nGrupo Bastanteo no puede ser vacio";
		if(! mensaje.equals(""))
			   throw new  MensajeException(mensaje);
	}
	
	public Representante buscarRepresentante(String tipoDocumento,
			                                 String nroDocumento) {
		for(Representante representante : representantes)
			if(representante.getTipoDocumento().equals(tipoDocumento) && representante.getNroDocumento().equals(nroDocumento) )
			   return representante;
		return null; 
	}

}
