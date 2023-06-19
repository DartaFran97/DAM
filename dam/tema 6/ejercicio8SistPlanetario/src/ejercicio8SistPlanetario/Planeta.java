package ejercicio8SistPlanetario;

public class Planeta {

	private double masa;
	private double diametro;
	private double distanciaSol;
	private int idPlaneta;
	private String nombre;
	private Luna[] lunas;
	
	public Planeta(double masa, double diametro, double distanciaSol, int idPlaneta, String nombre, Luna[] lunas) {
		super();
		this.masa = masa;
		this.diametro = diametro;
		this.distanciaSol = distanciaSol;
		this.idPlaneta = idPlaneta;
		this.nombre = nombre;
		this.lunas = lunas;
	}

	public double getMasa() {
		return masa;
	}

	public void setMasa(double masa) {
		this.masa = masa;
	}

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

	public double getDistanciaSol() {
		return distanciaSol;
	}

	public void setDistanciaSol(double distanciaSol) {
		this.distanciaSol = distanciaSol;
	}

	public int getIdPlaneta() {
		return idPlaneta;
	}

	public void setIdPlaneta(int idPlaneta) {
		this.idPlaneta = idPlaneta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Luna[] getLunas() {
		return lunas;
	}

	public void setLunas(Luna[] lunas) {
		this.lunas = lunas;
	}
	
	
}
