package aplicacion;
import presentacion.InterfazUsuario;
public class Principal{
	public static void main(String[] args){ 
		String[] instr;
		boolean continuar;
		InterfazUsuario iu=new InterfazUsuario();
		do{
			instr=iu.leerInstruccion();
			continuar=iu.ejecutar(instr);
		}while (continuar);	
	}
}
