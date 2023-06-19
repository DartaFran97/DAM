package Padel;

public class Pala {
		
	private String modelo;
	private String marca;
	private String forma;
	private boolean carbono;
	private int pesoPala;
	private Jugador[] patrocinados;
	
	
	public Pala() {}
	
	public Pala(String modelo,String marca,String forma,boolean carbono,int pesoPala,Jugador[] patrocinados) {
		this.modelo=modelo;
		this.marca=marca;
		this.forma=forma;
		this.carbono=carbono;
		this.pesoPala=pesoPala;
		this.patrocinados=patrocinados;
		
	}
	//GETTERS
	public String getModelo() {
		return this.modelo;
	}
	public String getMarca() {
		return this.marca;
	}
	public String getForma() {
		return this.forma;
	}
	public boolean getCarbono() {
		return this.carbono;
	}
	public int getPesoPala() {
		return this.pesoPala;
	}
	public Jugador[] getPatrocinados() {
		return this.patrocinados;
	}
	//SETTERS
	
	public void setModelo(String modelo) {
		this.modelo=modelo;
	}
	public void setMarca(String marca) {
		this.marca=marca;
	}
	public void setForma(String forma) {
		this.forma=forma;
	}
	public void setCarbono(boolean carbono) {
		this.carbono=carbono;
	}
	public void setPesoPala(int pesoPala) {
		this.pesoPala=pesoPala;
	}
	public void setPatrocinados(Jugador[] patrocinados) {
		this.patrocinados=patrocinados;
	}
	
	//metodos
	
	public int totalJugadoreDerecha(Jugador[]patrocinados,String lado,Jugador player) {
		int contadorDerecha=0;
	 for (int i=0; i<patrocinados.length;i++) {
		lado=player.getLado();
		if (lado.equals("derecha")) {
			contadorDerecha++;
		}
	 }
	 return contadorDerecha;
	}
	public int totalrematador(Jugador[]patrocinados,boolean rematador,Jugador player) {
		int contadorJugadores=0;
		 for (int i=0; i<patrocinados.length;i++) {
		rematador=player.getRematador();
				if (rematador=true){
					contadorJugadores++;
				}
		}
		return contadorJugadores;
	}
	
	
	
	
	
}
