package ejercicio2Cuenta;

public class Cuenta {
	
	private String nombreCliente;
	private String numeroCuenta;
	private double tipoInteres;
	private double saldo;
	
	//CONTRUCTORES
	public Cuenta() {}

	public Cuenta(String cliente, String cuenta, double interes, double saldo) {
		this.nombreCliente=cliente;
		this.numeroCuenta=cuenta;
		this.tipoInteres=interes;
		this.saldo=saldo;
	}
	//GETTERS
	
	public String getnombreCliente() {
		return this.nombreCliente;
	}
	public String getnumeroCuenta() {
		return this.numeroCuenta;
	}
	public double gettipoInteres () {
		return this.tipoInteres;
	}
	public double getsaldo() {
		return this.saldo;
	}

	//SETTERS
	
	public void setnombreCliente(String cliente) {
		this.nombreCliente=cliente;
	}
	public void setnumeroCuenta(String cuenta){
		this.numeroCuenta=cuenta;
	}
	public void settipoInteres (double interes) {
		this.tipoInteres=interes;
	}
	public void setsaldo(double saldo) {
		this.saldo=saldo;
	}
	//METODOS 
	
	public boolean ingreso(double dinero) {
		boolean resultado= false;
		if(dinero>0) {
			saldo+=dinero;
			resultado=true;
		}else {
			resultado=false;
		}
		return resultado;
	}
	public boolean reintegro(double dinero) {
		boolean resultado=false;
		if (dinero>0&&saldo>=dinero) {
			saldo-=dinero;
			resultado=true;
		}else {
			resultado=false;
		}
		return resultado;
	}
	public boolean transferencia( Cuenta b, double transferencia) {
		
		if (b.ingreso(saldo)&& reintegro(saldo)){
				return true;
		}else {
			return false;
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
}







	
