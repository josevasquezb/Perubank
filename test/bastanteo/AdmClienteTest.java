package bastanteo;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdmClienteTest {
	@Test
	public void siIngresoDatosDeberiaRegistarClientes() throws  MensajeException{
		//Preparamos el ejemplo
	
		String ruc = "20107012011";
		String codigo = "CL001";
		String razonSocial = "ACME Solutions";
		String fechaInicio = "01/01/2011";
		String tipoEmpresa = "SAC";
		int empleados = 10;
		
		AdmClientes adm = new AdmClientes();
		
		//ejecutar
		adm.registrarCliente(codigo,ruc,razonSocial,fechaInicio,tipoEmpresa,empleados);
		Cliente cliente =  adm.buscarCliente(codigo);
		//Verificar
		assertNotNull(cliente);
	
	}
	//Este test expera que haya una exception de tipo....
	@Test(expected=MensajeException.class)
	public void deberiaValidarDatosRequeridos() throws  MensajeException{
		//prepara el ejemplo
		String ruc = "";
		String codigo = "";
		String razonSocial = "";
		String fechaInicio = "01/01/2011";
		String tipoEmpresa = "SAC";
		int empleados = 10;
		AdmClientes adm = new AdmClientes();
		
		//ejecutar
		adm.registrarCliente(codigo,ruc,razonSocial,fechaInicio,tipoEmpresa,empleados);
	}
	
	@Test(expected=MensajeException.class)
	public void noDeberiaRegistarClienteDuplicados() throws  MensajeException{
		//preparar el ejemplo
		String ruc = "20107012011";
		String codigo = "CL001";
		String razonSocial = "ACME Solutions";
		String fechaInicio = "01/01/2011";
		String tipoEmpresa = "SAC";
		int empleados = 10;
		AdmClientes adm = new AdmClientes();
		
		//ejecutar
		//El primero se ejecuta sin problemas
		adm.registrarCliente(codigo,ruc,razonSocial,fechaInicio,tipoEmpresa,empleados);
		
		//El segundo debe de arrojar una excepcion
	    adm.registrarCliente(codigo,ruc,razonSocial,fechaInicio,tipoEmpresa,empleados);
		
	}

}