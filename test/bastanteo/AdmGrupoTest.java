package bastanteo;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;


public class AdmGrupoTest {

	@Test
	public void siIngresoDatosDeberiaRegistrarGrupos() throws MensajeException{
		//Preparo el Escenario
		String grupoBastanteo = "A";
		String descripcionGrupo = "Grupo A";
		
		AdmGrupo adm = new AdmGrupo();
		
		//ejecutar
		adm.registrarGrupo(grupoBastanteo, descripcionGrupo);
		Grupo grupo = adm.buscarGrupo(grupoBastanteo);
		
		//Verificar
		assertNotNull(grupo);
	}
	

	//Este test expera que haya una exception
	@Test(expected=MensajeException.class)
	public void deberiaValidarDatosRequeridos() throws MensajeException{

		//Preparo el Escenario
		String grupoBastanteo = "";
		String descripcionGrupo = "";

		AdmGrupo adm = new AdmGrupo();
		
		//ejecutar
		adm.registrarGrupo(grupoBastanteo, descripcionGrupo);
	}
	
	
	@Test(expected=MensajeException.class)
	public void noDeberiaRegistarGruposDuplicados() throws MensajeException{
		
		//Preparo el Escenario
		String grupoBastanteo = "";
		String descripcionGrupo = "";

		AdmGrupo adm = new AdmGrupo();
		
		//ejecutar
		adm.registrarGrupo(grupoBastanteo, descripcionGrupo);
		
		//Lo vuelvo a ejecutar para probar el error
		adm.registrarGrupo(grupoBastanteo, descripcionGrupo);
	}
}
