package bastanteo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PoderTest {

	@Test
	public void PoderesDeberiaCrearseConDatosIniciales(){
		
		//Preparo el Escenario
		String codigoPoder = "CHCO";
		String nombrePoder = "Cobreo de Cheques";
		String tipoPoder = "Activo";

		//Ejecuto el escenario
		Poder poder = new Poder(codigoPoder,nombrePoder,tipoPoder);
		
		//Verifico
		assertEquals(codigoPoder,poder.getCodigoPoder());
		assertEquals(nombrePoder,poder.getNombrePoder());
		assertEquals(tipoPoder,poder.getTipoPoder());
	}
}