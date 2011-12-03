package bastanteo;


import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class AdmClienteRepresentanteTest {
 
//	@Test
	//	public void siIngresoDatosDeberiaRegistarClienteRepresentante(){
	//preparamos data
	//	String tipoDocumento = "DNI";
	//	String nroDocumento = "40341631";
	//	String codigo       = "CL001";
		
	//	RepresentanteCliente repcli = new AdmRepresentanteCliente();
		//ejecutar
	//	repcli.registrarRepresentanteCliente(tipoDocumento,nroDocumento,codigo);
		//verificar
	//	RepresentanteCliente representantecliente = repcli.buscarRepresentanteCliente(tipoDocumento,nroDocumento,codigo);
		//Verificar
	//	assertNotNull(representantecliente);	
	//	}
	
	@Test(expected=MensajeException.class)
	public void deberiaValidarDatosRequeridos() throws  MensajeException{
		
	}
	
	@Test(expected=MensajeException.class)
	public void noDeberiaRegistarClienteRepresentanteDuplicados() throws  MensajeException{
		
	}
}
