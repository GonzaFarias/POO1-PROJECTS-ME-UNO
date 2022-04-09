package Supermercado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SupermercadoTest {

	private Supermercado superm;
	
	@BeforeEach
	public void setupUp() {
		superm = new Supermercado();
	}
	@Test
	public void verificarColaANoVacia() {
		superm.agregarClienteColaA(new Cliente(4));
		assertEquals(false,superm.isVacioColaA());
	}
	@Test
	public void verificarColaAConUnCliente() {
		 superm.agregarClienteColaA(new Cliente(4));
		 assertEquals(1, superm.getCantidadClientesColaA());
	}
	@Test
	public void verificarColaAConDosCliente() {
		 superm.agregarClienteColaA(new Cliente(10));
		 superm.agregarClienteColaA(new Cliente(9));

		 assertEquals(2, superm.getCantidadClientesColaA());
	}
	@Test
	public void verificarColaA() {
		 superm.agregarClienteColaA(new Cliente(10));
		 superm.agregarClienteColaA(new Cliente(9));

		 assertEquals("[1 = 10][2 = 9]", superm.getColaAAsString());
	}
	@Test
	public void verificarColaBVacia() {
		 superm.abrirColaB();
		 assertEquals("", superm.getColaBAsString());
	}
	@Test
	public void verificarReorganizacionCola() {
		 superm.agregarClienteColaA(new Cliente(10));
		 superm.agregarClienteColaA(new Cliente(9));
		 superm.agregarClienteColaA(new Cliente(10));
		 superm.agregarClienteColaA(new Cliente(2));
		 superm.agregarClienteColaA(new Cliente(4));
		 superm.agregarClienteColaA(new Cliente(5));
		 assertEquals("[1 = 10][2 = 9][3 = 10][4 = 2][5 = 4][6 = 5]", superm.getColaAAsString());
		 superm.reorganizarColas();
		 assertEquals("[1 = 2][2 = 4]", superm.getColaBAsString());
		 assertEquals("[1 = 10][2 = 9][3 = 10][4 = 5]", superm.getColaBAsString());

	}
}
