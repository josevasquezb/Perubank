package bastanteo;
//clase
import java.util.ArrayList;
import java.util.List;

public class AdmGrupo {
	List<Grupo> grupos;
	
	public AdmGrupo(){
		grupos = new ArrayList<Grupo>();
	}


	
	public void registrarGrupo(String grupoBastanteo, String descripcionGrupo) throws MensajeException {
		
		//validar datos
		validarDatos(grupoBastanteo, descripcionGrupo);
		
		
		//validar que haya duplicados
		validaDuplicado(grupoBastanteo);
		
		
		//Creamos un Cliente
		Grupo nuevoGrupo = new Grupo(grupoBastanteo,descripcionGrupo);
		//añade a la lista
		grupos.add(nuevoGrupo);
	}



	private void validaDuplicado(String grupoBastanteo) throws MensajeException {
		boolean existe = false;
			
		for(Grupo grupo : grupos)
			if (grupo.getGrupoBastanteo().equals(grupoBastanteo))
				existe = true;
		
		if (existe) throw new MensajeException("Codigo de Grupo Duplicado");
	}



	private void validarDatos(String grupoBastanteo, String descripcionGrupo) throws MensajeException {
		String mensaje = "";
		
		if(grupoBastanteo.equals(""))
		  mensaje += "Codigo de Grupo no puede ser vacio";
		if(descripcionGrupo.equals(""))
			  mensaje += "/nDescripcion del Grupo no puede ser vacio";
		if(! mensaje.equals(""))
			   throw new MensajeException(mensaje);
	}



	public Grupo buscarGrupo(String grupoBastanteo) {
		for(Grupo grupo : grupos)
			if(grupo.getGrupoBastanteo().equals(grupoBastanteo))
			   return grupo;
		return null; 	}
}
