package bastanteo;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class AdmPoderTest {

	@Test
	public void siIngresoDatosDeberiaRegistrarPoderes() throws MensajeException{
		//Preparo el Escenario
		String codigoPoder = "CHCO";
		String nombrePoder = "Cobro de Cheques";
		String tipoPoder = "Activo";
		
		AdmPoder adm = new AdmPoder();
		
		//ejecutar
		adm.registrarPoder(codigoPoder, nombrePoder, tipoPoder);
		Poder poder = adm.buscarPoder(codigoPoder);
		
		//Verificar
		assertNotNull(poder);
	}
	

	//Este test expera que haya una exception
	@Test(expected=MensajeException.class)
	public void deberiaValidarDatosRequeridos() throws MensajeException{

		//Preparo el Escenario
		String codigoPoder = "";
		String nombrePoder = "";
		String tipoPoder = "";

		AdmPoder adm = new AdmPoder();
		
		//ejecutar
		adm.registrarPoder(codigoPoder, nombrePoder, tipoPoder);
	}
	
	
	@Test(expected=MensajeException.class)
	public void noDeberiaRegistarPoderesDuplicados() throws MensajeException{
		
		//Preparo el Escenario
		String codigoPoder = "CHCO";
		String nombrePoder = "Cobro de Cheques";
		String tipoPoder = "Activo";
		
		AdmPoder adm = new AdmPoder();
		
		//ejecutar
		adm.registrarPoder(codigoPoder, nombrePoder, tipoPoder);
		
		//Lo vuelvo a ejecutar para probar el error
		adm.registrarPoder(codigoPoder, nombrePoder, tipoPoder);
	}
}
