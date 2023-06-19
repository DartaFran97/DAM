package ejercicio_6_poligonos;

public class Rectangulo extends Poligono {
	
	private double lado1;
	private double lado2;
	
	public Rectangulo(double lado1, double lado2, int numeroLados) {
		super(numeroLados);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	@Override
	public double Perimetro() {
		double perimetro=(lado1+lado2)*2;
		return perimetro;
	}
	@Override
	public String toString() {
		return "rectangulo con lados "+getNumeroLados()+" iguales dos a dos y que miden " + getLado1() +" "+ getLado2()  +" con un  Perimetro " + Perimetro();
	}
	
}
