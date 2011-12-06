package bastanteo;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class AdmUsuarioTest {

	@Test
	public void siIngresoDatosDeberiaRegistarUsuario() throws  MensajeException{
		//Preparo el Escenario
		String codigoUsuario = "csoriano";
		String nombre = "Cesar";
		String apellido = "Soriano";
		String clave = "asd";
		String codigoRol = "R001";
		
		AdmUsuarios adm = new AdmUsuarios();
		
		//ejecutar
		adm.registrarUsuario(codigoUsuario,nombre,apellido,clave,codigoRol);
		Usuario usuario =  adm.buscarUsuario(codigoUsuario);

		//Verificar
		assertNotNull(usuario);
	}

	//Este test expera que haya una exception de tipo....
	@Test(expected=MensajeException.class)
	public void deberiaValidarDatosRequeridos() throws  MensajeException{
		//Preparo el Escenario
		String codigoUsuario = "";
		String nombre = "";
		String apellido = "";
		String clave = "";
		String codigoRol = "";

		AdmUsuarios adm = new AdmUsuarios();
		
		//ejecutar
		adm.registrarUsuario(codigoUsuario,nombre,apellido,clave,codigoRol);
	}
	
	@Test(expected=MensajeException.class)
	public void noDeberiaRegistarUsuarioDuplicados() throws  MensajeException{
		//preparar el ejemplo
		String codigoUsuario = "csoriano";
		String nombre = "Cesar";
		String apellido = "Soriano";
		String clave = "asd";
		String codigoRol = "R001";

		AdmUsuarios adm = new AdmUsuarios();
		
		//ejecutar
		//El primero se ejecuta sin problemas
		adm.registrarUsuario(codigoUsuario,nombre,apellido,clave,codigoRol);
		
		//El segundo debe de arrojar una excepcion
		adm.registrarUsuario(codigoUsuario,nombre,apellido,clave,codigoRol);
	}
	
	@Test
	public void DeberiaLogearseConClaveCorreta() throws  MensajeException{
		//Inserto Primer Rol
		String codigoRol = "R001";
		String descripcionRol = "Supervisor";
		boolean accesoMenuClientes = true;
		boolean accesoMenuPoderes = true;
		boolean accesoMenuBastanteo = true;
		boolean accesoMenuUsuarios = true;		
		
		AdmRoles admr = new AdmRoles();
		
		admr.registrarRol(codigoRol, descripcionRol, accesoMenuClientes,
				accesoMenuPoderes, accesoMenuBastanteo, accesoMenuUsuarios);

		//Inserto Segundo Rol
		codigoRol = "R002";
		descripcionRol = "Administrador";
		accesoMenuClientes = false;
		accesoMenuPoderes = false;
		accesoMenuBastanteo = true;
		accesoMenuUsuarios = true;		
		
		admr.registrarRol(codigoRol, descripcionRol, accesoMenuClientes,
				accesoMenuPoderes, accesoMenuBastanteo, accesoMenuUsuarios);

		
		
		//Inserto un usuario
		String codigoUsuario = "csoriano";
		String nombre = "Cesar";
		String apellido = "Soriano";
		String clave = "asd";
		codigoRol = "R001";

		AdmUsuarios adm = new AdmUsuarios();

		adm.registrarUsuario(codigoUsuario,nombre,apellido,clave,codigoRol);
		
		
		//Verifica logeo
		codigoUsuario = "csoriano";
		clave = "asd";
		adm.verificaClaveUsuario(codigoUsuario, clave);

		//Mensaje bienvenida y rol asignado
		Rol rol =  admr.buscarRol(codigoRol);
		String sDescripcionRol = rol.getDescripcionRol();
		System.out.println("Bienvenido como " + sDescripcionRol + " al Sistema de Bastanteo");
	}
	
	@Test(expected=MensajeException.class)
	public void noDeberiaLogearseConClaveIncorreta() throws  MensajeException{
		//preparar el ejemplo
		String codigoUsuario = "csoriano";
		String nombre = "Cesar";
		String apellido = "Soriano";
		String clave = "asd";
		String codigoRol = "R001";

		AdmUsuarios adm = new AdmUsuarios();

		//Grabo para poder validar en lista
		adm.registrarUsuario(codigoUsuario,nombre,apellido,clave,codigoRol);

		//ejecutar
		adm.verificaClaveUsuario(codigoUsuario, "abc");
	}
}
