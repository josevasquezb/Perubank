package bastanteo;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class AdmRolTest {

	@Test
	public void siIngresoDatosDeberiaRegistarRol() throws  MensajeException{
		//Preparo el Escenario
		String codigoRol = "R001";
		String descripcionRol = "Supervisor";
		boolean accesoMenuClientes = true;
		boolean accesoMenuPoderes = true;
		boolean accesoMenuBastanteo = true;
		boolean accesoMenuUsuarios = true;		

		AdmRoles adm = new AdmRoles();
		//ejecutar
		adm.registrarRol(codigoRol, descripcionRol, accesoMenuClientes,
				accesoMenuPoderes, accesoMenuBastanteo, accesoMenuUsuarios);
		Rol rol =  adm.buscarRol(codigoRol);

		//Verificar que no sea nulo
		assertNotNull(rol);
	}

	
	//Este test expera que haya una exception de tipo....
	@Test(expected=MensajeException.class)
	public void deberiaValidarDatosRequeridos() throws  MensajeException{
		
		//Preparo el Escenario
		String codigoRol = "";
		String descripcionRol = "";
		boolean accesoMenuClientes = true;
		boolean accesoMenuPoderes = true;
		boolean accesoMenuBastanteo = true;
		boolean accesoMenuUsuarios = true;		

		AdmRoles adm = new AdmRoles();
		
		//ejecutar
		adm.registrarRol(codigoRol, descripcionRol, accesoMenuClientes,
				accesoMenuPoderes, accesoMenuBastanteo, accesoMenuUsuarios);
	}
	
	
	@Test(expected=MensajeException.class)
	public void noDeberiaRegistarRolDuplicados() throws  MensajeException{
		
		//preparar el ejemplo
		String codigoRol = "R001";
		String descripcionRol = "Supervisor";
		boolean accesoMenuClientes = true;
		boolean accesoMenuPoderes = true;
		boolean accesoMenuBastanteo = true;
		boolean accesoMenuUsuarios = true;		

		AdmRoles adm = new AdmRoles();
		
		//ejecutar
		//El primero se ejecuta sin problemas
		adm.registrarRol(codigoRol, descripcionRol, accesoMenuClientes,
				accesoMenuPoderes, accesoMenuBastanteo, accesoMenuUsuarios);
		
		//El segundo debe de arrojar una excepcion
		adm.registrarRol(codigoRol, descripcionRol, accesoMenuClientes,
				accesoMenuPoderes, accesoMenuBastanteo, accesoMenuUsuarios);
	}
}
