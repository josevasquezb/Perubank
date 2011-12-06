package bastanteo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UsuarioTest {

	@Test
	public void UsuarioDeberiaCrearseConDatosIniciales(){
		
		//Preparo el Escenario
		String codigoUsuario = "csoriano";
		String nombre = "Cesar";
		String apellido = "Soriano";
		String clave = "asd";
		String codigoRol = "R001";
		
		//Ejecuto el escenario
		Usuario usuario = new Usuario(codigoUsuario,nombre,apellido,clave,codigoRol);
		
		//Verifico
		assertEquals(codigoUsuario,usuario.getCodigoUsuario());
		assertEquals(nombre,usuario.getNombre());
		assertEquals(apellido,usuario.getApellido());
		assertEquals(clave,usuario.getClave());
		assertEquals(codigoRol,usuario.getCodigoRol());
	}
}
