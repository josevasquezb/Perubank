package bastanteo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GrupoTest {

	@Test
	public void GrupoDeberiaCrearseConDatosIniciales(){
		
		//Preparo el Escenario
		String grupoBastanteo = "A";
		String descripcionGrupo = "Grupo A";

		//Ejecuto el escenario
		Grupo grupo = new Grupo(grupoBastanteo,descripcionGrupo);
		
		//Verifico
		assertEquals(grupoBastanteo,grupo.getGrupoBastanteo());
		assertEquals(descripcionGrupo,grupo.getDescripcionGrupo());
	}
}
