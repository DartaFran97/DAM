package Padel;

		public class Jugador {
					
			private String nombre;
			private String lado;
			private int ranking;
			private int altura;
			private int peso;
			private boolean rematador;
			
			
		public Jugador() {}
		
		public Jugador(String nombre,String lado,int ranking,int altura,int peso,boolean rematador){
			this.nombre=nombre;
			this.lado=lado;
			this.ranking=ranking;
			this.altura=altura;
			this.peso=peso;
			this.rematador=rematador;		
		}
		public Jugador(String nombre,String lado,boolean rematador){
			this.nombre=nombre;
			this.lado=lado;
			this.rematador=rematador;
		}

		//getters
		public String getNombre() {
			return this.nombre;
		}
		public String getLado() {
			return this.lado;
		}
		public int getRanking() {
			return this.ranking;
		}
		public int getaltura() {
			return this.altura;
		}
		public int getPeso() {
			return this.peso;
		}
		public boolean getRematador(){
			return this.rematador;
		}
		//setters
		
		public void setNombre(String nombre) {
			this.nombre=nombre;
		}
		public void setLado(String lado) {
			this.lado=lado;
			
		}
		public void setRanking(int ranking) {
			this.ranking=ranking;
		}
		public void setAltura(int altura) {
			this.altura=altura;
		}
		public void setPeso(int peso) {
			this.peso=peso;
		}
		public void setRematador(boolean rematador) {
			this.rematador=rematador;
		}
		
		
}
			
		

