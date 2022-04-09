package TareaPreparcial;

public class Viento extends Instrumento{

	Viento(String nombre, double precio, boolean esMetalico) {
		super(nombre, precio, esMetalico);
		this.nombre=nombre;
		this.esMetalico=esMetalico;
		this.precio=precio;
	}

	@Override
	public void afinar() {
		System.out.println("*Sonido viento*");
	}
	public boolean esDeMetal() {
		return this.esMetalico;
	}

}
