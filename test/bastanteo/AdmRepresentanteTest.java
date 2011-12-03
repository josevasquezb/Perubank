package bastanteo;
//jose vasquez b
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
public class AdmRepresentanteTest {

	@Test
	public void siIngresoDatosDeberiaRegistarRepresentante() throws  MensajeException{
		//Preparamos el ejemplo
		String tipoDocumento = "DNI";
		String nroDocumento = "40341631";
		String nombre = "JOSE";
		String apellido = "VASQUEZ BUSTAMANTE";
		String cargoEnLaEmpresa = "ABOGADO";
		String grupoBastanteo = "A"; //A,B,C	
		
		AdmRepresentante adm = new AdmRepresentante();
		
		//ejecutar
		adm.registrarRepresentante(tipoDocumento,nroDocumento,nombre,apellido,cargoEnLaEmpresa,grupoBastanteo);
		
		Representante representante =  adm.buscarRepresentante(tipoDocumento,nroDocumento);
		//Verificar
		assertNotNull(representante);
	}	
	
	    //Este test expera que haya una exception de tipo....
		@Test(expected=MensajeException.class)
		public void deberiaValidarDatosRequeridos() throws  MensajeException{
			//prepara el ejemplo
			String tipoDocumento = "";
			String nroDocumento = "40341631";
			String nombre = "JOSE";
			String apellido = "VASQUEZ BUSTAMANTE";
			String cargoEnLaEmpresa = "ABOGADO";
			String grupoBastanteo = "A"; //A,B,C	
			
			AdmRepresentante adm = new AdmRepresentante();
			
			//ejecutar
			adm.registrarRepresentante(tipoDocumento,nroDocumento,nombre,apellido,cargoEnLaEmpresa,grupoBastanteo);
			assertNotNull(adm);
			
		}
		
		@Test(expected=MensajeException.class)
		public void noDeberiaRegistarClienteDuplicados() throws  MensajeException{
			//preparar el ejemplo
			String tipoDocumento = "DNI";
			String nroDocumento = "40341631";
			String nombre = "JOSE";
			String apellido = "VASQUEZ BUSTAMANTE";
			String cargoEnLaEmpresa = "ABOGADO";
			String grupoBastanteo = "A"; //A,B,C	
			
			AdmRepresentante adm = new AdmRepresentante();
			
			//ejecutar
			//El primero se ejecuta sin problemas
			adm.registrarRepresentante(tipoDocumento,nroDocumento,nombre,apellido,cargoEnLaEmpresa,grupoBastanteo);
	    	//El segundo debe de arrojar una excepcion
			adm.registrarRepresentante(tipoDocumento,nroDocumento,nombre,apellido,cargoEnLaEmpresa,grupoBastanteo);
			
		}
		
}
