package ejercicio4;

public class Desarrollador {

	private int legajo;
	private String nombre;
	private double sueldo;
	private Seniority sr;
	
	
	public Desarrollador(int legajo, String nombre, double sueldo, Seniority sr) {
		
		this.legajo=legajo;
		this.nombre=nombre;
		this.sr = sr;
		this.sueldo = sueldo;
		
	}

	@Override
	public String toString() {
		return "Desarrollador [legajo=" + legajo + ", nombre=" + nombre + ", sueldo=" + sueldo + ", Calificacion=" + sr + "]";
	}

	public double getSueldo() {
		return sueldo;
	}


	public Seniority getSr() {
		return sr;
	}

	
	
}