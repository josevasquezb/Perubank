package bastanteo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RolTest {

	@Test
	public void UsuarioDeberiaCrearseConDatosIniciales(){
		
		//Preparo el Escenario
		String codigoRol = "R001";
		String descripcionRol = "Supervisor";
		boolean accesoMenuClientes = true;
		boolean accesoMenuPoderes = true;
		boolean accesoMenuBastanteo = true;
		boolean accesoMenuUsuarios = true;
		
		//Ejecuto el escenario
		Rol rol = new Rol(codigoRol,descripcionRol,accesoMenuClientes,accesoMenuPoderes,accesoMenuBastanteo,accesoMenuUsuarios);
		
		//Verifico
		assertEquals(codigoRol,rol.getCodigoRol());
		assertEquals(descripcionRol,rol.getDescripcionRol());
		assertEquals(accesoMenuClientes,rol.getAccesoMenuClientes());
		assertEquals(accesoMenuPoderes,rol.getAccesoMenuPoderes());
		assertEquals(accesoMenuBastanteo,rol.getAccesoMenuBastanteo());
		assertEquals(accesoMenuUsuarios,rol.getAccesoMenuUsuarios());
	}
}
