package bastanteo;

import java.util.ArrayList;
import java.util.List;

public class AdmUsuarios {
    
	//1ero definino mi lista de un tipo de dato	
	List<Usuario> usuarios;
	
	//2do En el constructor inicializo para que no salga NullPointerException
	public AdmUsuarios(){
       //Interface =  Clase 
		usuarios = new ArrayList<Usuario>();
	}

	
	public void registrarUsuario(String codigoUsuario, String nombre, String apellido,
			String clave, String codigoRol) throws MensajeException {
		
		//validar datos
		validarDatos(codigoUsuario, nombre, apellido, clave, codigoRol);
		
		//validar que haya duplicados
		validaDuplicado(codigoUsuario);
		
		
		//Creamos un Usuario
		Usuario nuevoUsuario = new Usuario(codigoUsuario,nombre,apellido,clave,codigoRol);
	
		//añade a la lista
		usuarios.add(nuevoUsuario);
	}

	private void validaDuplicado(String codigoUsuario)
			throws  MensajeException {
		boolean existe = usuarioExiste(codigoUsuario);
			
		if (existe) throw new  MensajeException("Usuario Duplicado");
	}

	private boolean usuarioExiste(String codigoUsuario) {
		boolean existe = false;
		for(Usuario usuario: usuarios)
			if (usuario.getCodigoUsuario().equals(codigoUsuario))
				existe = true;
		return existe;
	}

	private void validarDatos(String codigoUsuario, String nombre, String apellido,
			String clave, String codigoRol) throws  MensajeException {
		String mensaje = "";
		if(codigoUsuario.equals(""))
		  mensaje += "Codigo no puede ser vacio";
		if(nombre.equals(""))
			  mensaje += "/nNombre no puede ser vacio";
		if(apellido.equals(""))
			  mensaje += "/nApellido no puede ser vacio";
		if(clave.equals(""))
			  mensaje += "/nClave inicio no puede ser vacio";
		if(codigoRol.equals(""))
			  mensaje += "/nRol no puede ser vacio";
		if(! mensaje.equals(""))
			   throw new  MensajeException(mensaje);
	}

	public Usuario buscarUsuario(String codigoUsuario) {
		for(Usuario usuario : usuarios)
			if(usuario.getCodigoUsuario().equals(codigoUsuario))
			   return usuario;
		return null; 
	}

	public void verificaClaveUsuario(String codigoUsuario, String clave) throws  MensajeException {
		String mensaje = "Clave incorrecta";
		
		for(Usuario usuario : usuarios)
			if(usuario.getCodigoUsuario().equals(codigoUsuario))
				if(usuario.getClave().equals(clave))
					mensaje = "";
		
		if(! mensaje.equals(""))
			   throw new  MensajeException(mensaje);
	}
}
