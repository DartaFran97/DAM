package ejercicio_3_ProfesorEnfermo;

public class ProfesorEnfermo extends Profesor {
	
	public ProfesorEnfermo(String despacho,String HorarioTutorias) {
	super(despacho, HorarioTutorias);
	
	}
	@Override
	public String getConsultas(String despacho, String HorarioTutorias){
		String consultas;
		consultas = "esta enfermo y se suependen las consultas";
		return consultas;
	}
}

