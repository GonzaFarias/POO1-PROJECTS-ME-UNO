package ejercicio2;

public class Cuadrante implements Comparable<Cuadrante> {

	private Integer cuadrante;
	
	public Cuadrante(int cuadrante) {
		this.cuadrante = cuadrante;
	}
	
	public int getCuadrante() {
		return this.cuadrante;
	}

	@Override
	public String toString() {
		return "Cuadrante [cuadrante=" + cuadrante + "]";
	}

	@Override
	public int compareTo(Cuadrante o) {
		return this.cuadrante.compareTo(o.cuadrante);
	}
	
	
}
