package bastanteo;

import java.util.ArrayList;
import java.util.List;

public class AdmClientes {
     
	//1ero definino mi lista de un tipo de dato	
	List<Cliente> clientes;
	
	//2do En el constructor inicializo para que no salga NullPointerException
	public AdmClientes(){
        //Interface =  Clase 
		clientes = new ArrayList<Cliente>();
		
	}
	
	public void registrarCliente(String codigoCliente, String ruc, String razonSocial,
			String fechaInicio, String tipoEmpresa, int empleados) throws MensajeException {
		
		//validar datos
		validarDatos(codigoCliente, ruc, razonSocial, fechaInicio, tipoEmpresa);
		
		//validar que haya duplicados
		validaDuplicado(codigoCliente, ruc);
		
		
		//Creamos un Cliente
		Cliente nuevoCliente = new Cliente(codigoCliente,ruc,razonSocial,fechaInicio,tipoEmpresa,empleados);
		//añade a la lista
		clientes.add(nuevoCliente);
	}

	private void validaDuplicado(String codigoCliente, String ruc)
			throws  MensajeException {
		boolean existe = clienteExiste(codigoCliente, ruc);
			
		if (existe) throw new  MensajeException("Cliente Duplicado");
	}

	private boolean clienteExiste(String codigoCliente, String ruc) {
		boolean existe = false;
		// and = &&  ,  or = ||
		for(Cliente cliente : clientes)
			if (cliente.getCodigoCliente().equals(codigoCliente) || cliente.getRuc().equals(ruc))
				existe = true;
		return existe;
	}

	private void validarDatos(String codigoCliente, String ruc, String razonSocial,
			String fechaInicio, String tipoEmpresa) throws  MensajeException {
		String mensaje = "";
		if(codigoCliente.equals(""))
		  mensaje += "Codigo no puede ser vacio";
		if(ruc.equals(""))
			  mensaje += "/nRuc no puede ser vacio";
		if(razonSocial.equals(""))
			  mensaje += "/nRazon social no puede ser vacio";
		if(fechaInicio.equals(""))
			  mensaje += "/nFecha inicio no puede ser vacio";
		if(tipoEmpresa.equals(""))
			  mensaje += "/nTipo empresa no puede ser vacio";
		if(! mensaje.equals(""))
			   throw new  MensajeException(mensaje);
	}

	public Cliente buscarCliente(String codigoCliente) {
		// TODO Auto-generated method stub
		for(Cliente cliente : clientes)
			if(cliente.getCodigoCliente().equals(codigoCliente))
			   return cliente;
		return null; 
	}

	
	
}
