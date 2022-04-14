package EjEntregable;

public class TestFacturaMain {

	public static void main(String[] args) {
		Producto[] p1 = { new Producto(165115, "Monster", 120), new Producto(15615, "Vodka", 600),
				new Producto(1516, "Baggio", 150), new Producto(10456, "Helado", 900), new Producto(45445,"Doritos",110), new Producto(5646,"Hamburger",250) };
		Factura f = new Factura();
		f.agregarProductos(p1);
		Producto i = f.retornarProductoEnLaPosicion(2);
		System.out.println("Precio producto en posicion indicada por parámetro: "+i.getPrecioUnitario());
		System.out.println("Precio promedio: "+f.calcularPrecioPromedio());
		System.out.println("Precio total: "+f.precioTotal());
		Producto[] array = new Producto[f.arrayProductos(200).length];
		array = f.arrayProductos(200);
		System.out.println("-------------------------------------------\nLista de productos con precio unitario mayor o igual al indicado por parámetro:");
		for (int j = 0; j < array.length; j++) {
			System.out.println("Precio producto número "+j+" "+array[j].getPrecioUnitario());
		}
	}
}
