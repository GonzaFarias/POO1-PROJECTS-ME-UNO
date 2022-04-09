package TareaPreparcial;

public class Percusion extends Instrumento{

	Percusion(String nombre, double precio, boolean esMetalico) {
		super(nombre, precio, esMetalico);
		this.nombre=nombre;
		this.esMetalico=esMetalico;
		this.precio=precio;	}

	@Override
	public void afinar() {
		System.out.println("*Sonido percusion*");
	}

}
