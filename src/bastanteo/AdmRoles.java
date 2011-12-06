package bastanteo;

import java.util.ArrayList;
import java.util.List;

public class AdmRoles {

	//1ero definino mi lista de un tipo de dato	
	List<Rol> roles;
	
	//2do En el constructor inicializo para que no salga NullPointerException
	public AdmRoles(){
       //Interface =  Clase 
		roles = new ArrayList<Rol>();
	}

	
	public void registrarRol(String codigoRol, String descripcionRol, boolean accesoMenuClientes, boolean accesoMenuPoderes, 
			boolean accesoMenuBastanteo, boolean accesoMenuUsuarios) throws MensajeException {
		
		//validar datos
		validarDatos(codigoRol,descripcionRol);
		
		//validar que haya duplicados
		validaDuplicado(codigoRol);
		
		
		//Creamos un Rol
		Rol nuevoRol = new Rol(codigoRol,descripcionRol,accesoMenuClientes,accesoMenuPoderes,accesoMenuBastanteo,accesoMenuUsuarios);
		//añade a la lista
		roles.add(nuevoRol);
	}

	private void validaDuplicado(String codigoRol)
			throws  MensajeException {
		boolean existe = rolExiste(codigoRol);
			
		if (existe) throw new  MensajeException("Usuario Duplicado");
	}

	private boolean rolExiste(String codigoRol) {
		boolean existe = false;
		for(Rol rol: roles)
			if (rol.getCodigoRol().equals(codigoRol))
				existe = true;
		return existe;
	}

	private void validarDatos(String codigoRol, String descripcionRol) throws  MensajeException {
		String mensaje = "";
		if(codigoRol.equals(""))
		  mensaje += "Codigo de Rol no puede ser vacio";
		if(descripcionRol.equals(""))
			  mensaje += "/nDescripcion no puede ser vacio";
		if(! mensaje.equals(""))
			   throw new  MensajeException(mensaje);
	}

	public Rol buscarRol(String codigoRol) {
		for(Rol rol : roles)
			if(rol.getCodigoRol().equals(codigoRol))
			   return rol;
		return null; 
	}
}
