package EjEntregable;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestFactura {

	Factura f;

	@Before
	public void setUp() throws Exception {
		f = new Factura();
	}

	@Test
	public void creoFacturaYProductosTest() {
		Producto[] p1 = { new Producto(165115, "Monster", 120), new Producto(15615, "Vodka", 600),
				new Producto(1516, "Baggio", 150), new Producto(10456, "Helado", 900),
				new Producto(45445, "Doritos", 110), new Producto(5646, "Hamburger", 250) };
		assertNotNull(p1);
		assertNotNull(f);
	}

	@Test
	public void calcularPromedioTest() {
		Producto[] p2 = { new Producto(1, "Monster", 5), new Producto(2, "Speed", 5) };
		f.agregarProductos(p2);
		double obtenido = f.calcularPrecioPromedio();
		double esperado = 5;
		assertEquals(obtenido, esperado, 00.1);
	}

	@Test
	public void arrayProductosPrecioMayorIgual() {
		Producto[] p3 = { new Producto(1, "Maruchan", 10), new Producto(2, "Cheeto", 15) };
		f.agregarProductos(p3);
		Producto[] array = new Producto[f.arrayProductos(5).length];
		array = f.arrayProductos(5);
		assertEquals(array.length, p3.length, 000.1);

	}

	@Test
	public void precioTotalTest() {
		Producto[] p4 = { new Producto(1, "Maruchan", 10), new Producto(2, "Cheeto", 15) };
		f.agregarProductos(p4);
		double obtenido = f.precioTotal();
		double esperado = 25;
		assertEquals(obtenido, esperado, 00.1);
	}

	@Test
	public void productoEnPosicionTest() {
		Producto[] p5 = { new Producto(1, "Maruchan", 10), new Producto(2, "Cheeto", 15) };
		f.agregarProductos(p5);
		Producto x = f.retornarProductoEnLaPosicion(1);
		String obtenido = x.getNombre();
		String esperado = "Cheeto";
		assertEquals(esperado, obtenido);
	}

	@Test(expected = Error.class)
	public void productosSuperadosTest() { // Más de 25 productos.
		Producto[] p6 = { new Producto(165115, "Monster", 120), new Producto(15615, "Vodka", 600),
				new Producto(1516, "Baggio", 150), new Producto(10456, "Helado", 900),
				new Producto(45445, "Doritos", 110), new Producto(5646, "Hamburger", 250),
				new Producto(165115, "Monster", 120), new Producto(15615, "Vodka", 600),
				new Producto(1516, "Baggio", 150), new Producto(10456, "Helado", 900),
				new Producto(45445, "Doritos", 110), new Producto(5646, "Hamburger", 250),
				new Producto(165115, "Monster", 120), new Producto(15615, "Vodka", 600),
				new Producto(1516, "Baggio", 150), new Producto(10456, "Helado", 900),
				new Producto(45445, "Doritos", 110), new Producto(5646, "Hamburger", 250),
				new Producto(165115, "Monster", 120), new Producto(15615, "Vodka", 600),
				new Producto(1516, "Baggio", 150), new Producto(10456, "Helado", 900),
				new Producto(45445, "Doritos", 110), new Producto(5646, "Hamburger", 250),
				new Producto(1516, "Baggio", 150), new Producto(10456, "Helado", 900),
				new Producto(45445, "Doritos", 110), new Producto(5646, "Hamburger", 250) };
		f.agregarProductos(p6);
	}
}
