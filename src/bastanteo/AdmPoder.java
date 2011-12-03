package bastanteo;

import java.util.ArrayList;
import java.util.List;

public class AdmPoder {

	//1ero definino mi lista de un tipo de dato	
	List<Poder> poderes;
	
	//2do En el constructor inicializo para que no salga NullPointerException
	public AdmPoder(){
        //Interface =  Clase 
		poderes = new ArrayList<Poder>();
		
	}

	
	
	public void registrarPoder(String codigoPoder, String nombrePoder,
			String tipoPoder) throws MensajeException {
		
		//validar datos
		validarDatos(codigoPoder, nombrePoder, tipoPoder);
		
		
		//validar que haya duplicados
		validaDuplicado(codigoPoder);
		
		
		//Creamos un Cliente
		Poder nuevoPoder = new Poder(codigoPoder,nombrePoder,tipoPoder);
		//añade a la lista
		poderes.add(nuevoPoder);
	}



	private void validaDuplicado(String codigoPoder) throws MensajeException {
		boolean existe = false;
			
		for(Poder poder : poderes)
			if (poder.getCodigoPoder().equals(codigoPoder))
				existe = true;
		
		if (existe) throw new MensajeException("Codigo de Poder Duplicado");
	}



	private void validarDatos(String codigoPoder, String nombrePoder,
			String tipoPoder) throws MensajeException {
		
		String mensaje = "";
		
		if(codigoPoder.equals(""))
		  mensaje += "Codigo de Poder no puede ser vacio";
		if(nombrePoder.equals(""))
			  mensaje += "/nNombre del Poder puede ser vacio";
		if(tipoPoder.equals(""))
			  mensaje += "/nTipo de Poder no puede ser vacio";
		if(! mensaje.equals(""))
			   throw new MensajeException(mensaje);
	}



	public Poder buscarPoder(String codigoPoder) {
		for(Poder poder : poderes)
			if(poder.getCodigoPoder().equals(codigoPoder))
			   return poder;
		return null; 	}
	
}
