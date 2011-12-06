package bastanteo;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class ClienteRepresentanteTest {
 
 @Test
 public void SiIngresoClienteRepresentante() throws MensajeException{
    //Preparamos Escenario
	String codigoCliente = "CL001";
	String ruc = "20107012011";
	String razonSocial = "ACME Solutions";
	String fechaInicio = "01/01/2011";
	String tipoEmpresa = "SAC";
	int empleados = 10;
	//Ejecuto el escenario
	Cliente cliente = new Cliente(codigoCliente,ruc,razonSocial,fechaInicio,tipoEmpresa,empleados);

	String tipoDocumento = "DNI";
	String nroDocumento = "40341631";
	String nombre = "JOSE";
	String apellido = "VASQUEZ BUSTAMANTE";
	String cargoEnLaEmpresa = "ABOGADO";
	String grupoBastanteo = "A"; //A,B,C	
	 
	Representante representante = new Representante(tipoDocumento,nroDocumento,nombre,apellido,cargoEnLaEmpresa,grupoBastanteo);
	
	ClienteRepresentante clienteRepresentante = new ClienteRepresentante(representante.getTipoDocumento(), 
																		 representante.getNroDocumento(),
																		 cliente.getCodigoCliente());

	//Verifico
	assertEquals(representante.getTipoDocumento(),clienteRepresentante.getTipoDocumento());
	assertEquals(representante.getNroDocumento(),clienteRepresentante.getNroDocumento());
	assertEquals(cliente.getCodigoCliente(),clienteRepresentante.getCodigoCliente());
 }

}
