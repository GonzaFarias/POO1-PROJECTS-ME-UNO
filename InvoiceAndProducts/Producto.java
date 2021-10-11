package EjEntregable;

public class Producto {

	private int sku;
	private String nombre;
	private double precioUnitario;

	public Producto(int sku, String nombre, double precioUnitario) {
		this.nombre = nombre;
		this.precioUnitario = precioUnitario;
		this.sku = sku;
	}

	public int getSku() {
		return sku;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}
}
