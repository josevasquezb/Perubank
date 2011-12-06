package bastanteo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ClienteTest {

	@Test
	public void ClienteDeberiaCrearseConDatosIniciales(){
		
		//Preparo el Escenario
		//Arrange
		//Preparar los datos de prueba
		String ruc = "20107012011";
		String codigoCliente = "CL001";
		String razonSocial = "ACME Solutions";
		String fechaInicio = "01/01/2011";
		String tipoEmpresa = "SAC";
		int empleados = 10;
		
		//Ejecuto el escenario
		Cliente cliente = new Cliente(codigoCliente,ruc,razonSocial,fechaInicio,tipoEmpresa,empleados);
		
		//Verifico
		assertEquals(codigoCliente,cliente.getCodigoCliente());
		assertEquals(ruc,cliente.getRuc());
		assertEquals(razonSocial,cliente.getRazonSocial());
		assertEquals(fechaInicio,cliente.getFechaInicio());
		assertEquals(tipoEmpresa,cliente.getTipoEmpresa());
		assertEquals(empleados,cliente.getEmpleados());
	}
}
