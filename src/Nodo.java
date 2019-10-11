
public class Nodo {

	private int dato;
	private Nodo enlace;
	
	public Nodo() {}
	public Nodo(int dato) {
		this.dato = dato;
	}
	public Nodo(int dato, Nodo enlace) {
		this.dato = dato;
		this.enlace = enlace;
	}
	
	public int getDato() {
		return dato;
	}
	public void setDato(int dato) {
		this.dato = dato;
	}
	public Nodo getEnlace() {
		return enlace;
	}
	public void setEnlace(Nodo enlace) {
		this.enlace = enlace;
	}
	@Override
	public String toString() {
		return "Nodo [dato=" + dato + ", enlace=" + enlace + "]";
	}
}
