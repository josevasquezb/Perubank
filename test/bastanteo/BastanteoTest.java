package bastanteo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BastanteoTest {

	@Test
	public void BastanteoDeberiaCrearseConDatosIniciales(){
		
		//Preparo el Escenario
		String codigoBastanteo = "B0001";
		String grupoBastanteo = "A";
		String codigoCliente = "CL001";
		String tipoDocumento = "DNI";
		String nroDocumento = "40341631";
		String tipoIntervencion = "A Sola firma";
		long importe = 200;
		String fechaVencimiento = "05/05/2012";

		//Ejecuto el escenario
		Bastanteo bastanteo = new Bastanteo(codigoBastanteo, grupoBastanteo,codigoCliente,
				tipoDocumento,nroDocumento,tipoIntervencion,importe,fechaVencimiento);
		
		//Verifico
		assertEquals(codigoBastanteo,bastanteo.getCodigoBastanteo());
		assertEquals(grupoBastanteo,bastanteo.getGrupoBastanteo());
		assertEquals(codigoCliente,bastanteo.getCodigoCliente());
		assertEquals(tipoDocumento,bastanteo.getTipoDocumento());
		assertEquals(nroDocumento,bastanteo.getNroDocumento());
		assertEquals(tipoIntervencion,bastanteo.getTipoIntervencion());
		assertEquals(importe,bastanteo.getImporte());
		assertEquals(fechaVencimiento,bastanteo.getFechaVencimiento());
	}
}
