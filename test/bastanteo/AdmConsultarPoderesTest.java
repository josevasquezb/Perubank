package bastanteo;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class AdmConsultarPoderesTest {

	@Test
	public void consultaSiRepresentanteTienePoder() throws MensajeException{
		
		//Data de clientes
		AdmClientes admc = new AdmClientes();
		admc.registrarCliente("CL0001","10402306241","POO SA","01/01/2010","SA",30);
		admc.registrarCliente("CL0002","20504265723","JAVA POO SAC","13/08/2002","SAC",4);

		//Data de representantes
		AdmRepresentante admr = new AdmRepresentante();
		admr.registrarRepresentante("DNI", "40341631", "JOSE", "VASQUEZ", "ABOGADO", "A");
		admr.registrarRepresentante("DNI", "40230624", "CESAR", "SORIANO", "ABOGADO", "B");
		admr.registrarRepresentante("DNI", "10402039", "MANUEL", "DIAZ", "ABOGADO", "C");
		
		//Data del poder
		AdmPoder admp = new AdmPoder();
		admp.registrarPoder("CHCO", "Cobro de Cheques", "Pasivo");
		admp.registrarPoder("EFRE", "Retiro en Efectivo", "Activo");

		
		AdmBastanteo admb = new AdmBastanteo();
		
		//Data de Bastanteos
		admb.registrarBastanteo("B0001", "A", "CL0001", "DNI", "40341631", "A Sola firma",200,"15/12/2011","CHCO");
		admb.registrarBastanteo("B0002", "B", "CL0002", "DNI", "40230624", "En Conjunto",180,"18/12/2011","EFRE");
		admb.registrarBastanteo("B0003", "C", "CL0002", "DNI", "10402039", "A Sola firma",95,"20/12/2011","CHCO");
		admb.registrarBastanteo("B0004", "A", "CL0001", "DNI", "40341631", "A Sola firma",200,"15/12/2011","EFRE");
		
		
		//Datos para consultar
		String ruc = "10402306241";
		String tipoDocumento = "DNI";
		String nroDocumento = "40341631";
		String grupoBastanteo = "A";		

		//Obtienen el cliente en base al ruc
		Cliente cliente =  admc.buscarClientexRuc(ruc);
		String codigoCliente = cliente.getCodigoCliente();

		
		//Ejecuta
		Bastanteo bastanteo = admb.listaBastanteos(codigoCliente, tipoDocumento, nroDocumento, grupoBastanteo);
	}
}
