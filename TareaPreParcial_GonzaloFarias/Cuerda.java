package TareaPreparcial;

public class Cuerda extends Instrumento {

	Cuerda(String nombre, double precio, boolean esMetalico) {
		super(nombre, precio, esMetalico);
		this.nombre = nombre;
		this.esMetalico = esMetalico;
		this.precio = precio;
	}

	@Override
	public void afinar() {
		System.out.println("*Sonido cuerda*");
	}

	@Override
	public String queInstrumentoEres() {
		return "Instrumento Cuerda";
	}
}
