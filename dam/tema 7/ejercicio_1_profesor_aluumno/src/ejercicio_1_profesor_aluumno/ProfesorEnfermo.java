package ejercicio_1_profesor_aluumno;

public class ProfesorEnfermo extends Profesor{
	
		
	public ProfesorEnfermo(String despacho,String HorarioTutorias) {
	super(despacho, HorarioTutorias);
	}
		@Override
	public String getConsultas(String despacho, String horarios){
			String consulta;
			consulta = "esta enfermo y se suependen las consultas";
			return consulta;
	}
}


