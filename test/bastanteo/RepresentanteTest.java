package bastanteo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RepresentanteTest {

	@Test
	public void representanteDeberiaCrearseConDatosIniciales(){
		//Preparo el Escenario
				//Arrange
				//Preparar los datos de prueba
				String tipoDocumento = "DNI";
				String nroDocumento = "40341631";
				String nombre = "JOSE";
				String apellido = "VASQUEZ BUSTAMANTE";
				String cargoEnLaEmpresa = "ABOGADO";
				String grupoBastanteo = "A"; //A,B,C		
				
				
				//Ejecuto el escenario
				Representante representante = new Representante(tipoDocumento,nroDocumento,nombre,apellido,
						                                        cargoEnLaEmpresa,grupoBastanteo);
				
				//Verifico
				assertEquals(tipoDocumento,representante.getTipoDocumento());
				assertEquals(nroDocumento,representante.getNroDocumento());
				assertEquals(nombre,representante.getNombre());
				assertEquals(apellido,representante.getApellido());
				assertEquals(cargoEnLaEmpresa,representante.getCargoEnLaEmpresa());
				assertEquals(grupoBastanteo,representante.getGrupoBastanteo());
				
	}
	
}
