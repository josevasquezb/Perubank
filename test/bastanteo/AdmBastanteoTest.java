package bastanteo;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class AdmBastanteoTest {

	@Test
	public void siIngresoDatosDeberiaRegistrarBastanteo() throws MensajeException{
		
		//Preparo el Escenario
		String codigoBastanteo = "B0001";
		String grupoBastanteo = "A";
		String codigoCliente = "CL001";
		String tipoDocumento = "DNI";
		String nroDocumento = "40341631";
		String tipoIntervencion = "A Sola firma";
		long importe = 200;
		String fechaVencimiento = "05/05/2012";
		
		AdmBastanteo adm = new AdmBastanteo();
		
		//ejecutar
		adm.registrarBastanteo(codigoBastanteo, grupoBastanteo, codigoCliente, tipoDocumento,
				nroDocumento,tipoIntervencion,importe,fechaVencimiento);
		
		Bastanteo bastanteo = adm.buscarBastanteo(codigoBastanteo);
		
		//Verificar
		assertNotNull(bastanteo);
	}
	

	//Este test expera que haya una exception
	@Test(expected=MensajeException.class)
	public void deberiaValidarDatosRequeridos() throws MensajeException{

		//Preparo el Escenario
		String codigoBastanteo = "";
		String grupoBastanteo = "";
		String codigoCliente = "";
		String tipoDocumento = "";
		String nroDocumento = "";
		String tipoIntervencion = "";
		long importe = 0;
		String fechaVencimiento = "";
		
		AdmBastanteo adm = new AdmBastanteo();
		
		//ejecutar
		adm.registrarBastanteo(codigoBastanteo, grupoBastanteo, codigoCliente, tipoDocumento,
				nroDocumento,tipoIntervencion,importe,fechaVencimiento);
	}
	
	
	@Test(expected=MensajeException.class)
	public void noDeberiaRegistarBastanteoDuplicados() throws MensajeException{
		
		//Preparo el Escenario
		String codigoBastanteo = "B0001";
		String grupoBastanteo = "A";
		String codigoCliente = "CL001";
		String tipoDocumento = "DNI";
		String nroDocumento = "40341631";
		String tipoIntervencion = "A Sola firma";
		long importe = 200;
		String fechaVencimiento = "05/05/2012";
		
		AdmBastanteo adm = new AdmBastanteo();
		
		//ejecutar
		adm.registrarBastanteo(codigoBastanteo,grupoBastanteo, codigoCliente, tipoDocumento,
				nroDocumento,tipoIntervencion,importe,fechaVencimiento);
		
		//Lo vuelvo a ejecutar para probar el error
		adm.registrarBastanteo(codigoBastanteo,grupoBastanteo, codigoCliente, tipoDocumento,
				nroDocumento,tipoIntervencion,importe,fechaVencimiento);
	}
}
