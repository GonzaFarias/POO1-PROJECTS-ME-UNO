package EjEntregable;

public class Factura {

	private int max = 25, num, total;
	private Producto[] producto;

	public Factura() {

	}

	public double calcularPrecioPromedio() {
		return precioTotal() / this.producto.length;
	}

	public Producto[] arrayProductos(double precioUnitario) {
		int[] indice = new int[this.producto.length];
		int ultimoIndice = 0;
		for (int x = 0; x < this.producto.length; x++) {
			if (this.producto[x].getPrecioUnitario() >= precioUnitario) {
				indice[ultimoIndice] = x;
				ultimoIndice++;
			}
		}
		Producto[] lista = new Producto[ultimoIndice];
		for (int i = 0; i < ultimoIndice; i++) {
			lista[i] = this.producto[indice[i]];
		}
		return lista;
	}

	public Producto retornarProductoEnLaPosicion(int posicion) {
		return producto[posicion];
	}

	public double precioTotal() {
		for (int x = 0; x < this.producto.length; x++) {
			total += this.producto[x].getPrecioUnitario();
		}
		return total;
	}

	public void agregarProductos(Producto[] producto) {
		this.producto = new Producto[producto.length];
		for (int x = 0; x < producto.length; x++) {
			if (x < max) {
				this.producto[x] = new Producto(0, "", 0);
			}
			if (num < max) {
				this.producto[num] = new Producto(producto[num].getSku(), producto[num].getNombre(),
						producto[num].getPrecioUnitario());
				num++;
			}
			else throw new Error("Máximo de productos alcanzado, es 25");
		}

	}
}
